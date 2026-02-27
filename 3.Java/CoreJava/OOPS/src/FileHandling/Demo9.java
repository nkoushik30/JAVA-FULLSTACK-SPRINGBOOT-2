package FileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Demo9 {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("C:/Vit3/vitb2an/3.Java/CoreJava/OOPS/src/FileHandling/Demo9.java");
		BufferedReader br = new BufferedReader(fr);

		int data;

		while ((data = br.read()) != -1) {
			System.out.print((char) data);
		}
		br.close();
		fr.close();
		System.out.println("\ndata read successfully ....");
	}
}
