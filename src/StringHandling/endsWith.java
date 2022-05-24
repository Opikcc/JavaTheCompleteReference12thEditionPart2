package StringHandling;

public class endsWith {

	public static void main(String[] args) {
		if("Foobar".endsWith("bar"))
			System.out.println("Foobar ends with bar");
		else if("Foobar".endsWith("Foo"))
				System.out.println("Foobar ends with Foo");
		else
			System.out.println("Foobar doesn't ends with bar");
	}

}
