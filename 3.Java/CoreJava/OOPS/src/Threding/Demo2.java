package Threding;

class MyThread2 extends Thread {
	@Override
	public void run() {

		System.out.println("Thread Executed ...");
	}
}

public class Demo2 {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		// Multithreads
		MyThread2 t = new MyThread2();
		try {
			t.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
