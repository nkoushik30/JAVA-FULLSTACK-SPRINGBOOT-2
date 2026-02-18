package Inheritance;


class Parent1{
	public void m1(){
		System.out.println("Demo parent1 method");
	}
}
class Child extends Parent1{
	
}
public class Demo1 {

	public static void main(String[] args) {
		Child obj = new Child();
		obj.m1();
	}

}
