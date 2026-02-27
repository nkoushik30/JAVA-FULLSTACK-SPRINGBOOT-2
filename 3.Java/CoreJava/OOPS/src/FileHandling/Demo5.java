package FileHandling;

import java.io.FileOutputStream;
import java.io.IOException;

public class Demo5 {
	public static void main(String[] args) throws IOException {
		int i = 65;
		FileOutputStream fos = new FileOutputStream("Myfile2.txt");

		while (i <= 90) {
			fos.write((char) i);
			fos.write((char) ' ');
			i++;
		}
		try {
			fos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
