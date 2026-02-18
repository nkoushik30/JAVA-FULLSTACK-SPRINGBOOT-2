package accessDemo;

import Day3.Demo1;

public class Demo4 extends Demo1{

	public static void main(String[] args) {

		Demo4 obj = new Demo4();
		obj.m1(); // public
		// obj.m2(); //private
		obj.m3(); // protected
		// obj.m4(); // default
	}
}
