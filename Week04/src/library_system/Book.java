package library_system;

import week4.Person;

public class Book 
{
	private String title;
	private int nPages;
	private Person author;
	private Genre genre;
	private Genre secondaryGenre;	
	private String bookCode;
	
	private Patron checkedOutBy;
	private String checkedOutDate;
	private String dueDate;
	
	private Branch branch;
	
	public Book(String t, int pages, Person auth, Genre genre, Genre secondGenre, String code, Branch branch)
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
		
		author = new Person("Anonymous");
		
		if(auth != null)
		{
			author = auth;
		}
		
		this.genre = new Genre(null, null);
		if(genre != null) 
		{
			this.genre = genre;
		}
		
		secondaryGenre = secondGenre;
		bookCode = code;
		
		this.branch = branch;
	}
	
	public void checkOut(Patron p, String today, String due)
	{
		if (p == null)
		{
			return;
		}
		checkedOutBy = p;
		checkedOutDate = today;
		dueDate = today;
	}
	
	public String getCode()
	{
		return genre.getGenreCode() + "-" + bookCode;
	}
	
	
	public String toString()
	{
		if(checkedOutBy != null)
		{
			return title + " by " + author 
					+ "\n" + getCode() + "\nChecked out by: "
					+ checkedOutBy.toString() 
					+ "\nDue: " + dueDate;
		}
		return title + " by " + author 
				+ "\n" + getCode();
	}
	
}
