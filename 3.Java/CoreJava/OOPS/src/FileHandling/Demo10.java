package FileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Demo10 {
	public static void main(String[] args) throws IOException {
		// read line by line
		FileReader fr = new FileReader("C:/Vit3/vitb2an/3.Java/CoreJava/OOPS/src/FileHandling/Demo9.java");
		BufferedReader br = new BufferedReader(fr);

		String data;

		while ((data = br.readLine()) != null) {
			System.out.print("\n" + data);
		}
		br.close();
		fr.close();
		System.out.println("\ndata read successfully ....");
	}
}
