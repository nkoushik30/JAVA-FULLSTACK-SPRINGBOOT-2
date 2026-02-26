package Threding;

class Example{
	public void print(){
		System.out.print(" Java Is ");
		
		try{
			Thread.sleep(1000);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		System.out.println(" Object Oriented");
	}
}

class MyThread10 extends Thread {
	Example obj;
	
	public MyThread10(Example obj){
		this.obj = obj;
	}
	@Override
	public void run(){
		synchronized(obj){
			obj.print();
		}
	}
}

public class Demo10 {

	public static void main(String[] args) {
		// Thread Synchronization

		Example obj = new Example();
		
		MyThread10 t1 = new MyThread10(obj);
		MyThread10 t2 = new MyThread10(obj);
		MyThread10 t3 = new MyThread10(obj); 
			
		t1.start();
		t2.start();
		t3.start();
		

	}

}
