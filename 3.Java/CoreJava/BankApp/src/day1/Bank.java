package day1;

public class Bank {

	int index = -1;
	Customer[] customers = new Customer[3];	

	public String addCustomer(String firstName, 
			String lastName, double balance) {

		Customer customer = new Customer(firstName, lastName, balance);   

		if (index < 2) {
			customers[++index] = customer;
		} else {
			return "Cannot Add Customer: Array is Full!!!";
		}

		return 	"Account Created Successfully \n" + 
		"Customer Id: " + customer.getCustId();
	}

	public String showAllCustomers() {

		if (index < 0)
			return "No Customers Found, Array is Empty!!!";

		String result = "";

		for (int i = 0; i <= index; i++) {
			result += customers[i] + "\n";
		}

		return result;
	}

	public String showCustomerById(int custId) {

		if (index < 0)
			return "No Customers Found, Array is Empty!!!";

		for (int i = 0; i <= index; i++) {

			if (customers[i].getCustId() == custId) {

				return customers[i].toString();
			}
		}

		return "Customer Record Not Found!";
	}

	public String deposite(int custId, double amount) {

		if (index < 0)
			return "No Customers Found, Array is Empty!!!";

		for (int i = 0; i <= index; i++) {
			if (customers[i].getCustId() == custId) {

				customers[i].setBalance(
						customers[i].getBalance() + amount);
				
				return  "Amount Deposited Successfully \n" + 
						"Customer Id: " + custId + "\n" + 
						"New Balance: " + customers[i].getBalance();
			}
		}
		return "Customer Record Not Found!";
	}

	public String withdraw(int custId, double amount) {
		if (index < 0)
			return "No Customers Found, Array is Empty!!!";

		for (int i = 0; i <= index; i++) {
			if (customers[i].getCustId() == custId) {
				if (customers[i].getBalance() >= amount) {					
					customers[i].setBalance(
							customers[i].getBalance() - amount);
					
					return  "Amount Withdrawn Successfully \n" + 
							"Customer Id: " + custId + "\n" + 
							"New Balance: " + customers[i].getBalance();
				} else {
					return "Failed to Withdran Amount: Insufficient Funds!";      
				}
			}
		}
		return "Customer Record Not Found!";
	}

	public String getBalance(int custId) {
		
		if (index < 0)
			return "No Customers Found, Array is Empty!!!";

		for (int i = 0; i <= index; i++) {
			if (customers[i].getCustId() == custId) {				
				return "Balance: " + customers[i].getBalance();
			}
		}

		return "Customer Record Not Found!";
	}

	public String getCustomerByName(String firstName) {

		if (index < 0)
			return "No Customers Found, Array is Empty!!!";

		String result = "";
		
		for (int i = 0; i <= index; i++) {				
			if (customers[i].getFirstName().equals(firstName)) {				
				result += customers[i] + "\n";
			}
		}
		
		if (result.length() != 0) {
			return result;
		}
		return "Customer Record(s) Not Found!";
	}
	public String transferFunds(int custId1, int custId2, double amount){
		if (index < 0)
			return "No Customers Found, Array is Empty!!!";
		
		for(int i=0;i<=index;i++){
			if(customers[i].getCustId() == custId1){
				if(customers[i].getBalance() > amount){
					deposite(custId2, (customers[i].getBalance()-amount));
					System.out.println(customers[i].getBalance());
				}
				else{
					return "Funds not available ";
				}
			}
		}
		return "Funds Transferred successfully: ";
	}

}








