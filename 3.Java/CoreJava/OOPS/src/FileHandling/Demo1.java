package FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class Demo1 {

	public static void main(String[] args) {
		// file handling concepts

		FileWriter writer = null;

		try {
			writer = new FileWriter("Myfile.txt", true);
			writer.write("Line-3 \n");
		} catch (IOException ie) {
			ie.printStackTrace();
		} finally {
			try {
				if (writer != null) {
					writer.close();
				}
			} catch (IOException ie) {
				ie.printStackTrace();
			}
		}
		System.out.println(":done writing:");

	}

}
