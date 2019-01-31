
public class WageEmp extends Employee
{
	static
	{
		ratePerHour=500;
	}
	int noOfHours;
	static int ratePerHour;
	public WageEmp() {}
	public WageEmp(int empId,String empName,float empBasicSal,int noOfHours)
	{
		this.empId=empId;
		this.empName=empName;
		this.empBasicSal=empBasicSal;
		this.noOfHours=noOfHours;
	}
	public String disWageEmpInfo()
	{
		return "WageEmp ["+super.disEmpInfo()+" noOfHours="+noOfHours+"]";
	}
	public float calcWageMonSal()
	{
		return empBasicSal+(noOfHours*ratePerHour*20);
	}
	public float calcWageAnnualSal()
	{
		return (empBasicSal+(noOfHours*ratePerHour*20))*12;
	}
}
