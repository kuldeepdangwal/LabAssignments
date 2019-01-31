

public class Employee 
{
	int empId;
	String empName;
	double empSalary;
	
	public Employee()
	{
		super();
	}
	public Employee(int empId,String empName,double empSalary)
	{
		this();
		this.empId=empId;
		this.empName=empName;
		this.empSalary=empSalary;
	}
	
	
	public double calcEmpMonSal()
	{
		return empSalary;
	}
	
	public double calcEmpAnnualSal()
	{
		return empSalary*12;
	}
	
	public String toString() 
	{
		return "Employee [empId=" + empId + ", empName=" + empName
				+ ", empSalary=" + empSalary + "]";
	}
	@Override
	public boolean equals(Object emp)
	{
		Employee tempE=(Employee) emp;
		if(this.empId==tempE.empId)
			return true;
		else
			return false;
	}
	public int hashCode()
	{
		return empId;
	}
	
}
