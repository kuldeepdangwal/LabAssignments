package com.cg.eis.service;
import com.cg.eis.bean.Employee;

public class EmployeeServiceImplmentation implements EmployeeService
{
	Employee e1=new Employee();
	@Override
	public void findEmpIns(double salary,String designation)
	{
		if(salary<5000 && designation.equals("Clerk"))
			System.out.println("No Scheme]"); 
		else if(salary>5000 && salary<2000 && designation.equals("System Associate"))
			System.out.println("C]");
		else if(salary>=20000 && salary<40000 && designation.equals("Programmer"))
			System.out.println("B]");
		else if(salary>=40000 && designation.equals("Manager"))
			System.out.println("A]");
	}
	@Override
	public double findEmpTax(double salary)
	{
		if(salary<=5000)
			return 0.05*salary;
		else if(salary>5000 && salary<2000)
			return 0.08*salary;
		else if(salary>=20000 && salary<40000)
			return 0.10*salary;
		else
			return 0.20*salary;
		
	}
	@Override
	public int findEmpAge(int empId)
	{
		if(empId<100)
		{
			return 50;
		}
		else if(empId>=100 && empId<=200 )
			return 30;
		else
			return 10;
	}
}
