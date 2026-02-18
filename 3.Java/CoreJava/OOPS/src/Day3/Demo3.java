package Day3;

public class Demo3 extends Demo1 {

	public static void main(String[] args) {

		Demo3 obj = new Demo3();
		obj.m1(); // public
		// obj.m2(); //private
		obj.m3(); // protected
		obj.m4(); // default
	}

}
