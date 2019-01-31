package com.cg.payroll.services;

import java.util.List;

import com.cg.payroll.beans.Associate;
import com.cg.payroll.exception.AssociateDetailNotfoundException;

public class PayrollServicesImpl implements PayrollServices{
	@Override
	public int acceptAssociateDetails(String firstName, String lastName, String emailId, String department,
			String designation, String pancard, int yearlyInvestmentUnder8oC, int basicSalary, int epf, int companyPf,
			int accountNumber, String bankName, String ifscCode) {
		return 0;
	}
	@Override
	public int calculateNetSalary(int accociateId) throws AssociateDetailNotfoundException {
		return 0;
	}
	@Override
	public Associate getAssociateDetails(int accociateId) throws AssociateDetailNotfoundException {
		return null;
	}
	@Override
	public List<Associate> getAllAssociatesDetails() {
		return null;
	}
}
