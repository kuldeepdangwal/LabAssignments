import java.util.Scanner;


public class TestShapeClient 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Shape shaps[]=new Shape[4];
		int i;
		for(i=0;i<shaps.length;i++)
		{
			System.out.println("which shape od you want");
			System.out.println("1.Circle \n2.Sphere");
			int choice=sc.nextInt();
			System.out.println("Enter radius");
			int rad=sc.nextInt();
			switch(choice)
			{
			case 1 : shaps[i]=new Circle(rad,"circle");
					 shaps[i].drawShape();
					 System.out.println(shaps[i].calcArea());
					 System.out.println( ( (Circle)shaps[i] ).calcCircum());
					 break;
			case 2 : shaps[i]=new Sphere(rad,"sphere");
					 shaps[i].drawShape();
					 System.out.println(shaps[i].calcArea());
					 System.out.println( ( (Sphere) shaps[i]).calcCircum() );
					 break;
			default: shaps[i]=new Circle(rad,"circle");
					 shaps[i].drawShape();
					 System.out.println(shaps[i].calcArea());
					 System.out.println( ( (Circle)shaps[i] ).calcCircum());
					 break;
			}
			
		}
		
	}
}
