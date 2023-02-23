package midterm_review;

import java.util.ArrayList;

public class ListExamples 
{

	public static void main(String[] args) 
	{
		String[] strArray = new String[5];
		int[] intArray = {1, 2, 3};
		
		
		System.out.println(intArray.length);
		
		ArrayList<String> strList = new ArrayList<String>();
		System.out.println(strList.size());
		strList.add("a");
		strList.add(0, "b");
		System.out.println(strList);
		
		System.out.println(strList.get(0));
		strList.remove(0);
		strList.remove("a");
		System.out.println(strList);
		
	}

}
