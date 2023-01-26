package week02;

public class Exercises1_26_23 
{

	public static void main(String[] args) 
	{
		// Exercise 1
		// Write a program that prints your name 1000 times
		String ourName = "Pat's 401 Class";
		int i = 0;
		while(i < 1000)
		{
			i++;
			System.out.println(ourName);
		}
		System.out.println(i);
		
		
		//Exercise 1.5
		// Hand tracing
		// What value is displayed
//		int n = 1729;
//		int sum = 0;
//		while (n > 0) 
//		{
//			int digit = n % 10;
//			sum = sum + digit;
//			n = n / 10;
//		}
//		System.out.println(sum);
			
			
		// Exercise 2
		int n = 1;
		while (n <= 3)
		{
		   System.out.print(n + ", ");
		   n++;
		}

	}

}
