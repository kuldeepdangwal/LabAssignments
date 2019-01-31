package com.cg.payroll.services;
import com.cg.payroll.exception.*;
import com.cg.payroll.beans.Associate;
import java.util.List;


public interface PayrollServices {
	int acceptAssociateDetails(String firstName,String lastName,String emailId,String department,String designation,
			String pancard,int yearlyInvestmentUnder8oC,int basicSalary,int epf,int companyPf,int accountNumber,
			String bankName,String ifscCode);
	int calculateNetSalary(int accociateId)throws AssociateDetailNotfoundException;
	Associate getAssociateDetails(int accociateId)throws AssociateDetailNotfoundException;
	
	List<Associate> getAllAssociatesDetails();
}
