package library_system;

public class Branch 
{
	private String branchName;
	private String address;
	
	public Branch(String branchName, String address)
	{
		this.branchName = branchName;
		this.address = address;
	}
	
	public String toString()
	{
		return branchName + ": " + address;
	}
}
