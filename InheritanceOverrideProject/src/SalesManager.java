
public class SalesManager extends WageEmp
{
	double sales;
	double comission;
	public SalesManager() 
	{}
	public SalesManager(int empId,String empName,float empBasicSal,int noOfHours,double sales,double comission)
	{
		this.empId=empId;
		this.empName=empName;
		this.empBasicSal=empBasicSal;
		this.noOfHours=noOfHours;
		this.sales=sales;
		this.comission=comission;
	}
	public String disSalesEmpInfo()
	{
		return "Sales ["+super.disEmpInfo()+"Sales : "+sales+"Comission :"+comission+"]";
	}
	public double calcSaleEmpMonSal()
	{
		return empBasicSal+(noOfHours*ratePerHour*20)+(sales*comission/10);
	}
	public double calcSaleEmpAnnualSal()
	{
		return calcSaleEmpMonSal()*12;
	}
	public String disEmpInfo()
	{
		return "OVERRIDE Employee [empId="+empId+",empName="+empName+",empBasicSal="+empBasicSal+"]";
	}
}
