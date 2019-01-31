
public class CurrentAccount extends Account
{
	double overDraftLimit=0;
	//System.out.println("abc");
	public void withraw(double withrawAmount)
	{
		System.out.println("overDraftLimit"+overDraftLimit);
		overDraftLimit+=withrawAmount;
		if(overDraftLimit>=10000)
		{
			System.out.println("U CANNOT WITHRAW\nOVERDRAFT LIMIT IS REACHED");
		}
		else
		{
			balance-=withrawAmount;
		}
	}

}
