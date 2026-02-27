package Threding;

class MyThread8 implements Runnable {
	private String name;

	public MyThread8(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		System.out.println(name);
	}
}

public class Demo8 {
	public static void main(String[] args) {
		MyThread8 t1 = new MyThread8("T1");
		MyThread8 t2 = new MyThread8("T2");
		MyThread8 t3 = new MyThread8("T3");

		Thread a1 = new Thread(t1);
		Thread a2 = new Thread(t2);
		Thread a3 = new Thread(t3);

		System.out.println(" Program Started ...");
		a1.start();
		a2.start();
		a3.start();

		try {
			a1.join();
			a2.join();
			a3.join();
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println(" Program Teriminated ...");
	}
}
