package week4;

public class Dice 
{
	private int sides;
	
	public Dice()
	{
		sides = 6;
	}
	
	public int roll()
	{
		int score = (int)Math.round(sides*Math.random() + 1);
		return score;
	}
	
	public int roll(int times)
	{
		int score = 0;
		for(int i = times; i > 0; i--)
		{
			score += roll();
		}
		return score;
	}
}

