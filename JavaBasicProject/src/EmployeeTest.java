import java.util.Scanner;


public class EmployeeTest 
{
	public static void main(String args[])
	{
		int numberofEmployee,i;
		int id;
		String name;
		double salary;
		char g;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the total number of employees ");
		numberofEmployee=sc.nextInt();
		Employee emps[]=new Employee[numberofEmployee];
		
		for(i=0;i<emps.length;i++)
		{
			System.out.print("Enter the employee id");
			id=sc.nextInt();
			System.out.print("Enter the employee name");
			name=sc.next();
			System.out.print("Enter the employee salary");
			salary=sc.nextFloat();
			System.out.print("Enter the employee gender");
			g=sc.next().charAt(0);
			
			emps[i]=new Employee(id,name,salary,g);
		}
		for(i=0;i<emps.length;i++)
		{
			emps[i].disEmp();
		}
	}
}
