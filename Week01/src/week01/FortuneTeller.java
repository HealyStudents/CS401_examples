/**
 * 
 */
package week01;
import javax.swing.JOptionPane;

/**
 * In this example, the program takes in input from the user
 * and uses that input to tell their future.
 * @author Pat Healy
 *  
 */
public class FortuneTeller 
{

	public static void main(String[] args) 
	{
		//Welcome the user
		JOptionPane.showMessageDialog(null, "Welcome! Fortunes! Ahhhhhh!!!!!");
		
		// TODO ask them their name and age
		String name = JOptionPane.showInputDialog("What's your name?");
		int age = Integer.parseInt(JOptionPane.showInputDialog("What's your age?")); //Takes in the user's age and converts it to an integer
		
		// TODO Instantiate a magic number (Integer)
		String magicString = JOptionPane.showInputDialog(null, "Please input a magic integer.");
		int magicInt = Integer.parseInt(magicString);
		
		// TODO Instantiate a magic divisor (Floating Point Number)
		magicString = JOptionPane.showInputDialog(null, "Please input a magic float.");
		float magicFloat = Float.parseFloat(magicString);
		
		// TODO Calculate a number of days using this formula:
		// 			Calculate integer x:
		//				divide their age by the magic number
		//				add this ^ to the age modulo the magic number
		int x = age / magicInt;
		x = x + (age % magicInt);
		// 			Calculate integer y:
		//				take the length of their name
		//				divide it by the magic divisor
		//				Round this quotient to the nearest whole number
		int y = Math.round(name.length() / magicFloat);
		
		
		// days is going to be x + y, modulo magic number
		int days = (x + y) % magicInt;
		
		// Print this message to the user
		JOptionPane.showMessageDialog(null, "Thank you, " + name);
		JOptionPane.showMessageDialog(null, "The shadows from above said that you will be given an important oportunity in the future, in exactly " + days + " days from now. \nDo not miss it!");

	}

}
