package Threding;

class MyThread6 extends Thread {
	private String name;

	public MyThread6(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		for (int i = 1; i < 4; i++) {
			System.out.println(name);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}
		}
		if (name.equals("T3")) {
			System.out.println();

		}
	}
}

public class Demo6 {
	public static void main(String[] args) {
		MyThread6 t1 = new MyThread6("T1");
		MyThread6 t2 = new MyThread6("T2");
		MyThread6 t3 = new MyThread6("T3");

		System.out.println(" Program Started ...");
		t1.start();
		t2.start();
		t3.start();

		try {
			t1.join();
			t2.join();
			t3.join();
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println(" Program Teriminated ...");
	}
}
