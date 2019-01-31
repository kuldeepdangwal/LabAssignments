
	import java.util.Scanner;
	import java.util.Arrays;
	public class CheckStringPositiveMain 
	{
		public static void main(String args[])
		{
			String str;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the string");
			str=sc.nextLine();
			CheckStringPositive obj=new CheckStringPositive();
			if(obj.checkString(str))
				System.out.println("POSITIVE");
			else
				System.out.println("NEGATIVE");
				
		}
	
	}

