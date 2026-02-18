package Day3;

public class Demo2 {

	public static void main(String[] args) {
		Demo1 obj = new Demo1();
		obj.m1(); // public
		// obj.m2(); //private
		obj.m3(); // protected
		obj.m4(); // default
	}

}
