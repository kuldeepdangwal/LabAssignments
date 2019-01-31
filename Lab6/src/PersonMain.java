
public class PersonMain 
{
	public static void main(String args[])
	{
		Persons obj1=new Persons();
		Persons obj2=new Persons("Nitish","agarwal",Gender.M,900000000);
		
		obj1.setfirst("");
		obj1.setlast("agarwal");
		obj1.setgender(Gender.F);
		obj1.setphone(1000000000);
		
		obj1.dispPerson();
		
		obj1.dispfirst();
		obj1.displast();
		obj1.dispgender();
		obj1.dispphone();
	}
}
