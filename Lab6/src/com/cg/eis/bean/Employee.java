package com.cg.eis.bean;
import com.cg.eis.exception.EmployeeException;
public class Employee 
{
	
	int empId;
	String empName;
	double empSalary;
	String empDesignation;
	String insuranceScheme;
	public Employee()
	{
		
	}
	public Employee(int empId, String empName, double empSalary,
			String empDesignation, String insuranceScheme) 
	{
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
		this.empDesignation = empDesignation;
		this.insuranceScheme = insuranceScheme;
	}
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(double empSalary) 
	{
		EmployeeException  checkSal=new EmployeeException();
		if(checkSal.checkException(empSalary)==0)
			this.empSalary = empSalary;
		else
			this.empSalary = empSalary;
	}
	public String getEmpDesignation() {
		return empDesignation;
	}
	public void setEmpDesignation(String empDesignation) {
		this.empDesignation = empDesignation;
	}
	public String getInsuranceScheme() {
		return insuranceScheme;
	}
	public void setInsuranceScheme(String insuranceScheme) {
		this.insuranceScheme = insuranceScheme;
	}
	
	public String EmpInfo() {
		return "Employee [empId=" + empId + ", empName=" + empName
				+ ", empSalary=" + empSalary + ", empDesignation="
				+ empDesignation ;
	}
	
}
