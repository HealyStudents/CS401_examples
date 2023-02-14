package week5;

public class ArrayExercises 
{

	public static void main(String[] args) 
	{
		//Exercise 1.
		//Declare and initialize arrays of
		// 10 chars
		char[] characterList = new char[10];
		// 5 integers
		int[] integerList = new int[5];
		// 10 boolean
		boolean[] booleanList = new boolean[10];
		// 25 float
		float[] floatList = new float[24];		
		
		
		
		//Exercise 2
		// Consider the array 
		char[] letters = {'a','e','i','o','x'};
		// Access the element in the first position
		// Change the value of the last element to letter 'u'
		letters[4] = 'u';
		
		//Exercise 3
		// Go back to Exercise 1. Print out the last element of each 
		// of the arrays using length property. 
		//System.out.println(characterList[characterList.length - 1]);
		//System.out.println(integerList[integerList.length - 1]);
		//System.out.println(booleanList[booleanList.length - 1]);
		//System.out.println(floatList[floatList.length - 1]);
		
		// Check the error occurring if you try to access 
		// the element in position array.length
		//System.out.println(floatList[24]);
		//System.out.println(floatList[floatList.length]);

		//Exercise 4
		int[] scores = { 1, 2, 7, 1, 3 };
		int totalScores = 0;
		for(int i = 0; i < scores.length; i++)
		{
			totalScores = totalScores + scores[i];
		}
		
		//System.out.println(totalScores);
		//System.out.println( ((double)totalScores)/scores.length);
		//Starting from the above code as an example, 
		// write a piece of code that computes the 
		// average and the sum of the array scores.
		
		
		//Exercise 5
		//Write a method to find the minimum and 
		//	maximum values within an array of doubles
		double[] someValues = {2.4, 1.0, 6.7, 1.8, -1.2, 10};
		System.out.println(getMinimum(someValues));
		System.out.println(getMaximum(someValues));
	}
	
	
	public static double getMinimum(double[] doubleArray)
	{
		if(doubleArray.length < 1)
		{
			return 0;
		}
		double currentMinimum = Double.MAX_VALUE;
		for(int i = 0; i < doubleArray.length; i++)
		{
			if(doubleArray[i] < currentMinimum)
			{
				currentMinimum = doubleArray[i];
			}
		}
		return currentMinimum;
	}
	
	public static double getMaximum(double[] doubleArray)
	{
		if(doubleArray.length < 1)
		{
			return 0;
		}
		double currentMaximum = Double.MIN_VALUE;
		for(int i = 0; i < doubleArray.length; i++)
		{
			if(doubleArray[i] > currentMaximum)
			{
				currentMaximum = doubleArray[i];
			}
		}
		return currentMaximum;
	}

}
