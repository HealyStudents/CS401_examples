/**
 * 
 */
package week02;
import javax.swing.JOptionPane;

/**
 * @author Pat Healy
 *
 */
public class LuckyNumber 
{

	public static void main(String[] args) 
	{
		int myNumber = askInteger();

		if(checkLuckyNumber(myNumber)) 
		{
			JOptionPane.showMessageDialog(null, "That's lucky!");
		}
		else
		{
			JOptionPane.showMessageDialog(null, "That's unlucky! :(");
		}

	}
	public static int askInteger()
	{
		// get a number from the user
		return Integer.parseInt(JOptionPane.showInputDialog("Give me a number!"));
	}
	
	public static boolean checkLuckyNumber(int n){
		// For a number to be lucky, it has to be 2 digits and it can't be 13
		if(("" + n).length() == 2) 
		{
			if(n != 13) 
			{
				return true;
			}
		}
		return false;
	}
}
