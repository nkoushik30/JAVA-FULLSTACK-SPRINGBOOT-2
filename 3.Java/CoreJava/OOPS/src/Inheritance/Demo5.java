package Inheritance;

class grandParent {
	void m1() {
		System.out.println("Grand parent method 1");
	}
}

class parent extends grandParent {
	void m2() {
		System.out.println("Method 2 from parent class ");

	}
}

class child5 extends parent {
	void m3() {
		System.out.println("method 3 from child class ");
	}
}

public class Demo5 {

	public static void main(String[] args) {
		child5 obj = new child5();
		obj.m1();
		obj.m2();
		obj.m3();
	}

}
