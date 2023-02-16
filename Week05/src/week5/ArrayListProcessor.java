package week5;

import java.util.ArrayList;

public class ArrayListProcessor 
{

	public double findMin(ArrayList<Double> doubleList)
	{
		doubleList.sort(null);
		return doubleList.get(0);
	}
	
	public double findMax(ArrayList<Double> doubleList)
	{
		doubleList.sort(null);
		return doubleList.get(doubleList.size() - 1);
	}
	
	public ArrayList<Double> findExtremes(ArrayList<Double> doubleList)
	{
		double min = findMin(doubleList);
		double max = findMax(doubleList);
		ArrayList<Double> extremes = new ArrayList<Double>();
		extremes.add(min);
		extremes.add(max);
		return extremes;
	}
	
	public ArrayList<Double> removeRepeated(ArrayList<Double> doubleList)
	{
		doubleList.sort(null);
		
		int i = 0;
		while(i < doubleList.size() - 1)
		{
			if(doubleList.get(i) == doubleList.get(i+1))
			{
				doubleList.remove(i);
			}
			else
			{
				i++;
			}
		}
		
		return doubleList;
	}
	
	
	public static void main(String[] args) 
	{
		ArrayListProcessor ap = new ArrayListProcessor();
		ArrayList<Double> theList = new ArrayList<Double>();
		theList.add(5.0);
		theList.add(-2.0);
		theList.add(9.3);
		theList.add(2.4);
		System.out.println(theList);
		System.out.println(ap.findMin(theList));
		System.out.println(ap.findMax(theList));
		System.out.println(ap.findExtremes(theList));
		
	}

}
