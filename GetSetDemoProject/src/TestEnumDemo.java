import java.util.Scanner;
public class TestEnumDemo 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Seasons currentSeasons=Seasons.WINTER;
		System.out.println("Current season is : "+currentSeasons);
		
		System.out.println("Enter current season \n1:Summer\n2:Rainy \n3:Winter");
		int index=sc.nextInt();
		switch(index)
		{
			case 1 :currentSeasons=Seasons.SUMMER;
				    break;
			case 2 :currentSeasons=Seasons.RAINY;
				    break;
			default:currentSeasons=Seasons.WINTER;
		}
		System.out.println("Current season is : "+currentSeasons);
	}
}
