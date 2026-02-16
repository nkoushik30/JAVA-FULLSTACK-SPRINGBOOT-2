package day2;

public class Demo1 {

	byte a;
	short b;
	int c;
	long d;
	float e;
	double f;
	boolean g;
	char h;
	String i;
	
	public Demo1() {
		a = 10;
		b = 20;
	}
	
	public static void main(String[] args) {

		Demo1 obj = new Demo1();		
		System.out.println("a = " + obj.a + "\nb = " + obj.b + "\nc = " + obj.c);
		System.out.println("d = " + obj.d + "\nb = " + obj.e + "\nc = " + obj.f);
		System.out.println("g = " + obj.g + "\nh = " + obj.h + "\ni = " + obj.i);
		System.out.println();
		
		Demo1 obj2 = new Demo1();		
		System.out.println("a = " + obj2.a + "\nb = " + obj2.b + "\nc = " + obj2.c);
		System.out.println("d = " + obj2.d + "\nb = " + obj2.e + "\nc = " + obj2.f);
		System.out.println("g = " + obj2.g + "\nh = " + obj2.h + "\ni = " + obj2.i);
		System.out.println();
		
		Demo1 obj3 = new Demo1();		
		System.out.println("a = " + obj3.a + "\nb = " + obj3.b + "\nc = " + obj3.c);
		System.out.println("d = " + obj3.d + "\nb = " + obj3.e + "\nc = " + obj3.f);
		System.out.println("g = " + obj3.g + "\nh = " + obj3.h + "\ni = " + obj3.i);
		System.out.println();
	}
}
