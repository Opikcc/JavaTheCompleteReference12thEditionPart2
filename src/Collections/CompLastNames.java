package Collections;

import java.util.Comparator;

// Use thenComparing() to sort by last, then first name.
public class CompLastNames implements Comparator<String> {
	public int compare(String aStr, String bStr) {
		int i, j;
		
		// Find index of beginning of last name.
		i = aStr.lastIndexOf(' ');
		j = bStr.lastIndexOf(' ');
		
		return aStr.substring(i).compareToIgnoreCase(bStr.substring(j));
	}
}
