/**
 * 
 */
package week01;
import javax.swing.JOptionPane;
/**
 * @author Pat Healy
 *
 */
public class Variables 
{

	public static void main(String[] args) 
	{
		//8. Is this a legal declaration/initialization? Why?
		//char myFavoriteCharacter = "a";

		//9. How would you make a string of one character, 
		// 		taken from the start of the string defined below?
		String city = "Pittsburgh";
		char firstChar = city.charAt(0);

		//10. How would you calculate the length of the following string:
		String text = "Java Program";
		int len = text.length();
		
		// Swing IO Example
		JOptionPane.showMessageDialog(null, "Hi there!");
		String input = JOptionPane.showInputDialog("Write your name");
		System.out.println(input);
		JOptionPane.showMessageDialog(null,"Hi " + input);
		
		// 11. Given the following code, 
		// 		how would you convert the 
		// value of myString to an integer?
		String myString = "745";
		int myInteger = Integer.parseInt(myString);
		System.out.println(myInteger + 3);
	}

}
