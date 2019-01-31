import java.util.Scanner;

class Calculator
{
	int num1,num2,result;

	public Calculator(int num1, int num2) 
	{
		this.num1 = num1;
		this.num2 = num2;
	}
	public int divide()
	{
		System.out.println("Divison done");
		try
		{
			return num1/num2;
		}catch(ArithmeticException e)
		{
			System.out.println("dominator is 0 "+e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("check array size "+e);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		catch(Throwable ae)
		{
			System.out.println(ae.getMessage());
		}
		finally
		{
			System.out.println("finally block");
		}
		return result;
	}
	
}
public class TestCalculatorDemo 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int num1,num2;
		System.out.println("enter 2nos");
		num1=sc.nextInt();
		num2=sc.nextInt();
		Calculator calc=new Calculator(num1,num2);
		System.out.println("division of 2 no. "+calc.divide());
		
	}
}
