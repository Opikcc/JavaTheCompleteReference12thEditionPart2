package Collections;

import java.util.ArrayDeque;

// Demonstrate ArrayDeque.
public class ArrayDequeDemo {

	public static void main(String[] args) {
		// Create an array deque.
		ArrayDeque<String> adq = new ArrayDeque<String>();
		
		// Use an ArrayDeque like a stack.
		adq.push("A");
		adq.push("B");
		adq.push("D");
		adq.push("E");
		adq.push("F");

		System.out.print("popping the stack: ");
		
		while(adq.peek() != null)
			System.out.print(adq.pop() + " ");
		
		System.out.println();
		System.out.println("adq size : " + adq.size());
	}

}
