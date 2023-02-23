package midterm_review;

public class StringMethods 
{

	public static void main(String[] args) 
	{
		String str = "hello world!!!! ahhhhhh!";
		String str2 = str.copyValueOf(str.toCharArray());
		
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(6));
		
		System.out.println(str.charAt(str.length()-1));
//		System.out.println(str.charAt(-1));
		
		System.out.println(str.indexOf("w"));
		System.out.println(str.indexOf("z"));
		System.out.println(str.indexOf("y") != -1);
		
		
		System.out.println(str == str2);
		System.out.println(str == str);
		System.out.println(str.equals(str2));
		
	}

}
