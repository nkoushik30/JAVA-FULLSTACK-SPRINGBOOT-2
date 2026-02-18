package Inheritance;

//using super keyword for classes

class Parent4{
	public void m1(){
		System.out.println("Method 1 from Parent4 class :::::");
	}
	public void m2(int x){
		System.out.println("method 2 from Parent4 class with parameter int : "+x);
	}
}
class Child4 extends Parent4{
	public void childMethod(){
		super.m1();
		super.m2(20);
	}
}

public class Demo4 {

	public static void main(String[] args) {
		Child4 obj = new Child4();
		obj.childMethod();
	}

}
