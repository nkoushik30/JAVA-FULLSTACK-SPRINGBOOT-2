package Day3;

public class Demo1 {
	public void m1() {
		System.out.println("Hello public Demo1 method");
	}

	private void m2() {
		System.out.println("Hello private Demo1 method");
	}

	protected void m3() {
		System.out.println("Hello protected Demo1 method");
	}

	void m4() {
		System.out.println("Hello default Demo1 method");
	}

	public static void main(String args[]) {
		Demo1 obj = new Demo1();

		obj.m1(); // public
		obj.m2(); // private
		obj.m3(); // protected
		obj.m4(); // default

	}
}
