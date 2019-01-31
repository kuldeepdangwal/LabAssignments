
public class TestPaintApplication 
{
	public static void main(String args[])
	{
		Circle circle1=new Circle(6,"circle");
		Circle circle2=new Circle(4,"circle");
		Shape circle3=new Circle(3,"circle");
		
		circle1.drawShape();
		System.out.println("Area of circle :"+circle1.calcArea());
		System.out.println("Circum of circle :"+circle1.calcCircum());
		circle2.drawShape();
		System.out.println("Area of circle :"+circle2.calcArea());
		System.out.println("Circum of circle :"+circle2.calcCircum());
		circle3.drawShape();
		System.out.println("Area of circle :"+circle3.calcArea());
		System.out.println("Circum of circle :"+circle3.calcCircum());
		System.out.println("*******************");
		Sphere sphere1=new Sphere(7,"rad");
		sphere1.drawShape();
		System.out.println("Area of Sphere :"+sphere1.calcArea());
		System.out.println("Circum of Sphere :"+sphere1.calcCircum());
		
		
	}
}
