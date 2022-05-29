package ExploringJavaLang;

// Demonstrate isInfinite() and isNaN()
public class InfNaN {

	public static void main(String[] args) {
		Double d1 = Double.valueOf(1/0.0);
		Double d2 = Double.valueOf(0/0.0);
		
		System.out.println(d1 + ": " + d1.isInfinite() + ", " + d1.isNaN());
		System.out.println(d2 + ": " + d2.isInfinite() + ", " + d2.isNaN());

		System.out.println("Static bitCount(Integer.MAX_VALUE) : " + Integer.bitCount(Integer.MAX_VALUE));
		System.out.println("Highest One Bit (1000) : " + Integer.highestOneBit(1000));
		System.out.println("Number of Leading Zeros 1000 (" + Integer.toBinaryString(1000) + ") : " + Integer.numberOfLeadingZeros(1000));
		System.out.println("Remainder Unsigned (10/3) : " + Integer.remainderUnsigned(10, 3));
		System.out.println("Integer 10 : " + Integer.toBinaryString(10));
		System.out.println("Reverse 10 : " + Integer.reverse(10));
		System.out.println("Integer 10 Reverse : " + Integer.toBinaryString(Integer.reverse(10)));
	}

}
