package week6;

public class JellybeanJar 
{
	int beans;
	
	public JellybeanJar(int beans)
	{
		if(beans < 0)
		{
			throw new IllegalStateException("Not enough beans!");
		}
		this.beans = beans;
	}

	public static void main(String[] args) 
	{
		try
		{
			JellybeanJar jar = new JellybeanJar(-5);
		}
		catch(IllegalStateException e)
		{
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}

}
