import java.sql.Date;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.text.SimpleDateFormat;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;


public class DurationBetweenTwoDates
{
	public static void main(String args[])
	{
		checkDuration();
	}
	public static void checkDuration()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first date in dd/MM/yyyy format");
		String date1Str=sc.nextLine();
		System.out.println("Enter the second date in dd/MM/yyyy format");
		String date2Str=sc.nextLine();
		
		
		SimpleDateFormat dateFormat=new SimpleDateFormat("dd/MM/yyyy");
		
		try
		{
			java.util.Date date1=null;
			try
			{
				date1=dateFormat.parse(date1Str);
			}
			catch(java.text.ParseException e)
			{
				e.printStackTrace();
			}
			
			java.util.Date date2=null;
			try
			{
				date2=dateFormat.parse(date2Str);
			}
			catch(java.text.ParseException e)
			{
				e.printStackTrace();
			}
			long diff=date2.getTime()- date1.getTime();
			long day=TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
			System.out.println("Days :"+TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS));
			System.out.println("Time difference:\n"+day/365+" year"+(day/30)%12+"month" +(day%30)+"day");
			
		}catch (ParseException e)
		{
			e.printStackTrace();
		}
	}
}
