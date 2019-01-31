
public class Employee 
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	private int empId;
	private String empName;
	private float empSal;
	private Date empDOJ;
	private Address empAddr;
	
	public Employee()
	{
		empId=0;
		empName=null;
		empSal=0.0F;
		empDOJ=new Date();
		empAddr=new Address();
	}
	public Employee(int empId,String empName,float empSal,Date empDOJ,Address empAddr)
	{
		this.empId=empId;
		this.empName=empName;
		this.empSal=empSal;
		this.empDOJ=empDOJ;
		this.empAddr=empAddr;
	}
	public String dispEmpInfo()
	{
		return"[ ID :"+empId+ " Name :"+empName+" Salary :"+empSal+" Date of Join :"+empDOJ.displayDate()+"\n CITY :"+empAddr.getCity()+"\n STATE :"+empAddr.getState()+"\n landmark :"+empAddr.getLandmark()+"\n Country :"+empAddr.getCountry()+"\n Zipcode :"+empAddr.getZipcode()+"]";
	}
	public float calcAnnualSal()
	{
		return empSal*12;
	}
}
