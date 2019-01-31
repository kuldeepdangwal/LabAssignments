
public class Employee 
{
	int empId;
	String empName;
	float empBasicSal;
	public Employee()
	{
		empId=0;
		empName="";
		empBasicSal=0.0f;
	}
	public Employee(int empId,String empName,float empBasicSal)
	{
		this.empId=empId;
		this.empName=empName;
		this.empBasicSal=empBasicSal;
	}
	public String disEmpInfo()
	{
		return "Employee [empId="+empId+",empName="+empName+",empBasicSal="+empBasicSal+"]";
	}
	public float calcEmpMonSal()
	{
		return empBasicSal;
	}
	public float calcEmpAnnualSal()
	{
		return empBasicSal*12;
	}
	
}
