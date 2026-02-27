package Threding;

class Test {
	public void m1() {
		for (int i = 1; i < 6; i++) {
			System.out.println("Method -1 : i " + i);

			try {
				Thread.sleep(1000);
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}
		}
	}

	public void m2() {
		for (int i = 1; i < 6; i++) {
			System.out.println("Method -2 : i " + i);
		}
	}
}

class Thread1 extends Thread {
	public void run() {
		Test test = new Test();
		test.m1();
	}
}

class Thread2 extends Thread {
	public void run() {
		Test test = new Test();
		test.m2();
	}
}

public class Demo11 {

	public static void main(String[] args) {

		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();

		t1.run();
		t2.run();

	}

}
