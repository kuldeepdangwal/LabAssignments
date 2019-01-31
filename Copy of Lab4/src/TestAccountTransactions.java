import java.util.Scanner;


public class TestAccountTransactions 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int switchkey;
		boolean flag=true;
		//Account acchold1=new Account();
		//Account acchold2=new Account();
		Person accholdinfo1=new Person();
		Person accholdinfo2=new Person();
		
		SavingsAccount acchold3=new SavingsAccount();
		SavingsAccount acchold4=new SavingsAccount();
		
		CurrentAccount acchold5=new CurrentAccount();
		CurrentAccount acchold6=new CurrentAccount();
		
		
		String name1,name2;
		float age1,age2;
		System.out.println("Enter the first Acc Holder Name and age");
		name1=sc.nextLine();
		age1=sc.nextFloat();
		Account.accNumGen++;
		System.out.println("Acc number : "+Account.accNumGen);
		accholdinfo1.setName(name1);
		accholdinfo1.setAge(age1);
		//acchold1.setAccNum(Account.accNumGen);
		System.out.println("Enter the second Acc Holder Name and age");
		name2=sc.next();
		age2=sc.nextFloat();
		Account.accNumGen++;
		accholdinfo2.setName(name2);
		accholdinfo2.setAge(age2);
		//acchold1.setAccNum(Account.accNumGen);
		System.out.println("Acc number : "+Account.accNumGen);
		//acchold1.balance=2000;
		//acchold2.balance=3000;
		acchold3.balance=2000;
		acchold5.balance=2000;
		acchold4.balance=3000;
		acchold6.balance=3000;
		while(flag)
		{
		System.out.println("1.Deposit Money");
		System.out.println("2.Withraw Money");
		System.out.println("3.Show Balance");
		System.out.println("4.Exit");
		int choice=sc.nextInt();
		switch(choice)
			{
			case 1:
					System.out.println("Enter the amount of money to be deposited");
					double depamount=sc.nextDouble();
					System.out.println("Enter the account number for the money to be deposited \nThe Account Numbers-\n1.for "+accholdinfo1.getName()+"\n2.for"+accholdinfo2.getName());
					int depaccnum=sc.nextInt();
							if(depaccnum==1)
							{
								acchold3.deposit(depamount);
								acchold5.deposit(depamount);
							}
							else if(depaccnum==2)
							{
								acchold4.deposit(depamount);
								acchold6.deposit(depamount);
								
							}
					break;
			case 2: System.out.println("Enter the amount of money you want to withraw");
					double withamount=sc.nextDouble();
					
					System.out.println("Enter the account number for the money to be withrawed \nThe Account Numbers-\n1.for "+accholdinfo1.getName()+"\n2.for"+accholdinfo2.getName());
					int withaccnum=sc.nextInt();
							if(withaccnum==1)
							{
								acchold3.withraw(withamount);
								acchold5.withraw(withamount);
								//acchold5.withraw(withamount);
							}
							
							else if(withaccnum==2)
							{
								acchold4.withraw(withamount);
								acchold6.withraw(withamount);
								//acchold6.withraw(withamount);
							}
					break;
			case 3:	System.out.println("Enter the account number too see the balance \nThe Account Numbers-\n1.for "+accholdinfo1.getName()+"\n2.for"+accholdinfo2.getName());
					int accnum=sc.nextInt();
					if(accnum==1)
					{
						System.out.println("Balance for  :"+accholdinfo1.getName()+" "+acchold3.getBalance());
						System.out.println("Balance for  :"+accholdinfo1.getName()+" "+acchold4.getBalance());
					}
					else if(accnum==2)
					{
						System.out.println("Balance for  :"+accholdinfo2.getName()+" "+acchold5.getBalance());
						System.out.println("Balance for  :"+accholdinfo2.getName()+" "+acchold6.getBalance());
					}
						break;
			case 4:break;
			default :break;
			}
		}	
	}
}
