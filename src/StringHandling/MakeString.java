package StringHandling;

// Construct one String from another.
public class MakeString {

	public static void main(String[] args) {
		char[] c = {'J', 'a', 'v', 'a'};
		String s1 = new String(c);
		String s2 = new String(s1);
		String s3 = new String(c, 1, 3);
		String s4 = new String();
		String s5 = null;
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		if(s4 == null)
			System.out.println("s4 is null");
		if(s5 == null)
			System.out.println("s5 is null");
		
		s1 = "Another String";
		
		System.out.println(s1);
		System.out.println(s2);
		
		char[] chars = { 'a', 'b', 'c' };
		String s = new String(chars);
		System.out.println(s.length());
		
		String s6 = "abc";
		System.out.println("xyz".length());
		
		// Beware String concat
		String s7 = "four: " + 2 + 2;
		System.out.println(s7);
		
		char ch ;
		ch = "abc".charAt(2);
		System.out.println("ch : " + ch);
	}

}
