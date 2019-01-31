enum Coin
{
	PENNY(1),NICKEL(5),DIME(10),QUARTER(25);
	private final int value;
	
	private Coin(int value)
	{
		this.value=value;
	}
	public int value()
	{
		return value;
	}
	
}
public class TestEnumDemo 
{
	public static void main(String args[])
	{
		Coin myCoin=Coin.DIME;
		System.out.println(myCoin);
		System.out.println(myCoin.value());	
	}
}
