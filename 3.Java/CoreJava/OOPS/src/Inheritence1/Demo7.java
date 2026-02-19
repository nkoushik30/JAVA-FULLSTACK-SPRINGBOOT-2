package Inheritence1;

/*class parent7{
	void m1(){
		System.out.println("method of parent");
	}
}
class child7 extends parent7{
	void m2(){
		System.out.println("method of Child");
	}
	@Override
	void m1(){
		System.out.println("Modified method of parent in clild class ");
	}
}
public class Demo7 {

	public static void main(String[] args) {
		parent7 obj = new parent7();
		obj.m1();
		//obj.m2(); 
		
		child7 obj2= new child7();
		obj2.m1();
		obj2.m2();
	}

}
*/

abstract class parent7 {
	abstract void m1();
}

class child7 extends parent7 {
	void m2() {
		System.out.println("method of Child");
	}

	@Override
	void m1() {
		System.out.println("Modified method of parent in clild class ");
	}
}

public class Demo7 {

	public static void main(String[] args) {
		parent7 obj = new parent7();
		obj.m1();
		// obj.m2();

		child7 obj2 = new child7();
		obj2.m1();
		obj2.m2();
	}

}






////to do list of this program is appy abstract, interface, override, 