
public class TestfDemo 
{
	public static void main(String args[])
	{
		TestfDemo obj=new TestfDemo();
		int marks=48;
		if(marks<40)
		{
			System.out.println(obj.getResult()+"Fail");
		}
		else if(marks>=40 && marks<60)
		{
			System.out.println(obj.getResult()+"Second Class");
		}
		else if(marks>=60 && marks<75)
		{
			System.out.println(obj.getResult()+"First Class");
		}
		else
		{
			System.out.println(obj.getResult()+"Distinction");
		}	
	}
	
	public String getResult()
	{
		return "U Got ";
	}
}
