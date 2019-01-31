
public class TestStringDemo 
{
	public static void main(String agrs[])
	{
		String str1=new String("Capgemini");
		System.out.println("Hashcode of str3 "+str1.hashCode());
		String str2=new String("Capgemini");
		System.out.println("Hashcode of str2 "+str2.hashCode());
		String str3=new String("Capgemini");
		System.out.println("Hashcode of str3 "+str3.hashCode());
		
		StringBuffer str4=new StringBuffer("Capgemini");
		System.out.println("Hashcode of str3 "+str3.hashCode());
		
		StringBuffer str5=new StringBuffer("Capgemini");
		System.out.println("Hashcode of str3 "+str3.hashCode());
		
		
		System.out.println("Is str1==str2? "+(str1==str2));
		System.out.println("Is str1.equals(str2)  ? "+(str1.equals(str2)));
		
		System.out.println("Is str4==str5? "+(str4==str5));
		System.out.println("Is str4.equals(str5)? "+(str4.equals(str5)));
		
		
		
	}
}
