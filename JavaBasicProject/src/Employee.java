import java.util.Scanner;


public class Employee 
{
	int empId;
	String empName;
	double empSalary;
	char gender;
	public Employee()
	{
		empId=0;
		empName="";
		empSalary=0.00;
		gender=0;
	}
	public Employee(int empId,String empName,double empSalary,char gender)
	{
		this();
		this.empId=empId;
		this.empName=empName;
		this.empSalary=empSalary;
		this.gender=gender;
	}
	void disEmp()
	{
		System.out.print("EMPID : "+empId+" ");
		System.out.print("EMPNAME : "+empName+" ");
		System.out.print("EMPSALARY : "+empSalary+" ");
		System.out.println("GENDER : "+gender);
	}
	
}
