
import java.util.Scanner;
import java.util.Arrays;

public class sortStringObjects
{
	public void sortstrings()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the total number of strings ");
		int number=sc.nextInt();
		String[] str = new String[++number];
		
		System.out.println("Enter the names: ");
		for (int i=0;i<str.length ;i++ )
		{           
			str[i] = sc.nextLine();
		}
		System.out.println("**********************");
		Arrays.sort(str);
		System.out.println("Names are ");
		if(str.length%2==0)
		{
			for (int i=0;i<(str.length/2)+1;i++ )
			{
				str[i]=str[i].toUpperCase();
			}
			for (int i=(str.length/2)+1;i<str.length;i++ )
			{
				str[i]=str[i].toLowerCase();
			}
		}
		else
		{
			for (int i=0;i<=(str.length/2)+1;i++ )
			{
				str[i]=str[i].toUpperCase();
			}
			for (int i=(str.length/2)+1;i<str.length;i++ )
			{
				str[i]=str[i].toLowerCase();
			}
		}
		for (int i=0;i<str.length;i++ )
		System.out.println(str[i]);
	}
	
}