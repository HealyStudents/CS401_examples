package week5;

public class ArrayMovieLogger 
{
	String[] movieList;
	int[] movieRuntimes;
	int size;
	
	public ArrayMovieLogger()
	{
		movieList = new String[1];
		movieRuntimes = new int[1];
		size = 0;
	}
	
	public void addMovie(String movieName, int runtime)
	{
		if(size >= movieList.length)
		{
			String[] temp = movieList.clone();
			movieList = new String[movieList.length*2];
			int[] tempRuntimes = movieRuntimes.clone();
			movieRuntimes = new int[movieRuntimes.length*2];
			for(int j = 0; j < temp.length; j++)
			{
				movieList[j] = temp[j];
				movieRuntimes[j] = tempRuntimes[j];
			}
		}
		movieList[size] = movieName;
		movieRuntimes[size] = runtime;
		size++;
	}
	
	public String toString()
	{
		String out = "";
		for(int i = 0; i < size; i++)
		{
			out += (movieList[i] + ": " + movieRuntimes[i] + "\n");
		}
		return out;
	}
	
	
	public static void main(String[] args) 
	{
		ArrayMovieLogger ml = new ArrayMovieLogger();
		ml.addMovie("Bones and All", 131);
		System.out.println(ml);
		
		ml.addMovie("Rear Window", 112);
		System.out.println(ml);
	}

}
