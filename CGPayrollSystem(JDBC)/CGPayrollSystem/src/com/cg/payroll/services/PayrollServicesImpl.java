package com.cg.payroll.services;

import java.util.List;

import com.cg.payroll.beans.Associate;
import com.cg.payroll.beans.BankDetails;
import com.cg.payroll.beans.Salary;
import com.cg.payroll.daoservices.AssociateDAO;
import com.cg.payroll.daoservices.AssociateDAOImpl;
import com.cg.payroll.exception.AssociateDetailNotfoundException;

public class PayrollServicesImpl implements PayrollServices {

	private AssociateDAO associateDAO  ;
	
	public  PayrollServicesImpl() {
		associateDAO = new AssociateDAOImpl();
	}
	
	public PayrollServicesImpl(AssociateDAO associateDAO) {
		super();
		this.associateDAO = associateDAO;
	}

	@Override
	public int acceptAssociateDetails(String firstName, String lastName, String emailId, String department,
			String designation, String panCard, int yearlyInvestmentUnder80C, int basicSalary, int epf, int companyPf,
			int accountNumber, String bankName, String ifscCode) {

		Associate associate = new Associate(yearlyInvestmentUnder80C, firstName , lastName , department , designation, panCard , emailId  , new Salary(basicSalary ,epf, companyPf), new BankDetails(accountNumber, bankName, ifscCode));
		associate = associateDAO.save(associate);
		return associate.getAssociateId();


	}
 
	@Override
	public int calculateNetSalary(int associateId) throws AssociateDetailNotfoundException {
		Associate associate = associateDAO.findOne(associateId);
		int netSalary =0 ;
		if(associate==null) {
			throw new AssociateDetailNotfoundException("Associate details not found for Id" + associateId);
		}
		else {
			
			int basicSalary = associate.getSalary().getBasicSalary() ;
			int monthlyGrossSalary = (int)(basicSalary + (basicSalary*0.7));
			int annualGrossSalary = 12 * monthlyGrossSalary; 
			int investment = associate.getYearlyInvestmentUnder80C() + associate.getSalary().getEpf() + associate.getSalary().getCompanyPf() ; 
			if(investment >=150000) {
				investment = 150000;
			}
			//int taxableAmount = annualGrossSalary - associate.getSalary().getEpf() - associate.getSalary().getCompanyPf() ; 
			if(annualGrossSalary<250000) {
				 netSalary = annualGrossSalary - associate.getSalary().getEpf() - associate.getSalary().getCompanyPf() ;
			}
			else if(annualGrossSalary>=250000 && annualGrossSalary<500000){
				 netSalary = (int) (annualGrossSalary - (( annualGrossSalary - investment ) * 0.1 ) - associate.getSalary().getEpf() - associate.getSalary().getCompanyPf());
			}
			else if(annualGrossSalary>=500000 && annualGrossSalary < 1000000) {
				int tax2 = (int) ((annualGrossSalary - 500000) * 0.2);
				int tax1 =  (int) ((250000 - investment)*0.1);
				 netSalary = annualGrossSalary - tax1 - tax2 - associate.getSalary().getEpf() - associate.getSalary().getCompanyPf();
			}
			else if(annualGrossSalary>=1000000) {
				int tax3 = (int) ((annualGrossSalary - 1000000 ) *0.3);
				int tax2 = 100000;
				int tax1  = (int) ((250000 - investment) * 0.1);
				netSalary = annualGrossSalary - tax1 - tax2 - tax3 - associate.getSalary().getEpf() - associate.getSalary().getCompanyPf();
			}
			return netSalary;
		}   
			
	}

	@Override
	public Associate getAssociateDetails(int associateId) throws AssociateDetailNotfoundException {
		Associate associate = associateDAO.findOne(associateId);
		if(associate==null)
			throw new AssociateDetailNotfoundException("Associate details not found for Id" + associateId);
		return associate;
	}

	@Override
	public List<Associate> getAllAssociatesDetails() {
		return associateDAO.findAll();
	}


}

