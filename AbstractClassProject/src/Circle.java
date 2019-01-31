
public class Circle extends Shape
{
	public Circle(int rad,String shapeType)
	{
		super("cirle",rad);
	}
	@Override
	public float calcArea()
	{
		return (float)(Math.PI*rad*rad);
	}
	public float calcCircum()
	{
		return (float)(Math.PI*2*rad);
	}
	
}

