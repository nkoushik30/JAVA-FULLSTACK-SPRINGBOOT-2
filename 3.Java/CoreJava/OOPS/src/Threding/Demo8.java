package Threding;
 

class MyThread7 implements Runnable{
private String name;
	
	public MyThread7(String name){
		this.name = name;
	}
	@Override
	public void run(){
		System.out.println(name);
	}
}


public class Demo8 {
	public static void main(String[] args) {
		MyThread7 t1 = new MyThread7("T1");
		MyThread7 t2 = new MyThread7("T2");
		MyThread7 t3 = new MyThread7("T3");
		
		Thread a1 = new Thread(t1);
		Thread a2 = new Thread(t2);
		Thread a3 = new Thread(t3);

		System.out.println(" Program Started ...");
		a1.start();
		a2.start();
		a3.start();
		
		try{
			a1.join();
			a2.join();
			a3.join();
		}catch(Exception e){
			e.printStackTrace();
		}
		
		System.out.println(" Program Teriminated ...");
	}
}
