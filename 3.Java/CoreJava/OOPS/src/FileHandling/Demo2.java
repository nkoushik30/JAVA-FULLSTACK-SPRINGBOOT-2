package FileHandling;

import java.io.FileWriter;
import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		// data entry using do while
		Scanner sc = new Scanner(System.in);

		FileWriter writer = null;
		char c = 0;
		do {
			try {
				writer = new FileWriter("good.txt", true);
				System.out.println("enter the data : ");
				String data = sc.next();
				writer.write(data + "\n");
				writer.close();
				System.out.println("do you want to add some data(y/n) : ");
				c = sc.next().charAt(0);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} while (c == 'y' || c == 'Y');

		System.out.println("Writing stopped");
		sc.close();
	}

}
