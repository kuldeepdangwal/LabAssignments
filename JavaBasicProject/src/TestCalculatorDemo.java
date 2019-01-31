
class Calculator
{
	public void add(int num1,int num2)
	{
		System.out.println("Addition       : "+(num1+num2));
	}
	public void add(String fn,String ln)
	{
		System.out.println("Concat String  :  "+fn+" "+ln);
	}

	public void add(byte num1,byte num2)
	{
		System.out.println("Byte addition  : "+ num1+num2);
	}

	public void add(byte num1,byte num2,byte num3)
	{
		System.out.println("Byte addition  : "+ num1+num2+num3);
	}
	public void add(float num1,float num2)
	{
		System.out.println("float addition : "+ (num1+num2));
	}
	public void add(float num1,float num2,float num3)
	{
		System.out.println("float addition : "+ (num1+num2+num3));
	}
}


public class TestCalculatorDemo 
{
	public static void main(String args[])
	{
		Calculator obj=new Calculator();
		obj.add(40, 60);
		obj.add("abc","bcd");
		obj.add((byte)40,(byte)60);
		obj.add((byte)40,(byte)60,(byte)30);
		obj.add(50.1F,49.9F);
		obj.add(10.1F,20.4F,19.5F);
		
		
		
		
	}
}
