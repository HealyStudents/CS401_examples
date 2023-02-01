/**
 * 
 */
package week3;

/**
 * @author Pat Healy
 *
 */
public class LoopExercisesContinued 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		//How many numbers does this loop print?
		for (int n = 10; n >= 0; n--)
		{
		   System.out.println(n);
		}
		
		//Exercise 3
		// Rewrite as a do-while
		int i = 1000; 
		// these two loops only have different output if the while condition begins as false! 
		while(i < 1000)
		{
			System.out.println("First loop: " + (2*i + 1));
			i++;
		}
		
		do
		{
			System.out.println(2*i + 1);
			i++;
		}while(i < 1000);

		// Exercise 4
		// Write a for loop that computes the sum 
			// of the integers from 1 to n.
		int n = 5;
		for (i = 1; i <= n; i++) 
		{
			System.out.println(i);
		}
		
		// Look at this code snippet
		// What does it do?
		String phrase = "I did not do it!";
		for(i=1; i < phrase.length(); i++)
		{
			System.out.println(phrase.substring(0,i));
		}
		
		// Exercise 5
		// What is the output of this code?
		String word = "Jumanji";
		for(i=0; i<word.length(); i++)
		{
			for(int j=0; j<i; j++)
			{
				System.out.print(" ");
			}
			System.out.println(word.charAt(i));
		}
		
		// Another do-while example
		boolean shouldLoop = false;
		
		while(shouldLoop)
		{
			System.out.println("I'm looping!");
		}
		
		do
		{
			System.out.println("I'm looping!");
		}while(shouldLoop);
		
	}

}
