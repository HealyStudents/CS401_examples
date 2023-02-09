package week4;

public class Circle 
{
	private double radius;
	
	public Circle()
	{
		radius = 1;
	}
	
	public Circle(double r)
	{
		radius = 1;
		if(r >= 0) 
		{
			radius = r;
		}
	}
	
	public double getRadius()
	{
		return radius;
	}
	
	public double area()
	{
		return Math.pow(radius, 2) * Math.PI;
	}
	
	public double perimeter()
	{
		return 2 * Math.PI * radius;
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

	}

}
