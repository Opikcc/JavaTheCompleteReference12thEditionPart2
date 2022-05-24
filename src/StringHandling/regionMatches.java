package StringHandling;

public class regionMatches {

	public static void main(String[] args) {
		String s1 = "Invoking STRING Object.";
		String s2 = "String that need to be compare";
		
		if(s1.regionMatches(true, 9, s2, 0, 7))
			System.out.println("s1 matches with region of s2.");
		else
			System.out.println("s1 doesn't matches with region of s2.");
	}

}
