package FileHandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Demo8 {
	public static void main(String[] args) throws IOException {

		FileWriter fw = new FileWriter("Myfile3.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		Scanner sc = new Scanner(System.in);

		String data;
		char c = 0;

		do {
			try {
				System.out.println("enter the data : ");
				data = sc.next();
				bw.write(data + " ");
				System.out.println("do you want to add some data(y/n) : ");
				c = sc.next().charAt(0);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} while (c == 'y' || c == 'Y');

		bw.close();
		fw.close();
		sc.close();
		System.out.println("data written ....");
	}
}
