package week7;

import java.util.ArrayList;
import java.io.*;

public class PersonReader 
{

	public static void main(String[] args) 
	{
		String fileName = args[0];
		ArrayList<Person> data = readData(fileName);
		Person oldest = findEldest(data);
		System.out.println(oldest.getName());
	}
	
	public static ArrayList<Person> readData(String fileName)
	{
		try 
		{
			FileReader fr = new FileReader(fileName);
			BufferedReader br = new BufferedReader(fr);
			ArrayList<Person> people = new ArrayList<Person>();
			
			String line = br.readLine();
			while(line != null)
			{
				//System.out.println(line);
				
				//Parse data from the line
				String[] data = line.split(";");
				String personName = data[0];
				int age = Integer.parseInt(data[1]);
				
				//Make a person object
				Person person = new Person(personName, age);
				
				//Add them to the list
				people.add(person);
				
				//Read the next line
				line = br.readLine();
			}
			
			return people;
		}
		catch(IOException e)
		{
			System.out.println("Error reading!!!");
			return null;
		}
	}
	
	public static Person findEldest(ArrayList<Person> persons)
	{
		int maxAge = 0;
		Person oldest = null;
		
		for(Person p : persons)
		{
			if(p.getAge() > maxAge)
			{
				maxAge = p.getAge();
				oldest = p;
			}
		}
		
		return oldest;
	}

	
}
