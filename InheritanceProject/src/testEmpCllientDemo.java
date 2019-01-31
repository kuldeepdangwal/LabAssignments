
public class testEmpCllientDemo 
{
	public static void main(String args[])
	{
		Employee rishab=new Employee(333,"risabh",60000.0F);
		
		WageEmp shivam=new WageEmp(444,"shivam",40000.0F,5);
		SalesManager nitish=new SalesManager(444,"shivam",40000.0F,5,200,50);
		System.out.println(rishab.disEmpInfo()+
						   "Monthly salary : "+rishab.calcEmpMonSal()+
						   "Annual salary : "+rishab.calcEmpAnnualSal() );
		System.out.println(shivam.disEmpInfo()+
				   "Monthly salary : "+shivam.calcEmpMonSal()+
				   "Annual salary : "+shivam.calcEmpAnnualSal() );
		
		System.out.println(nitish.disEmpInfo()+
				   "Monthly salary : "+nitish.calcSaleEmpMonSal()+
				   "Annual salary : "+nitish. calcSaleEmpAnnualSal() );
	
		
	}
}
