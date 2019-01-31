import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;


public class FindWarrantyExpiryDate 
{
	public static void main(String args[])
	{
		findWarranty();
	}
	public static void findWarranty()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the day of purchase");
		int dayOfPurchase=sc.nextInt();
		System.out.println("Enter the month of purchase");
		int monthOfPurchase=sc.nextInt();
		System.out.println("Enter the year of purchase");
		int yearOfPurchase=sc.nextInt();
		
		System.out.println("Enter the months of warranty");
		int monthsOfWarranty=sc.nextInt();
		
		System.out.println("Enter the year of warranty");
		int yearsOfWarranty=sc.nextInt();
		
		int yearOfExp=yearOfPurchase+yearsOfWarranty;
		int monthOfExp=monthOfPurchase+monthsOfWarranty;
		
		if(monthOfExp>12)
		{
			monthOfExp=monthOfExp-12;
			yearOfExp++;
		}
		
		System.out.println("Date of Expiration :"+dayOfPurchase +"/"+monthOfExp+"/"+yearOfExp);
	
	}
}
