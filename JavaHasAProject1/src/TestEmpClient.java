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
		
		Date nitishDOJ=new Date(dd,mm,yy);
		Employee nitish=new Employee(eId,name,sal,nitishDOJ);
		System.out.println("\n"+nitish.dispEmpInfo());
		System.out.println("Nitish annual salary= "+nitish.calcAnnualSal() );
		
	}
}
