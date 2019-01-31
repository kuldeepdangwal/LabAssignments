import java.util.Scanner;
public class UsernameValidate 
{
	public static void validateUsername()
	{
		String str;
		Scanner sc=new Scanner(System.in);
		str=sc.nextLine();
		if ( (checkEnd(str) ) &&( checkLength(str)) )
		{
			System.out.println("JOB DONE");
		}
		else
			System.out.println("NOT JOB DONE");
		
	}
	public static boolean checkEnd(String str1)
	{
		char[] strchar=str1.toCharArray();
		int length=strchar.length;
		if((strchar[length-1]=='b')&&(strchar[length-2]=='o')&&(strchar[length-3]=='j')&&(strchar[length-4]=='_') )
			return true;
		else 
			return false;}
	public static boolean checkLength(String str1)
	{
		int length=str1.length();
		if(length>=12)
			return true;
		else
			return false;
	}
}
