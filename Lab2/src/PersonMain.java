
public class PersonMain 
{
	public static void main(String args[])
	{
		Person obj1=new Person();
		Person obj2=new Person("Nitish","agarwal",Gender.M,900000000);
		
		obj1.setfirst("Nitish");
		obj1.setlast("agarwal");
		obj1.setgender(Gender.F);
		obj1.setphone(1000000);
		
		obj1.dispPerson();
		
		obj1.dispfirst();
		obj1.displast();
		obj1.dispgender();
		obj1.dispphone();
	}
}
