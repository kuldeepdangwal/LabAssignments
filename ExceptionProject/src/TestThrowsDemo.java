import java.io.IOException;


public class TestThrowsDemo {

	public static void main(String[] args) 
	{
		MyClass mc=new MyClass();
		try
		{
			mc.method1();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
