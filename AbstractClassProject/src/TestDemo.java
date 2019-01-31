import java.util.Scanner;
public class TestDemo 
{
	
		public static void main(String args[])
		{
			Scanner sc=new Scanner(System.in);
			Shape shaps[]=new Shape[4];
			int i,j,choice,rad;
			for(i=0;i<shaps.length;i++)
			{
				System.out.println("which shape do you want");
				System.out.println("1.Circle \n2.Sphere");
				choice=sc.nextInt();
				System.out.println("Enter radius");
				rad=sc.nextInt();
				switch(choice)
				{
				case 1 : shaps[i]=new Circle(rad,"circle");
						 break;
				case 2 : shaps[i]=new Sphere(rad,"sphere");
						 break;
				default: shaps[i]=new Circle(rad,"circle");
						 shaps[i].drawShape();
						 break;
				}
				
			}
			System.out.println("********************************************");
			for(j=0;j<shaps.length;j++)
			{
				shaps[j].drawShape();
				if(shaps[j] instanceof Circle)
				{
					System.out.println("Circle");
					System.out.println(shaps[j].calcArea());
					System.out.println(((Circle)shaps[j]).calcCircum());
				}
				else if(shaps[j] instanceof Sphere)
				{
					System.out.println("Sphere");
					System.out.println(shaps[j].calcArea());
					System.out.println(((Sphere)shaps[j]).calcCircum());
				}
				
				
			}
		}
	}
