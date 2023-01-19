/**
 * 
 */
package week01;

import javax.swing.JOptionPane;

/**
 * @author Pat Healy
 *
 */
public class IfStatements 
{

	public static void main(String[] args) 
	{
		// Exercise 1
		// Assume a variable x contains a double value. 
		// Write an if-else statement that multiplies it by itself 
		// if the value is greater than 1. Otherwise it should divide it by 2.
		double x = 5.2;
		
		if(x > 1) 
		{
			x = 2 * x;
		}
		else
		{
			x = x / 2;
		}
		System.out.println(x);
		
		
		//Exercise 1.5
		//Using an if statement and the modulus (%) operator write a program that 
		// asks users to enter a number and determines whether 
		// the number entered is even or odd.
		
		//Ask user an input
		//Convert input to number
		int y = Integer.parseInt(JOptionPane.showInputDialog("Give me a number!"));
		
		//if reminder of number / 2 is 0, print is even, otherwise print odd
		if(y % 2 == 0) 
		{
			System.out.println("Even!");
		}
		else
		{
			System.out.println("Odd!");
		}
		
		//this won't work for negative numbers!
		if(y % 2 == 1) 
		{
			System.out.println("Odd!");
		}
		else
		{
			System.out.println("Even!");
		}
		
		
		
		
		// Exercise 2
		//What's wrong with the following block of code?
		int accountBalance = 5;
		if(accountBalance == 0)
		{
		        System.out.println("No money in your account!");
		}
		
		/*boolean hasShoes = false;
		if (hasShoes = true) 
		{
			System.out.println("You can enter!");
		}*/
		
		//Exercise 3
		// Supply a condition in this if statement to test whether the user entered a Y:
		String input = JOptionPane.showInputDialog("Enter Y to quit.");
		
		input = input.toLowerCase();
		if (input.equals("y")){
			System.out.println("Goodbye.");
		}
		
		if (input.equalsIgnoreCase("y")){
			System.out.println("Goodbye.");
		}
		
		if (input.equals("y") || input.equals("Y")){
			System.out.println("Goodbye.");
		}
		
		
		
		//Exercise 4
		// of the following conditions are true, provided a = 3 and b = 4?
		int a = 3;
		int b = 4;
		
		System.out.println(a + 1 <= b);
		System.out.println(a + 1 >= b);
		System.out.println(a + 1 != b);
		
		
		// Exercise 5
		// What is the value of !!frozen?
		//when frozen is true, !!frozen is  ____
		//when frozen is false, !!frozen is ____


		//Exercise 6
		//Suppose x and y are two integers. 

		x = 5;
		y = -2;
		
		//How do you test whether both of them are zero?
		System.out.println( x == 0 && y == 0);
		
		//How do you test whether at least one of them is zero?
		System.out.println( x == 0 || y == 0);
		
		//How do you test whether exactly one of them is zero?
		System.out.println( (x == 0 && y != 0) || (x != 0 && y == 0));
		
		System.out.println( (x == 0 || y == 0) && (x != y));

	}
	
}
