import java.util.Scanner;


public class TestThrowDemo 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num1");
		int num1=sc.nextInt();
		System.out.println("Enter num2");
		int num2=sc.nextInt();
		
		if(num2==0)
		{
			throw new ArithmeticException();
		}
		else
		{
			System.out.println("go ahead");
		}
		
		
	}
}
