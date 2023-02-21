package week6;

import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.io.*;

public class Examples_2_21_23 
{

	public static void main(String[] args) 
	{
		//System.out.println(askNumber());
		
		ArrayList<String> lines = readLineByLine("data/phrases.txt");
	    processLines(lines);
	    writeTextFromArray(lines, "data/processed.txt");
	}
	
	//Write a program that 
	//reads all lines from a text file, 
	//convert everything to uppercase, and 
	//truncate the lines with more than 80 characters to 80 characters
	//The program is implemented below, you have to 
	// implement the static methods that are called
	
	public static void writeTextFromArray(ArrayList<String> lines, String path) //throws IOException
	{
		try 
		{
			FileWriter fw = new FileWriter(path);
			BufferedWriter bw = new BufferedWriter(fw);
			
			for(String line: lines)
			{
				bw.write(line);
				bw.write("\n");
			}
			
			bw.close();
			fw.close();
		}
		catch(IOException e)
		{
			System.out.println("Problem in writeTextFromArray: " + e.getMessage());
		}
		
	}

	
	public static void processLines(ArrayList<String> lines)
	{
		for(int i = 0; i < lines.size(); i++)
		{
			String line = lines.get(i).toUpperCase();
			lines.set(i, line);
		}
	}
	
	public static ArrayList<String> readLineByLine(String path) //throws IOException
	{
		ArrayList<String> lines = new ArrayList<String>();
		try 
		{
			FileReader fr = new FileReader(path);
			BufferedReader br = new BufferedReader(fr);
			
			String line = "";
			
			while((line = br.readLine()) != null)
			{
				lines.add(line);
			}
			
			br.close();
			fr.close();
		}
		catch(IOException e)
		{
			System.out.println("Problem in readLineByLine: " + e.getMessage());
		}
		
		return lines;
	}

	public static double askNumber()
	{
		String in1 = JOptionPane.showInputDialog("Enter a number");
		if(in1 != null && in1.length()>0)
		{
			try 
			{
				return Double.parseDouble(in1);
			}
			catch(NumberFormatException e)
			{
				System.out.println(e.getMessage());
				e.printStackTrace();
				return 0.0;
			}
		}
		else
		{
			return 0.0;
		}
	}


}
