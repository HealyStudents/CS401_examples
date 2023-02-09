package week4;

public class Book 
{
	private String title;
	private int nPages;
	private Person editor;
	private Person author;
	
	public Book(String t, int pages, Person edit, Person auth)
	{
		title = "(Untitled)";
		if(t != null)
		{
			title = t;
		}
		
		nPages = 0;
		if (pages >= 0)
		{
			nPages = pages;
		}
		
		editor = new Person("Anonymous");
		author = new Person("Anonymous");
		
		if (edit != null)
		{
			editor = edit;
		}
		
		if(auth != null)
		{
			author = auth;
		}
	}
	
	public static void main (String[] args)
	{
		Book theBook = new Book("Give a Mouse a Cookie", 20, null, null);
		Book badBook = new Book(null, -10, null, null);
	}
}
