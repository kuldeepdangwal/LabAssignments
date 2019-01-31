
public class Date 
{
	int day;
	int month;
	int year;
	static int count;
	 static
	 {
		 System.out.println("static block  ");
	 }
	public Date()//instance members
	{
		day=0;
		month=0;
		year=0;
		count++;
	}
	public Date(int day,int month,int year)
	{
		this.day=day;
		this.month=month;
		this.year=year;
		count++;
	}
	public String DispDate()
	{
		return day+"-"+month+"-"+year;
	}
	public static void getcount()
	{
		System.out.print("No. of instances : "+ count);
	}
}
