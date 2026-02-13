package day1;

public class Demo2 {
	public static void main(String[] args) {
		
		byte a = 127;
		short b = 32767;
		int c = 2147483647;
		long d = 2147483647890L;		
		float e = 1.123456f;
		double f = 1.1234567890;		
		char g = '@';
		String h = "Welcome All";		
		boolean i = true;
		
		System.out.println("byte    a = " + a);
		System.out.println("short   b = " + b);
		System.out.println("int     c = " + c);
		System.out.println("long    d = " + d);
		System.out.println("float   e = " + e);
		System.out.println("double  f = " + f);
		System.out.println("char    g = " + g);
		System.out.println("String  h = " + h);
		System.out.println("boolean i = " + i);
		System.out.println();
		
		System.out.println("a = " + a + "\nb = " + b + "\nc = " + c);
		System.out.println("d = " + d + "\ne = " + e + "\nf = " + f);
		System.out.println("g = " + g + "\nh = " + h + "\ni = " + i);
	}
}
