package Threding;

class MyThread5 extends Thread{
private String name;
	
	public MyThread5(String name){
		this.name = name;
	}
	@Override
	public void run(){
		System.out.println(name);
	}
}

public class Demo5 {
	public static void main(String[] args) {
		MyThread5 t1 = new MyThread5("T1");
		MyThread5 t2 = new MyThread5("T2");
		MyThread5 t3 = new MyThread5("T3");

		System.out.println("T1 priority : "+ t1.getPriority());
		System.out.println("T2 priority : "+ t2.getPriority());
		System.out.println("T3 priority : "+ t3.getPriority());
		System.out.println();
		
		t1.setPriority(1); //low
		t2.setPriority(5); // mid
		t3.setPriority(10); // high
		
		System.out.println("T1 priority : "+ t1.getPriority());
		System.out.println("T2 priority : "+ t2.getPriority());
		System.out.println("T3 priority : "+ t3.getPriority());
		System.out.println();
		
		t1.start();
		t2.start();
		t3.start();
		
	}
}
