package week4;

public class Person 
{
	String name;
	
	public Person(String n)
	{
		name = "";
		if(n != null)
		{
			name = n;
		}
	}
	
	public String toString()
	{
		return name;
	}
}
