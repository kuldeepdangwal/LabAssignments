import java.util.Scanner;
import java.util.Arrays;
public class CheckStringPositive 
{
	public static boolean checkString(String str)
	{
		int flag=0,i;
		char[] strCharArray=str.toCharArray();
		char[] sortedStrCharArray=str.toCharArray();
		Arrays.sort(sortedStrCharArray);
		for(i=0;i<sortedStrCharArray.length;i++)
		{
			if(strCharArray[i]!=sortedStrCharArray[i] )
			{
				return false;
			}
		}
		return true;
	}
}
