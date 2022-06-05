package UtilityClasses;

import java.util.Formatter;

// Demonstrate a field-width specifier.
public class FormatDemo3 {

	public static void main(String[] args) {
		Formatter fmt = new Formatter();
		
		fmt.format("|%f|%n|%12f|%n|%012f|",
								10.12345, 10.12345, 10.12345);
		System.out.println(fmt);
		fmt.close();
	}

}
