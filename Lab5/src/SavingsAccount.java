
public class SavingsAccount extends Account
{
	double minimumBalance=500;
	public void withraw(double withrawAmount)
	{
		double checkBal=balance-withrawAmount;
		if(checkBal<minimumBalance)
		{
			balance=checkBal;
		}
		else
		{
			System.out.println("OVERRIDEN : U CANNOT WITHRAW\nYOU NEED TO MAINTAIN MINIMUM BALANCE = 500");
			
		}
	}
}
