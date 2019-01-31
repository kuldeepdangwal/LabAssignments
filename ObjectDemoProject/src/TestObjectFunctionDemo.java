
public class TestObjectFunctionDemo 
{
	public static void main(String args[])
	{
		Employee e1=new Employee(333,"Nitish",400.0);
		Employee e2=new Employee(444,"Agarwal",500.0);
		Employee e3=new Employee(333,"Nitish",400.0);
		
		System.out.println(e1.toString());
		System.out.println(e2.toString());
		
		Integer i1=new Integer(40);
		Integer i2=new Integer(20);
		Integer i3=new Integer(40);
		
		System.out.println(i1);
		System.out.println(i2);

		String str1=new String("Capgemini");
		String str2=new String("Ltd");
		String str3=new String("Capgemini");
		
		
		if(e1.equals(e2))
		{
			System.out.println("We r same");
		}
		else
		{
			System.out.println("We r not same");
		}
		
		System.out.println("Hashcode of i1 "+i1.hashCode());
		System.out.println("Hashcode of i2 "+i2.hashCode());
		System.out.println("Hashcode of i3 "+i3.hashCode());
		System.out.println("Hashcode of str1 "+str1.hashCode());
		System.out.println("Hashcode of str2 "+str2.hashCode());
		System.out.println("Hashcode of str3 "+str3.hashCode());
		System.out.println("Hashcode of e1 "+e1.hashCode());
		System.out.println("Hashcode of e2 "+e2.hashCode());
		System.out.println("Hashcode of e3 "+e3.hashCode());
		
		
	}
}
