
public class Person implements Printable
{
	String personName;
	String personPanNo;
	
	public Person(String personName, String personPanNo) 
	{
		super();
		this.personName = personName;
		this.personPanNo = personPanNo;
	}

	@Override
	public String print() 
	{
		return "Person [personName=" + personName + ", personPanNo="
				+ personPanNo + "]";
	}
	
	public String sayHi()
	{
		return personName+"said hi all";
	}

}
