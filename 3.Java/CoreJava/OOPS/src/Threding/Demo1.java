package Threding;

class MyThread1 extends Thread{
	@Override
	public void run(){
		System.out.println("Thread Executed");
	}
	public void dust(){
		System.out.println("Object Dust is executed ...");
	}
	
}

public class Demo1 {
	public static void main(String[] args) {
		MyThread1 obj = new MyThread1();
		obj.dust();
		Thread t1 = new Thread(obj);
		t1.run();
		
	}
}
