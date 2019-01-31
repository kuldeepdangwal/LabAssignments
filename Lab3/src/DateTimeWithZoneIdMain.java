import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.TimeZone;

public class DateTimeWithZoneIdMain
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the timezone");
		String timeZoneId=sc.nextLine();
		 DateTimeWithZoneId dateTimeZoneId=new DateTimeWithZoneId();
		 dateTimeZoneId.getTime(timeZoneId);// getAllTimeZone();
	}
	
}