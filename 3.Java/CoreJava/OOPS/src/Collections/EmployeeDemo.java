package Collections;

import java.util.ArrayList;

public class EmployeeDemo {

	public static void main(String[] args) {
		// storing the Employee details via parent class Employee by accessing
		// the lists
		ArrayList<Employee> employeeList = new ArrayList<Employee>();

		employeeList.add(new Employee(1001, "Koushik", 1234.543));
		employeeList.add(new Employee(1002, "chandu", 987.43));
		employeeList.add(new Employee(1003, "josh", 139.9));
		employeeList.add(new Employee(1004, "tarun", 12.3));

		System.out.println(employeeList);

		for (Object obj : employeeList) {
			System.out.println((Employee) obj);
		}
	}

}
