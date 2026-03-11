package day1;

public class Demo6 {

	public static void main(String[] args) {

		int x = 25;
		int y = 0;
		System.out.println("x = " + x + ", y = " + y + "\n");

		System.out.println("Performing Pre Increment & Decrement");
		y = ++x;
		System.out.println("x = " + x + ", y = " + y + "\n");

		y = --x;
		System.out.println("x = " + x + ", y = " + y + "\n");

		System.out.println("Performing Post Increment & Decrement");
		y = x++;
		System.out.println("x = " + x + ", y = " + y + "\n");

		y = x--;
		System.out.println("x = " + x + ", y = " + y + "\n");

	}

}
