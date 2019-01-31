
public class TestDateGetSetClientDemo 
{
	public static void main(String args[])
	{
		Date d1=new Date();
		d1.setDay(01);
		d1.setMonth(01);
		d1.setYear(2011);
		
		Date d2=new Date();
		d2.setDay(02);
		d2.setMonth(02);
		d2.setYear(2012);
		
		Date d3=new Date();
		d3.setDay(03);
		d3.setMonth(03);
		d3.setYear(2013);
		
		System.out.println("d1 date of join : "+d1.getDay()+"/"+
												d1.getMonth()+"/"+
												d1.getYear() );
		System.out.println("d2 date of join : "+d2.getDay()+"/"+
												d2.getMonth()+"/"+
												d2.getYear() );
		System.out.println("d3 date of join : "+d3.getDay()+"/"+
												d3.getMonth()+"/"+
												d3.getYear() );
		
	}
}
