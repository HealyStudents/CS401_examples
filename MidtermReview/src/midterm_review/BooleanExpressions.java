package midterm_review;

public class BooleanExpressions 
{

	public static void main(String[] args) 
	{
		boolean a = false;
		boolean b = true;
		boolean c = 5 < 8;
		
		if(a) {System.out.println("A is true!");}
		else if (b) {System.out.println("b is true!");}
		else if (c) {System.out.println("c is true!");}
		else {System.out.println("All false!");}

		if(a && b) {System.out.println("And!");}
		
		if(a || b) {System.out.println("Or!");}
		
		if((a||b) && !c) {System.out.println("Ahhhhhhhhh!!!");}
		
	}

}
