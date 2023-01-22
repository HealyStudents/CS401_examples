package week02;

public class Exercise10 
{

	public static void main(String[] args) 
	{
		int number = 10;
		number = method1(number);
		number++;
		number = method3(number, number + 2);
		number = method2(number);
		
		System.out.println(number);
	}
	
	public static int method1(int a)
	{
		return a + a;
	}
	
	public static int method2(int a)
	{
		return a / 2;
	}
	
	public static int method3(int a, int b)
	{
		return a + b;
	}
}

