package midterm_review;

public class SplitExamples 
{

	public static void main(String[] args) 
	{
		String str = "A, B, C, D, E";
		String[] tokens = str.split(",");
		for(String a: tokens) {System.out.println(a.trim());}
	}

}
