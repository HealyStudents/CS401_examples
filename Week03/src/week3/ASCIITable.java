package week3;

public class ASCIITable 
{
	public static void main(String[] args) 
	{
		for (char myChar=' '; myChar<'}'; myChar++)
		{
			System.out.println((int) myChar + "\t" + myChar);
		}
	}
}

