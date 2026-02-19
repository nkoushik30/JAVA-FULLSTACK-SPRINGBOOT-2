package Inheritance;

class parent7{
	public parent7(){
		System.out.println("Constructor from parent");
	}
}
class myChild3 extends parent7{
	public myChild3(){
		System.out.println("Constructor from myChild3");
	}
}
class myChild4 extends parent7{
	public myChild4(){
		System.out.println("Constructor from myChild4");
	}
}

public class Demo7 {

	public static void main(String[] args) {
		myChild4 obj1 = new myChild4();
		myChild3 obj2 = new myChild3();
		
		
		
	}

}
