 enum Gender 
{
  M,F,NA;
}
public class Person
{
		String firstName;
		String lastName;
		Gender gender;
		long phoneNumber;
		
		public Person()
		{
		firstName="";
		lastName="";
		gender=Gender.NA;
		phoneNumber=0;
		}
		public Person(String first,String last,Gender g,long phone)
		{
			System.out.println("Person Details");
			System.out.println("______________");
			System.out.println("First Name: "+ first);
			System.out.println("Last Name: "+ last);
			System.out.println("Gender: "+ g);
			System.out.println("PhoneNumber: "+ phone);
		}
		public void setfirst(String first)
		{
			firstName=first;
		}
		public void setlast(String last)
		{
			lastName=last;
		}
		public void setgender(Gender g)
		{
			gender=g;
		}
		public void setphone(long phone)
		{
			phoneNumber=phone;
		}
		
		public void dispPerson()
		{
			System.out.println("Person Details");
			System.out.println("______________");
		}
		public void dispfirst()
		{
			System.out.println("First Name: "+ firstName);
		}
		public void displast()
		{
			System.out.println("Last Name: "+ lastName);
		}
		public void dispgender()
		{
			System.out.println("Gender: "+ gender);
		}
		public void dispphone()
		{
			System.out.println("Phone Number: "+ phoneNumber);
		}

		
	}
