package Inheritance;
// demo on hierarchical inheritance 
class parent6 {
	void m1() {
		System.out.println("Parent6 method 1");
	}
}

class myChild1 extends parent6 {
	void m2() {
		System.out.println("Method 2 from mychild1 class ");

	}
}

class myChild2 extends parent6 {
	void m3() {
		System.out.println("method 3 from mychild2 class ");
	}
}

public class Demo6 {

	public static void main(String[] args) {
		myChild1 obj1 = new myChild1();
		obj1.m1();
		obj1.m2();

		myChild2 obj2 = new myChild2();
		obj2.m1();
		obj2.m3();
	}

}
