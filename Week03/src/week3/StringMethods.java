package week3;

public class StringMethods 
{

	public static void main(String[] args) 
	{	
		//Substring examples
		System.out.println("Substring Examples! ============");
		String str = "Hello World!";
		// Substring takes two parameters (two integers representing indexes)
		// it returns the substring starting at the first given index (inclusive)
		// and ending at the second given index (exclusive)
		System.out.println(str.substring(2, 3));
		// We can also call substring with only one integer.
		// This will give us a substring going from this index to the end of the string
		System.out.println(str.substring(6));
		
		//If we give an index that isn't actually in the string, it'll throw an exception
		// (i.e. a runtime error)
		// System.out.println(str.substring(15));
		
		//We can combine substring and indexOf in interesting ways!
		// Say we wanted to get a substring of a given string that
		// contains all characters from the first letter 'o' until the end:
		System.out.println(str.substring(str.indexOf('o')));
		// Or the first word in a sentence:
		String sentence = "Java is probably my 6th favorite language, at least";
		System.out.println(sentence.substring(0, sentence.indexOf(' ')));
		System.out.println(str.indexOf('l'));
		
		System.out.println("Trimming! ============");
		// Often, we'll have strings with excess whitespace that we want to get rid of
		// This is especially useful in cases where we're getting user input
		String str2 = " hello ";
		// The trim method returns the string without any leading or ending whitespace
		str2 = str2.trim(); // "hello"
		System.out.println(str2);
		
		// Trim doesn't mess with spaces in the middle of the string, 
		//		only whitespace at the beginning or end of the string
		str2 = " Java is probably my 6th favorite language, at least ";
		str2 = str2.trim();
		System.out.println(str2);
		
		System.out.println("Testing our methods! ============");
		// Test our keep letters only method
		System.out.println(keepLettersOnly("Hello World!!!"));
		
		//Test our getDomainName with a valid input
		System.out.println(getDomainName("pwh5@pitt.edu"));
		//Test our getDomainName with an invalid input
		System.out.println(getDomainName("1234 Internet St"));
		
		//Try out the invert method
		String str3 = "foo_bar!";
		System.out.println(str3 + " : " + invert(str3));
		
		//try out the filter symbols method
		System.out.println(str3 + " : " + filterSymbols(str3));
		
		//Try out our count words method
		System.out.println(str2 + " : " + countWords(str2));
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
		for(int i=0; i<s.length(); i++)
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
