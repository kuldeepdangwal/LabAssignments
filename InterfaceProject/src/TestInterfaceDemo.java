
public class TestInterfaceDemo 
{
	public static void main(String args[])
	{
		Printable pp =new Person("nitish","AEUA");
		System.out.println(pp.print());
		System.out.println(((Person)pp).sayHi());
	}
}
