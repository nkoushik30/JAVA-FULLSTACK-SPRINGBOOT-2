package day5;

import java.util.List;
import java.util.ArrayList;

public class Bank {

	int index = -1;
	List<Customer> customerList = new ArrayList<Customer>();

	public String addCommercialCustomer(String firstName, String lastName, double balance, String contactPersonName,
			long contactPersonNumber) {

		CommercialCustomer commercialCustomer = new CommercialCustomer(firstName, lastName, balance, contactPersonName,
				contactPersonNumber);
		customerList.add(commercialCustomer);
		return "Commercial Customer Added Successfully \n" + "Customer Id: " + commercialCustomer.getCustId();
	}

	public String addPersonalCustomer(String firstName, String lastName, double balance, long homePhone,
			long workPhone) {

		PersonalCustomer personalCustomer = new PersonalCustomer(firstName, lastName, balance, homePhone, workPhone);
		customerList.add(personalCustomer);

		return "Personal Customer Added Successfully \n" + "Customer Id: " + personalCustomer.getCustId();
	}

	public String showAllCustomers() {

		if (customerList.isEmpty())
			return "Customers Not Found, List is Empty!!!";
		String result = "";
		for (Object obj : customerList) {
			result += (Customer) obj + "\n";
		}
		return result;
	}

	public String showCustomerById(int custId) {

		if (customerList.isEmpty())
			return "Customers Not Found, List is Empty!!!";

		for (Object obj : customerList) {
			Customer customer = (Customer) obj;
			if (customer.getCustId() == custId) {
				return customer + "";
			}
		}
		return "Customer Record Not Found!";
	}

	public String deposite(int custId, double amount) {

		if (customerList.isEmpty())
			return "Customers Not Found, List is Empty!!!";

		for (Object obj : customerList) {
			Customer customer = (Customer) obj;

			if (customer.getCustId() == custId) {
				customer.setBalance(customer.getBalance() + amount);
				return "Amount Deposited Successfully \n" + "Customer Id: " + custId + "\n" + "New Balance: "
						+ customer.getBalance();
			}
		}
		return "Customer Record Not Found!";
	}

	public String withdraw(int custId, double amount) {

		if (customerList.isEmpty())
			return "Customers Not Found, List is Empty!!!";

		for (Object obj : customerList) {
			Customer customer = (Customer) obj;
			if (customer.getCustId() == custId) {
				try {
					if (customer.getBalance() >= amount) {
						customer.setBalance(customer.getBalance() - amount);

						return "Amount Withdrawn Successfully \n" + "Customer Id: " + custId + "\n" + "New Balance: "
								+ customer.getBalance();
					} else {
						throw new InsufficientFundsException("no sufficient funds available");
					}
				} catch (InsufficientFundsException ie) {
					System.out.println(ie);
				}
			}
		}
		return "Customer Record Not Found!";
	}

	public String getBalance(int custId) {

		if (customerList.isEmpty())
			return "Customers Not Found, List is Empty!!!";

		for (Object obj : customerList) {
			Customer customer = (Customer) obj;

			if (customer.getCustId() == custId) {
				return "Balance: " + customer.getBalance();
			}
		}

		return "Customer Record Not Found!";
	}

	public String getCustomerByName(String firstName) {

		if (customerList.isEmpty())
			return "Customers Not Found, List is Empty!!!";

		String result = "";

		for (Object obj : customerList) {
			Customer customer = (Customer) obj;

			if (customer.getFirstName().equals(firstName)) {
				result += customer + "\n";
			}
		}

		if (result.length() != 0) {
			return result;
		}
		return "Customer Record(s) Not Found!";
	}

	public Customer getCustomer(int custId) {

		for (Object obj : customerList) {
			Customer customer = (Customer) obj;
			if (customer.getCustId() == custId) {

				return customer;
			}
		}
		return null;
	}

	public String fundsTransfer(int custId, int beneficiaryId, double amount) {

		if (customerList.isEmpty())
			return "Customers Not Found, List is Empty!!!";

		Customer customer = getCustomer(custId);
		Customer beneficiary = getCustomer(beneficiaryId);

		if (customer == null)
			return "Customer Not Found, Check the Customer Id";

		if (beneficiary == null)
			return "Beneficiary Customer Not Found, Check BeneficiaryId";
		try {
			if (customer.getBalance() >= amount) {

				customer.setBalance(customer.getBalance() - amount);
				beneficiary.setBalance(beneficiary.getBalance() + amount);
				return "funds successfully transferred from " + custId + " to " + beneficiaryId + " .";
			} else {
				throw new InsufficientFundsException("no sufficient funds in your account to transfer");

			}
		} catch (InsufficientFundsException ie) {
			System.out.println(ie);
		}
		return "FundsTransfer Failed: Insufficient Balance...";
	}
}
