import java.util.Scanner;


public class TestEmpClient 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter emp id");
		int eId=sc.nextInt();
		System.out.println("Enter emp Name");
		String name=sc.next();
		System.out.println("Enter emp Salary");
		float sal=sc.nextFloat();
		System.out.println("Enter Day of joining");
		int dd=sc.nextInt();
		System.out.println("Enter month of joining");
		int mm=sc.nextInt();
		System.out.println("Enter month of year");
		int yy=sc.nextInt();
		
		System.out.println("Enter Employee City");
		String city=sc.next();
		System.out.println("Enter Employee state");
		String state=sc.next();
		System.out.println("Enter Employee landmark");
		String landmark=sc.next();
		System.out.println("Enter Employee zipcode");
		double zipcode=sc.nextDouble();
		System.out.println("Enter Employee country");
		String country=sc.next();
		
		Date nitishDOJ=new Date(dd,mm,yy);
		Address nitishAddr=new Address();
		
		nitishAddr.setCity(city);
		nitishAddr.setState(state);
		nitishAddr.setLandmark(landmark);
		nitishAddr.setZipcode(zipcode);
		nitishAddr.setCountry(country);
		
		Employee nitish=new Employee(eId,name,sal,nitishDOJ,nitishAddr);
		System.out.println("\n"+nitish.dispEmpInfo());
		System.out.println("Nitish annual salary= "+nitish.calcAnnualSal() );
		
	}
}
