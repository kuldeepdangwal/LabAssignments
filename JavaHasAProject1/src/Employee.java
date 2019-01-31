
public class Employee 
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	private int empId;
	private String empName;
	private float empSal;
	private Date empDOJ;
	
	public Employee()
	{
		empId=0;
		empName=null;
		empSal=0.0F;
		empDOJ=new Date();
	}
	public Employee(int empId,String empName,float empSal,Date empDOJ)
	{
		this.empId=empId;
		this.empName=empName;
		this.empSal=empSal;
		this.empDOJ=empDOJ;
	}
	public String dispEmpInfo()
	{
		return"[ ID :"+empId+ " Name :"+empName+" Salary :"+empSal+" Date of Join :"+empDOJ.displayDate()+"]";
	}
	public float calcAnnualSal()
	{
		return empSal*12;
	}
}
