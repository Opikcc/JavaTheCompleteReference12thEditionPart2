package Collections;

import java.util.Comparator;
import java.util.TreeSet;

// A reverse comparator for strings.
public class CompDemo {

	public static void main(String[] args) {
		// Create a tree set.
		TreeSet<String> ts = new TreeSet<String>(new MyComp());
		
		// Add elements to the tree set.
		ts.add("C");
		ts.add("A");
		ts.add("B");
		ts.add("E");
		ts.add("F");
		ts.add("D");

		// Display the elements.
		for(String element : ts)
			System.out.print(element + " ");
		
		System.out.println();
		
		// Use a lambda expression to implement Comparator<String>.
		Comparator<String> mc = (aStr, bStr) -> aStr.compareTo(bStr);
		
		// Pass a reversed comparator to TreeSet() via a lambda expression.
		TreeSet<String> tsLmbd = new TreeSet<String>((aStr, bStr) -> bStr.compareTo(aStr));
		tsLmbd.add("X");
		tsLmbd.add("A");
		tsLmbd.add("C");
		tsLmbd.add("D");
		tsLmbd.add("Z");
		tsLmbd.add("J");
		
		for(String element : tsLmbd) 
			System.out.print(element + " ");
		
		System.out.println();
	}

}
