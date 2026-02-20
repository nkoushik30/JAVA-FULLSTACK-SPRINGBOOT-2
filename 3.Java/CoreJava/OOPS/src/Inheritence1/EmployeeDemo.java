package Inheritence1;

abstract class Employee {

	private static int counter = 1000;
	protected int empId;
	protected String empName;
	protected String address;

	public Employee() {
		this.empId = counter++;
	}

	public Employee(String empName, String address) {

		this.empId = counter++;
		this.empName = empName;
		this.address = address;
	}

	public abstract int calculateSalary();

}

class partTimeEmployee extends Employee {
	private int hoursWorked;

	public partTimeEmployee() {
	}

	public partTimeEmployee(String empName, String address, int hoursWorked) {
		super(address, empName); // getting address, empname from superclass
		this.hoursWorked = hoursWorked;
	}

	@Override
	public int calculateSalary() {
		int payPerHour = 200;
		return payPerHour * hoursWorked;
	}

	@Override
	public String toString() {
		return "partTimeEmployee [hoursWorked=" + hoursWorked + ", empId=" + empId + ", empName=" + empName
				+ ", address=" + address + ", Salary(_____) for " + hoursWorked + " Hours of work " + calculateSalary()
				+ "]";
	}

}

class fullTimeEmployee extends Employee {
	private int daysWorked;

	public fullTimeEmployee() {
	}

	public fullTimeEmployee(String empName, String address, int daysWorked) {
		super(address, empName); // getting address, empname from superclass
		this.daysWorked = daysWorked;
	}

	@Override
	public int calculateSalary() {
		int salary = 30000;
		int payPerday = salary / 30;
		return payPerday * daysWorked;
	}

	@Override
	public String toString() {
		return "fullTimeEmployee [daysWorked=" + daysWorked + ", empId=" + empId + ", empName=" + empName + ", address="
				+ address + ", Salary(_____)=" + calculateSalary() + "]";
	}

}

public class EmployeeDemo {

	public static void main(String[] args) {
		partTimeEmployee pte = new partTimeEmployee("koushik", "hyderabad", 12);
		System.out.println("part time employee details : " + pte);
		fullTimeEmployee fte = new fullTimeEmployee("koushik", "hyderabad", 28);
		System.out.println("full time employee details : " + fte);

	}

}
