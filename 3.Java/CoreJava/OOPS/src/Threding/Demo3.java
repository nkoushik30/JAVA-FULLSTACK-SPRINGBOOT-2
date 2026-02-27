package Threding;

class MyThread3 extends Thread {
	private String name;

	public MyThread3(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		System.out.println(name + " Excuted...");
	}
}

public class Demo3 {
	public static void main(String[] args) {

	}
}
