import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;


public class CheckDateWithSystemDate 
{
	public static void checkDuration()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the date in dd/MM/yyyy format");
		String dateStr=sc.nextLine();
		
		SimpleDateFormat dateFormat=new SimpleDateFormat("dd/MM/yyyy");
		
		DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDateTime now=LocalDateTime.now();
		String systemDate=dtf.format(now);
		
		System.out.println("Local date  : "+systemDate);
		
		
		try
		{
			java.util.Date date1=null;
			try
			{
				date1=dateFormat.parse(dateStr);
			}
			catch(java.text.ParseException e)
			{
				e.printStackTrace();
			}
			
			java.util.Date date2=null;
			try
			{
				date2=dateFormat.parse(systemDate);
			}
			catch(java.text.ParseException e)
			{
				e.printStackTrace();
			}
			long diff=date2.getTime()- date1.getTime();
			long day=TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
			System.out.println(day);
			
			//int[] normalYear = {31,28,31,30,31,30,31,31,30,31,30,31};
			//int[] leapYear = {31,29,31,30,31,30,31,31,30,31,30,31};
			System.out.println("Time difference:\n"+day/365+" year"+(day/30)%12+"month" +(day%30)+"day");
			
		}catch (ParseException e)
		{
			e.printStackTrace();
		}
		
		
	
	}
}
