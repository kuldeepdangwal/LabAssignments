import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;


public class FindWarrantyExpiryDateMain
{
	public static void main(String args[])
	{
		FindWarrantyExpiryDate findExpiryDate=new FindWarrantyExpiryDate();
		findExpiryDate.findWarranty();
	}
}
