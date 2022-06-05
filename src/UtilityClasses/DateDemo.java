package UtilityClasses;

import java.util.Date;

// Show date and time using only Date methods.
public class DateDemo {

	public static void main(String[] args) {
		// Instantiate a Date object
		Date date = new Date();
		
		// display time and date using toString()
		System.out.println(date);
		
		// Display number of miliseconds since midnight, January 1, 1970 GMT
		long msec = date.getTime();
		System.out.println("Miliseconds since Jan 1, 1970 GMT = " + msec);

	}

}
