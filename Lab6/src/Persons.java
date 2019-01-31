 enum Gender 
{
  M,F,NA;
}
 class MyException extends Exception
 {
	 
 }
public class Persons 
{
		String firstName;
		String lastName;
		Gender gender;
		long phoneNumber;
		
		public Persons()
		{
		firstName="";
		lastName="";
		gender=Gender.NA;
		phoneNumber=0;
		System.out.println("Default Constructor");
		}
		
		public Persons(String firstName, String lastName, Gender gender,long phoneNumber) 
		{
			this.firstName = firstName;
			this.lastName = lastName;
			this.gender = gender;
			this.phoneNumber = phoneNumber;
			System.out.println("Parameterized Constructor");
		}
		
		
		
		public void setfirst(String first)
		{
			if(first.equals(""))
			{
				try
		        { 
		            throw new MyException(); 
		        } 
		        catch (MyException ex1) 
		        { 
		            System.out.println("Exception Caught-First Name Blank"+ex1); 
		        } 
				
			}
			else
			{
				firstName=first;
			}
		}
		public void setlast(String last)
		{
			if(last.equals(""))
			{
				try
		        { 
		            throw new MyException(); 
		        } 
		        catch (MyException ex2) 
		        { 
		            System.out.println("Exception Caught-Last Name Blank"+ex2); 
		        } 
			}
				
			else
			{
				lastName=last;
			}
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
