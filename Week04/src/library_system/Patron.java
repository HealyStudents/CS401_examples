package library_system;

public class Patron 
{
	private String name;
	private String cardNumber;
	private Branch homeBranch;
	
	public Patron(String name, String cardNumber, Branch homeBranch)
	{
		this.name = name;
		
		if (cardNumber != null && cardNumber.length() == 10)
		{
			this.cardNumber = cardNumber;
		}
		
		this.homeBranch = homeBranch;
	}
	
	public String toString()
	{
		return name + "\n\t" + cardNumber + "\n\t" + homeBranch.toString();
	}
}
