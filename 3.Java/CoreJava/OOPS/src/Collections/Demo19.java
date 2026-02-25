package Collections;

public class Demo19 {

	public static void main(String[] args) {
		// Manual unboxing - unboxing Wrapper classes into Primitive datatypes

		Byte a1 = 10;
		byte a = a1.byteValue();

		System.out.println("\nByte Unboxed to byte Manually : " + a);

		Short b1 = 122;
		short b = b1.shortValue();

		System.out.println("\nShort Unboxed to short Manually : " + b);

		Integer c1 = 21;
		int c = c1.intValue();

		System.out.println("\nInteger Unboxed to int : Manually " + c);

		Long d1 = 1234l;
		long d = d1.longValue();

		System.out.println("\nLong Unboxed to long Manually : " + d);

		Float e1 = 12.32f;
		float e = e1.floatValue();

		System.out.println("\nFloat is Unboxed to float Manually : " + e);

		Double f1 = 12345.12345;
		double f = f1.doubleValue();

		System.out.println("\nDouble is Unboxed to double Manually : " + f);

		Boolean g1 = true;
		boolean g = g1.booleanValue();

		System.out.println("\nBoolean is Unboxed to boolean Manually : " + g);

		Character h1 = 'l';
		char h = h1.charValue();

		System.out.println("\nCharacter is Unboxed to char Manually : " + h);

		String str = "koushik";
		System.out.println("\nalready String is a class it cannot be Boxed to : " + str);

	}
}