package week5;

public class ArrayProcessor 
{

	public double findMin(double[] doubleArray)
	{
		double currentMin = Double.MAX_VALUE;
		for(double e: doubleArray)
		{
			if(e < currentMin)
			{
				currentMin = e;
			}
		}
		return currentMin;
	}
	
	public double findMax(double[] doubleArray)
	{
		double currentMax = Double.MIN_VALUE;
		for(double e: doubleArray)
		{
			if(e > currentMax)
			{
				currentMax = e;
			}
		}
		return currentMax;
	}
	
	public double[] findExtremes(double[] doubleArray)
	{
		double min = findMin(doubleArray);
		double max = findMax(doubleArray);
		double[] extremes = {min, max};
		return extremes;
	}
	
	public void printArray(double[] doubleArray)
	{
		//System.out.println(doubleArray);
		System.out.print("[");
		for(double d: doubleArray)
		{
			System.out.print(d + ", ");
		}
		System.out.println("]");
	}
	
	
	public static void main(String[] args) 
	{
		double[] values = {1, 2, 2, 3.5, 1.8, 9.2, -2.0};
		ArrayProcessor ap = new ArrayProcessor();
		ap.printArray(values);
		System.out.println(ap.findMin(values));
		System.out.println(ap.findMax(values));
		ap.printArray(ap.findExtremes(values));
	}

}
