package Collections;

import java.util.LinkedList;

// A simple mailing list example.
public class MailList {
	public static void main(String[] args) {
		LinkedList<Address> ml = new LinkedList<>();
		
		// Add elements to the linked list.
		ml.add(new Address("J.W. West", "11 Oak Ave", "Urbana", "IL", "61801"));
		ml.add(new Address("Ralph Baker", "1142 Maple Lane", "Mahomat", "IL", "61853"));
		ml.add(new Address("Tom Carlton", "867 Elm St", "Champaign", "IL", "61820"));
		
		// Display the mailing list.
		for(Address element : ml)
			System.out.println(element + "\n");
		
		System.out.println();
	}
}
