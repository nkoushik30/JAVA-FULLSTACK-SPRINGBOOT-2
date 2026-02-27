package Threding;

class buffer implements Runnable {

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Runnable#run()
	 */
	public void run() {
		//
		System.out.println("Runnable interface");
	}
}

public class Demo7 {

	public static void main(String[] args) {
		// Creating thread using runnable

		System.out.println(new buffer());

	}

}
