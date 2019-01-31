import java.io.IOException;

public class MyClass 
{

	public void method1()
	{
		System.out.println("method 1 starts here");
		try
		{
			method2();
		}catch(IOException e)
		{
			e.printStackTrace();
		}
		System.out.println("method 1 ends here");

	}
	public void method2() throws IOException
	{
		System.out.println("method 2 starts here");
		throw new IOException();
	}
	
}
