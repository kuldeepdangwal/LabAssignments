class MyExceptions extends Exception
{
	 
}
public class Person 
{
	String name;
	float age;
	public void setName(String name) 
	{
			this.name = name;
	}
	public void setAge(float age) 
	{
		if(age<=15.0F)
		{
			try
	        { 
	            throw new MyExceptions(); 
	        } 
	        catch (MyExceptions ex) 
	        { 
	            System.out.println("Exception Caught-Age less than 15"); 
	        } 
			
		}
		else
		{
			this.age = age;
			   System.out.println("AGE IS "+this.age); 
		}
	}
	public String getName() 
	{
		return name;
	}
	
	public float getAge() {
		return age;
	}
	
	
}
