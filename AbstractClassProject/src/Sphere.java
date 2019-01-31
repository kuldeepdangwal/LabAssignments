
public class Sphere extends Circle
{
	public Sphere(int rad,String shapeType)
	{
		super(rad,"sphere");
	}
	@Override
	public float calcArea()
	{
		return (float)(4*Math.PI*rad*rad);
	}
	public float calcCircum()
	{
		return (float)(4*Math.PI*rad*rad*rad/3);
	}
}
