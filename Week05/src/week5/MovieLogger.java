package week5;

import java.util.ArrayList;

public class MovieLogger 
{

	ArrayList<String> movieList;
	ArrayList<Integer> movieRuntimes;
	
	public MovieLogger()
	{
		movieList = new ArrayList<String>();
		movieRuntimes = new ArrayList<Integer>();
	}
	
	public void addMovie(String movieName, int runtime)
	{
		movieList.add(movieName);
		movieRuntimes.add(runtime);
	}
	
	public String toString()
	{
		String out = "";
		for(int i = 0; i < movieList.size(); i++)
		{
			out += (movieList.get(i) + ": " + movieRuntimes.get(i) + "\n");
		}
		return out;
	}
	
	
	public static void main(String[] args) 
	{
		MovieLogger ml = new MovieLogger();
		ml.addMovie("Bones and All", 131);
		System.out.println(ml);
		
		ml.addMovie("Rear Window", 112);
		System.out.println(ml);
	}

}
