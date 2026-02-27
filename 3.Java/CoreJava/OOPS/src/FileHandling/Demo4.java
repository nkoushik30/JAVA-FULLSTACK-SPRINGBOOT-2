package FileHandling;

import java.io.FileReader;
import java.io.IOException;

public class Demo4 {
	public static void main(String[] args) throws IOException {
		int data;
		FileReader reader = null;

		try {
			reader = new FileReader("Myfile.txt");
			while ((data = reader.read()) != -1) {
				System.out.print((char) data);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (reader != null) {
					reader.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
