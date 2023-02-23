package midterm_review;

public class Variables {

	public static void main(String[] args) {
		int a = 5;
		int b = 8;
		double c = 3.6;
		double d = 8.2;
		
		System.out.println(a/b);
		System.out.println(c/d);
		
		System.out.println(a/c);
		System.out.println(a/((int)c));
		System.out.println((int)(a/c));
		
		char e = 'e';
		char f = 'f';
		
		System.out.println(e + f);
		System.out.println("" + e + f);
		
		String str2 = String.valueOf(e);
		
		String str3 = "71";
		int g = Integer.parseInt(str3);
		char gLetter = (char)Integer.parseInt(str3);
		System.out.println(gLetter);
	}

}
