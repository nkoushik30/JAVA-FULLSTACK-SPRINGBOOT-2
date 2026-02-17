package day1;

public class Customer {

	private static int counter = 1001;
	
	private int custId;
	private String firstName;
	private String lastName;
	private double balance;
	
	public Customer() {
		this.custId = counter++;
	}

	public Customer(String firstName, String lastName, double balance) {
		this.custId = counter++;
		this.firstName = firstName;
		this.lastName = lastName;
		this.balance = balance;
	}

	public int getCustId() {
		return custId;
	}

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Customer [custId=" + custId + 
				", Name=" + firstName + " " + lastName + 
				", balance="+ balance + "]";
	}
}
