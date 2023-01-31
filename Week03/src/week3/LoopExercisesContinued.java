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
//		for (int n = 10; n >= 0; n--)
//		{
//		   System.out.println(n);
//		}
		
		//Exercise 3
		// Rewrite as a do-while
		int i = 1000;
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
//		int n = 5;
//		for (int i = 1; i <= n; i++) 
//		{
//			System.out.println(i);
//		}
		
		
		
		// Look at this code snippet
		// What does it do?
//		String phrase = "I did not do it!";
//		for(int i=1; i < phrase.length(); i++)
//		{
//			System.out.println(phrase.substring(0,i));
//		}
		
		// Exercise 5
		// What is the output of this code?
//		String word = "Jumanji";
//		for(int i=0; i<word.length(); i++)
//		{
//			for(int j=0; j<i; j++)
//			{
//				System.out.print(" ");
//			}
//			System.out.println(word.charAt(i));
//		}
		
		
		//System.out.println(keepLettersOnly("Hello World!!!"));
		
		
		//Substring example
//		String str = "Hello World!";
//		System.out.println(str.substring(2, 3));
//		System.out.println(str.substring(4));
//		System.out.println(str.substring(15));
//		System.out.println(str.indexOf('l'));
		
		
		// Trim
		String str2 = " hello ";
		str2 = str2.trim(); // "hello"
		
		
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
	
	public static String keepLettersOnly(String s)
	{
		String r = "";
		for(int i=0;i<s.length();i++)
		{
			char a = s.charAt(i);
			if((a >= 'a' && a <= 'z') || (a >= 'A' && a <= 'Z'))
			{
				r = r + a;
			}
		}
		return r;
	}
	
	public static String getDomainName(String email) 
	{
		if(email.indexOf("@") > -1)
		{
			String domain = email.substring(email.indexOf("@")+1,email.length());
			return domain;
		}
		else
		{
			System.out.println("not a valid email!");
			return null;
		}	
		
	}
	
	public static String invert(String s)
	{
		String inverted = "";
		for (int i = 0; i < s.length(); i++) 
		{
			inverted = s.charAt(i) + inverted;
		}
		return inverted;
	}
	
	public static String filterSymbols(String s)
	{
		String validCharacters = "abcdefghijklmnopqrstuvwxyzABCDEFGHYJKLMNOPQRSTUVWXYZ";
		if(s == null) return null;
		String filtered = "";
		for(int i=0;i<s.length();i++)
		{
			if(validCharacters.indexOf(s.charAt(i)) != -1 )
			{
				filtered += s.charAt(i);
			}
		}
		return filtered;
	}

	public static int countWords(String s)
	{	
		if(s == null || s.length() == 0) return 0;
		s = s.trim();
		int count = 1;
		for(int i=1;i<s.length()-1;i++){
			if(s.charAt(i) == ' ') count++;
		}
		return count;
	}

}
