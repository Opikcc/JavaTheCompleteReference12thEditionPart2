package StringHandling;

public class startsWith {

	public static void main(String[] args) {
		if("Foobar".startsWith("Fooo"))
			System.out.println("Foobar starts with Foo");
		else if("Foobar".startsWith("bar", 3))
				System.out.println("Foobar starts with bar");
		else
			System.out.println("Foobar doesn't starts with Foo");
	}

}
