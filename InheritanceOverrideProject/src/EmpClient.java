
public class EmpClient 
{
	public static void main(String args[])
	{
		Employee e1=null;
		e1=new Employee(333,"vivek",3000.0f);
		
		System.out.println(e1.disEmpInfo() );
		System.out.println(e1.calcEmpMonSal() );
		System.out.println(e1.calcEmpAnnualSal() );
		
		//System.out.println(*----------------* );
		
		WageEmp e2=null;
		e2=new WageEmp(444,"Shyam",4000.0F,4);
		
		//System.out.println(*----------------* );
		
		Employee e3=null;
		e3=new WageEmp(555,"lavanya",7000,8);
		System.out.println(e3.disEmpInfo() );
		System.out.println(e3.calcEmpMonSal() );
		System.out.println(e3.calcEmpAnnualSal() );
		
		
		
	}
}
