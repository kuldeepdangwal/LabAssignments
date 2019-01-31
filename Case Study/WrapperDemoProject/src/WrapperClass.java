
public class WrapperClass {
	public static void main(String[] args)
	{
		int num1=100;
		Integer ab1=num1;
		System.out.println("1");
		System.out.println(ab1);
		System.out.println(num1);
		
		Integer ab2=100;
		int num2=ab2;
		System.out.println("2");
		System.out.println(ab2);
		System.out.println(num2);
		
		Integer ab3=new Integer(100);
		int num3=ab3;
		System.out.println("3");
		System.out.println(ab3);
		System.out.println(num3);
		
		int num4=100;
		Integer ab4=new Integer(num4);
		System.out.println("4");
		System.out.println(ab4);
		System.out.println(num4);
		

	}

}
