package day2;

public class Bank {

	int index = -1;
	Customer[] customers = new Customer[3];	

	public String addCommercialCustomer(String firstName, String lastName, 
	double balance, String contactPersonName, long contactPersonNumber) {

		CommercialCustomer commercialCustomer = new CommercialCustomer(
		firstName, lastName, balance, contactPersonName, contactPersonNumber);

		if (index < 2) {
			customers[++index] = commercialCustomer;

			return "Commercial Customer Added Successfully \n" + 
			"Customer Id: " + commercialCustomer.getCustId();
		} 

		return "Cannot Add Commercial Customer: Array is Full!!!";		
	}

	public String addPersonalCustomer(String firstName, String lastName, 
			double balance, long homePhone, long workPhone) {

		PersonalCustomer personalCustomer = new PersonalCustomer(
				firstName, lastName, balance, homePhone, workPhone);

		if (index < 2) {
			customers[++index] = personalCustomer;

			return "Personal Customer Added Successfully \n" + 
			"Customer Id: " + personalCustomer.getCustId();
		} 

		return "Cannot Add Personal Customer: Array is Full!!!";		
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


	public Customer getCustomer(int custId) {

		for (int i = 0; i <= index; i++) {

			if (customers[i].getCustId() == custId) {

				return customers[i];
			}
		}		
		return null;
	}


	public String fundsTransfer(int custId, 
			int beneficiaryId, double amount) {

		if (index < 0)
			return "No Customers Found, Array is Empty!!!";

		Customer customer = getCustomer(custId);
		Customer beneficiary = getCustomer(beneficiaryId);

		if (customer == null)
			return "Customer Not Found, Check the Customer Id";

		if (beneficiary == null)
			return "Beneficiary Customer Not Found, Check BeneficiaryId";


		if (customer.getBalance() >= amount) {

			customer.setBalance(customer.getBalance() - amount);
			beneficiary.setBalance(beneficiary.getBalance() + amount);

			return  "FundsTransfered Successful \n" + 
			"New Balance: " + customer.getBalance();
		}

		return "FundsTransfer Failed: Insufficient Balance...";
	}

}








