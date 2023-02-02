package week3;

public class TallyRunner {

	public static void main(String[] args) {
		//Create 2 counters, 
		
		Counter counter1 = new Counter();
		Counter counter2 = new Counter();
		
		//increment the first counter twice
		counter1.click();
		counter1.click();
		
		//increment the second counter once, 
		counter2.click();
		
		//increment the first counter again
		counter1.click();
		
		// print out the count values of each counter.
		System.out.println(counter1.getValue());
		System.out.println(counter2.getValue());
	}

}
