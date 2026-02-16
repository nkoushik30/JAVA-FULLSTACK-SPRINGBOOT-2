package day2;

class Customer {	
	
	private static int counter = 1001;
	
	private int custId;
	private String custName;
	private double balance;
	
	public Customer() {
		this.custId = counter++;
	}

	public Customer(String custName, double balance) {
		
		this.custId = counter++;
		this.custName = custName;
		this.balance = balance;
	}

	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}

	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", balance=" + balance + "]";
	}
}

public class CustomerDemo {
	public static void main(String[] args) {
		
		Customer[] customers = new Customer[3];
		
		customers[0] = new Customer("Harsha", 1212.12);
		customers[1] = new Customer("Pasha ", 2323.23);
		customers[2] = new Customer("Venkat", 3434.34);
		
		for (Customer cust : customers) {
			System.out.println(cust);
		}
	}
}



