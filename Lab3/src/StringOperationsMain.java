import java.util.Scanner;

public class StringOperationsMain
{
	public static void main(String args[]) 
	{
		int n,i,j,k,temp=0;
		String str;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		str=sc.nextLine();
		StringOperations obj=new StringOperations();
		String str1,str2,str3,str4;
		
		System.out.println("Enter your choice");
		System.out.println("1.String to add itself :");
		System.out.println("2.String to replace # at odd positions :");
		System.out.println("3.String to remove  duplicates :");
		System.out.println("4.String to uppercase at odd positions :");
		int ch=sc.nextInt();
		switch(ch)
		{
		case 1: str1=obj.additself(str);
				System.out.println("String after adding itself :"+str1);
				break;
		case 2:	str2=obj.replaceodd(str);
				System.out.println("String after replacing # at odd positions :"+str2);
				break;
		case 3: str3=obj.removeduplicates(str);
				System.out.println("String after removing duplicates :"+str3);
				break;
		case 4: str4=obj.odduppercase(str);	
				System.out.println("String after uppercasing at odd positions :"+str4);
				break;
		default :System.out.println("Enter correct choice :");
		}
		
		
	}
}

