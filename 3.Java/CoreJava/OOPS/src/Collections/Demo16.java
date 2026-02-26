package Collections;

public class Demo16 {

	public static void main(String[] args) {
		// Boxing and unboxing in java
		// AutoBoxing - it converts premitive data type into Object without
		// manual intervention

		byte a = 10;
		Byte a1 = a;
		System.out.println("Unboxing and boxing");
		System.out.println("\nbyte boxed to Byte : " + a1);
		System.out.println("proof if boxed to Byte or not : " + a1.getClass().getName());

		short b = 12;
		Short b1 = b;

		System.out.println("\nshort boxed to Short : " + b1);
		System.out.println("proof if boxed to Short or not : " + b1.getClass().getName());

		int c = 122;
		Integer c1 = c;

		System.out.println("\nint boxed to Integer : " + c1);
		System.out.println("proof if boxed to Integer or not : " + b1.getClass().getName());

		long d = 1237656;
		Long d1 = d;

		System.out.println("\nlong boxed to Long : " + d1);
		System.out.println("proof if long is boxed or not : " + d1.getClass().getName());

		float e = 123.0f;
		Float e1 = e;

		System.out.println("\nfloat is boxed to Float : " + e1);
		System.out.println("proof if flaot is really boxed or not : " + e1.getClass().getName());

		double f = 1220383.344;
		Double f1 = f;

		System.out.println("\ndouble is boxed to Double : " + f1);
		System.out.println("proof if double is boxed or not : " + f1.getClass().getName());

		boolean g = true;
		Boolean g1 = g;

		System.out.println("\nboolean is Boxed to Boolean : " + g1);
		System.out.println("proof if g id boxed or not : " + g1.getClass().getName());

		char h = 'k';
		Character h1 = h;

		System.out.println("\nchar is boxed to Character : " + h1);
		System.out.println("proof if char is boxed or not : " + h1.getClass().getName());

		String str = "koushik";
		System.out.println("\nalready String is a class it cannot be Boxed to : " + str);

	}

}
