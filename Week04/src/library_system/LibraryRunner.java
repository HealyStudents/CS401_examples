package library_system;

import week4.Person;

public class LibraryRunner 
{

	public static void main(String[] args) 
	{
		Genre fantasy = new Genre("Fantasy", "432");
		Genre scifi = new Genre("Science-Fiction", "433");
		Genre literaryFiction = new Genre("Literary Fiction", "434");
		
		Branch mainBranch = new Branch("Oakland", "1234 Internet St.");
//		System.out.println(mainBranch);
		
		Person harperLee = new Person("Harper Lee");
		
		//String t, int pages, Person auth, Genre genre, Genre secondGenre, String code, Branch branch
		Book tkm = new Book("To Kill a Mockingbird", 280, harperLee, literaryFiction, null, "1234567890", mainBranch);
		System.out.println(tkm);
		System.out.println();
		
		Patron pat = new Patron("Pat", "0987654321", mainBranch);
		System.out.println(pat);
		System.out.println();
		
		tkm.checkOut(pat, "2023-02-09", "2023-02-16");
		
		System.out.println(tkm);
		
	}

}
