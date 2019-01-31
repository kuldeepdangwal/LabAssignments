class Parent
{
	int i=90;
	public void showMsg()
	{
		System.out.println("In parent showMsg "+i);
	}
	public void getCount()
	{
		System.out.println("In parent Get Count");
	}
	
}
class Child extends Parent
{
	int i=80;
	public void showMsg()
	{
		System.out.println("In Child ShowMsg"+i);
	}
	public void getCount()
	{
		System.out.println("In parent Get Count");
	}
}
public class TestAnnotationDemo 
{
	public static void main(String args[])
	{
		Parent p1=new Parent();
		System.out.println(p1.i);
		p1.showMsg();
		p1.getCount();
		
		Child c2=new Child();
		System.out.println(c2.i);
		c2.showMsg();
		c2.getCount();
		
		Parent c3=new Child();
		System.out.println(c3.i);
		c3.showMsg();
		c3.getCount();
		
	}
}
