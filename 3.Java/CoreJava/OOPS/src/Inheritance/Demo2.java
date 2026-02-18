package Inheritance;

class Parent2 {
	public Parent2() {
		System.out.println("Hello from parent2");
	}
}

class Child2 extends Parent2 {
	public Child2() {
		super();
		System.out.println("Child extends parent2 with super");
	}
}

public class Demo2 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Child2 obj = new Child2();
	}

}
