
public abstract class Account //extends Person
{
	static long accNumGen=0;
	double balance;
	Person accHolder;
	double overdraft;
	long accNum;
	
	public void deposit(double depositAmount)
	{
		balance+=depositAmount;
	}
	public abstract void withraw(double withrawAmount);
	/*{
		/*double checkBal=balance-withrawAmount;
		if(checkBal<500)
		{
			System.out.println("U CANNOT WITHRAW\nYOU NEED TO MAINTAIN MINIMUM BALANCE = 500");
		}
		else
		{
			balance=checkBal;
		}
	}*/
	public double getBalance()
	{
		return balance;
	}
	
	public long getAccNum() {
		return accNum;
	}
	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}
	public Person getAccHolder() {
		return accHolder;
	}
	public void setAccHolder(Person accHolder) {
		this.accHolder = accHolder;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
}
