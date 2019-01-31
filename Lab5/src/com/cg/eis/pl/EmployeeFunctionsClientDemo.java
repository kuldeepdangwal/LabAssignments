package com.cg.eis.pl;
import com.cg.eis.bean.Employee;
import com.cg.eis.service.EmployeeServiceImplmentation;

import java.util.Scanner;

public class EmployeeFunctionsClientDemo 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter employee name");
		String empName=sc.nextLine();
		System.out.println("Enter employee id");
		int empId=sc.nextInt();
		System.out.println("Enter employee designation");
		String empDesig=sc.next();
		System.out.println("Enter employee Salary");
		double empSal=sc.nextDouble();
		
		Employee emp1=new Employee();
		emp1.setEmpName(empName);
		emp1.setEmpId(empId);
		emp1.setEmpDesignation(empDesig);
		emp1.setEmpSalary(empSal);
		
		EmployeeServiceImplmentation empServices=new EmployeeServiceImplmentation();
		System.out.print(emp1.EmpInfo());
		System.out.print(", insuranceScheme=");
		empServices.findEmpIns(emp1.getEmpSalary(),emp1.getEmpDesignation());
		
		
		
	}
}
