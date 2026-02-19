package Inheritence1;


class parent1 {
	public void m1() {
		System.out.println("public method 1 from Parent 1");
	}
}

interface Parent2 {
	public void m2();
}

interface Parent3 {
	public void m3();
}

class myChild extends parent1 implements Parent2, Parent3 {
	
	@Override
	public void m3() {
		System.out.println("Method 3");
	}

	@Override
	public void m2() {
		System.out.println("Method 2");
	}
}
public class Demo6{
	public static void main(String[] args) {
		myChild obj = new myChild();
		obj.m1();
		obj.m2();
		obj.m3();
	}
}

