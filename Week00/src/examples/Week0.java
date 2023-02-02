package examples;

public class Week0 
{

	public static void main(String[] args) 
	{
		// Problem 1
		int age;
		String gender;
		float distanceBetweenCities;
		int population;
		long exercisesRequired;
		
		// Problem 2
		//int dollars = 10.5;
		double finalBalance = 100;

		//Problem 3
		int numberOfWheels = 4;
		
		
		//Increment Example
		int a = 0;
		int b = a++;

		System.out.println(a);
		System.out.println(b);
		
		// Problem 4
		//final int CM_PER_INCH = 2.54; //Will not compile! Can't save a double into an int
		
		// Problem 5
		// This will compile and run but there are some issues!
		double diameter = 34; //This could be an int
		double circumference = 3.14 * diameter; //We could turn 3.14 into a final!
		
		// Problem 6
		int x = 27;
		x++;
		x++;
		x++;
		x++;
		System.out.println(x);
		
		x = 27;
		x++;
		x = x + 2;
		System.out.println(x);
				
		x = 33;
		x--;
		x-=2;
		System.out.println(x);
		
		// Problem 7
		int pennies = 1729;
		int dollars, cents;
		dollars = 1729/100;
		cents = pennies % 100;
		System.out.println("$" + dollars + "." + cents);

		// Movies example
		double hoursWatched = 728.2;
		final int MINUTES_PER_HOUR = 60;
		int minutesWatched = (int)(hoursWatched * MINUTES_PER_HOUR);
		
		final int DAYS_PER_YEAR = 365;
		double average = minutesWatched / DAYS_PER_YEAR;

		System.out.println(average);

	}
	
}
