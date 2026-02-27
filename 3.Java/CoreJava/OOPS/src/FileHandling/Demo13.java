package FileHandling;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class Demo13 {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("Myfile5.txt");
		ObjectInputStream ois= new ObjectInputStream(fis);
		
		List<Employee> emplist = new ArrayList<Employee>();
		
		for(Employee emp : emplist){
			System.out.println(emp);
		}
		ois.close();
		fis.close();
	}
}
