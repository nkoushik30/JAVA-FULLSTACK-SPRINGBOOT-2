package FileHandling;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Demo12 {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("Myfile4.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		List<Employee> emplist= new ArrayList<Employee>();

		emplist.add(new Employee(101, "koushik", 123.123));
		emplist.add(new Employee(102, "shaik", 123.123));
		emplist.add(new Employee(103, "karthik", 123453.34));
		System.out.println(emplist+ "\n");
	}
}
