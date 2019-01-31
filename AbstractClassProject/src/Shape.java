public abstract class Shape 
{
	int rad;
	String shapeType;
	public Shape(String shapetype,int rad)
	{
		this.rad=rad;
		this.shapeType=shapeType;
	}


	public void drawShape()
	{
		System.out.println(shapeType+" Drawn with RED Color");
	}
	public abstract float calcArea();
	public abstract float calcCircum();
}
