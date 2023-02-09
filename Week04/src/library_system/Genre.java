package library_system;

public class Genre 
{
	private String genreName;
	private String genreCode;
	
	public Genre(String name, String code)
	{
		genreName = "Uncategorized";
		if(name != null)
		{
			genreName = name;
		}
		
		genreCode = "000";
		if(code != null && (!(code.length() > 3) && !(code.length() < 3))) // code.length() == 3
		{
			genreCode = code;
		}
	}
	
	public String getGenreCode()
	{
		return genreCode;
	}
}
