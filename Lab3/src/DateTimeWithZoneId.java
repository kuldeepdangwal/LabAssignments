import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.TimeZone;

public class DateTimeWithZoneId
{
	public static void getAllTimeZone() 
	{
		String[] zoneIds = TimeZone.getAvailableIDs();
		for (int i = 0; i < zoneIds.length; i++) 
		{
			TimeZone tz = TimeZone.getTimeZone(zoneIds[i]);
			System.out.println(tz.getID() + " " + tz.getDisplayName());
		}
	}
	public static void getTime(String timeZoneId) 
	{
		Calendar calTZ = new GregorianCalendar(TimeZone.getTimeZone(timeZoneId));
		calTZ.setTimeInMillis(new Date().getTime());
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, calTZ.get(Calendar.YEAR));
		cal.set(Calendar.MONTH, calTZ.get(Calendar.MONTH));
		cal.set(Calendar.DAY_OF_MONTH, calTZ.get(Calendar.DAY_OF_MONTH));
		cal.set(Calendar.HOUR_OF_DAY, calTZ.get(Calendar.HOUR_OF_DAY));
		cal.set(Calendar.MINUTE, calTZ.get(Calendar.MINUTE));
		cal.set(Calendar.SECOND, calTZ.get(Calendar.SECOND));
		cal.set(Calendar.MILLISECOND, calTZ.get(Calendar.MILLISECOND));
		System.out.println(cal.getTime());
	}
}