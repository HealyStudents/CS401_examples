package week3;

import javax.swing.JOptionPane;

public class Palindrome 
{
	public static void main(String[] args) 
	{
		String phrase = JOptionPane.showInputDialog("Input a phrase:");
		if(phrase != null)
		{
			if(isPalindrome(phrase)) System.out.println("It is palindrome");
			else System.out.println("It is not palindrome");
		}
		else
		{
			System.out.println("no input, no play!");
		}
	}
	
	public static boolean isPalindrome(String s)
	{
		if(s==null) return false;
		s = s.toUpperCase();
		s = filterSymbols(s);
		String i = invert(s);
		return i.equals(s);
	}
	
	public static String filterSymbols(String s)
	{
		String validCharacters = "abcdefghijklmnopqrstuvwxyzABCDEFGHYJKLMNOPQRSTUVWXYZ";
		if(s == null) return null;
		String filtered = "";
		for(int i=0;i<s.length();i++)
		{
			if(validCharacters.indexOf(s.charAt(i)) != -1 ){
				filtered += s.charAt(i);
			}
		}
		return filtered;
	}
	
	public static String invert(String s)
	{
		if(s == null) return null;
		String inverted = "";	
		for(int i=0;i<s.length();i++)
		{
			inverted = s.charAt(i) + inverted;
		}
		return inverted;
	}
}

