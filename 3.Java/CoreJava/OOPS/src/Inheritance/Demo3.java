package Inheritance;

class Parent3{
	public Parent3(){
		System.out.println("Constructor from Parent 3 class");
	}
	public Parent3(int x){
		System.out.println("Parent class constructor with a parameter :::: "+x);
	}
}
class Child3 extends Parent3{
	public Child3(){
		System.out.println("Constructor from child 3");
	}
	public Child3(int x){
		super(10);
		System.out.println("Parameterized Constructor from child 3");
	}
}

public class Demo3 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Child3 obj1 = new Child3();
		Child3 obj2 = new Child3(20);
	}

}
