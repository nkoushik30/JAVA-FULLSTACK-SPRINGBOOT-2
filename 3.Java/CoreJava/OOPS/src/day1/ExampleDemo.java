package day1;

class Example {
	
	private int x;
	private int y;

	//Default Constructor
	public Example() {
		x = 10;
		y = 11;
	}
	
	//Parameterized Constructor
	public Example(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void display() {
		System.out.println("x = " + x);
		System.out.println("y = " + y);
	}
	
	public void sum() {
		System.out.println("Sum = " + (x + y) + "\n");
	}
}

public class ExampleDemo {
	
	public static void main(String[] args) {	
		
		Example obj1 = new Example();
		obj1.display();
		obj1.sum();
		
		Example obj2 = new Example(10, 20);
		obj2.display();
		obj2.sum();
		
		Example obj3 = new Example(30, 40);
		obj3.display();
		obj3.sum();
	}
}









