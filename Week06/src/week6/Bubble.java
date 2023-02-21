package week6;

public class Bubble
{
	public static void main(String[] args)
	{
		foo();
	}

	public static void foo()
	{
		try
		{
			bar();
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("Error in bar!");
			System.out.println(e);
		}
	}

	public static void bar()
	{
		String str = "Hello!";
		System.out.print(str.charAt(-1));
	}
}
