package com.cg.employee.beans;

public class MainClass {
public static void main(String args[])
{
	Employee emp1=new Employee();
	Employee emp2=new Employee();
	Object emp3=emp2;
	
	emp1.setEmpId(111);
	emp1.setEmpSal(1000);
	emp1.setFirstName("Nitish");
	emp1.setLastName("Agarwal");
	
	emp2.setEmpId(111);
	emp2.setEmpSal(1000);
	emp2.setFirstName("Nitish");
	emp2.setLastName("Agarwal");
	
	System.out.println(emp1);
	System.out.println(emp2);
	System.out.println(emp3);
	
	if(emp1.equals(emp2))
		System.out.println("emp1 equls emp2");
	if(emp1.equals(emp3))
		System.out.println("emp1 equls emp3");
	else
		System.out.println("not same");
	
}
}
