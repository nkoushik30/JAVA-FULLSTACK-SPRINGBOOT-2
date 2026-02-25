package Collections;

public class Demo18 {

	public static void main(String[] args) {
		// UnBoxing - represents all boxed Objects to premitive data types auto boxing 

		Byte a1 = 10;
		byte a = a1;

		System.out.println("\nByte Unboxed to byte : " + a);

		Short b1 = 122;
		short b = b1;

		System.out.println("\nShort Unboxed to short : " + b);

		Integer c1 = 21;
		int c = c1;

		System.out.println("\nInteger Unboxed to int : " + c);

		Long d1 = 1234l;
		long d = d1;

		System.out.println("\nLong Unboxed to long : " + d);

		Float e1 = 12.32f;
		float e = e1;

		System.out.println("\nFloat is Unboxed to float : " + e);

		Double f1 = 12345.12345;
		double f = f1;

		System.out.println("\nDouble is Unboxed to double : " + f);

		Boolean g1 = true;
		boolean g = g1;

		System.out.println("\nBoolean is Unboxed to boolean : " + g);

		Character h1 = 'l';
		char h = h1;

		System.out.println("\nCharacter is Unboxed to char : " + h);

		String str = "koushik";
		System.out.println("\nalready String is a class it cannot be Boxed to : " + str);

	}

}
