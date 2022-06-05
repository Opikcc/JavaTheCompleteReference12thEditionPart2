package UtilityClasses;

import java.util.StringTokenizer;

// Demonstrate StringTokenizer.
public class STDemo {
	
	static String in = "title=Java: The Complete Reference;" +
			"author=Schildt;" +
			"publisher=McGraw Hill;" +
			"copyright=2022";

	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer(in, "=;");
		
		while(st.hasMoreElements()) {
			String key = st.nextToken();
			String val = st.nextToken();
			System.out.println(key + "\t" + val);
		}
	}

}
