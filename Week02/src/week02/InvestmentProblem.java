package week02;

public class InvestmentProblem 
{

	public static void main(String[] args) 
	{
		final double RATE = 0.01;
		
		double balance = 10000;
		double targetBalance = balance * 2;
		
		int year = 0;

		while (balance < targetBalance)
		{
		   year++;
		   double interest = balance * RATE / 100;
		   balance = balance + interest;
		   System.out.println(year + ": " + balance);
		}
		
		
		
//		int i = 0;
//		while(true)
//		{
//			i++;
//			if(i > 10)
//			{
//				break;
//			}
//		}
	}
	
	
	public static void loopExample() 
	{
		int i = 0;
		while(true)
		{
			i++;
			if(i > 10)
			{
				return;
			}
		}
	}

}
