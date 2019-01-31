import java.util.Scanner;

class Account
{
	private int accountNo;
	private int currBalance;
	Account()
	{	
		this.currBalance=0;
	}
	Account(int currBalance)
	{	
		super();
		this.currBalance=currBalance;
	}
	public void withraw(int withdrawAmt)
	{
		if(currBalance>=withdrawAmt)
		{
			currBalance-=withdrawAmt;
		//	System.out.println(currBalance);
		}
		else
		{
			throw new LowBalanceException("Less Balance in the acc");
		}
	}
	
}
public class TestBankDemo 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("What iss current balance");
		int currBal=sc.nextInt();
		Account nitishacc=new Account(currBal);
		System.out.println("Enter withraw amt");
		int withAmt=sc.nextInt();
		//Account acc=new Account();
		try
		{
			nitishacc.withraw(withAmt);
		}
		catch(LowBalanceException e)
		{
			e.printStackTrace();
			System.out.println("Enter withraw amt");
		}
		
	}
}
