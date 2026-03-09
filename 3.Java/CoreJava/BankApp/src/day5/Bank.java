package day5;


import java.sql.Statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Bank {
	public Connection getConnection() {
		Connection conn = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root", "Koushik@123");

		} catch (Exception e) {
			e.printStackTrace();
		}

		return conn;
	}

	public String addCommercialCustomer(String firstName, String lastName, double balance, String contactPersonName,
			long contactPersonNumber) {

		String result = "";

		try {

			Connection conn = getConnection();

			// insert into customer table (custid auto generated)
			String query1 = "INSERT INTO customer (firstname, lastname, balance) VALUES (?, ?, ?)";

			PreparedStatement ps1 = conn.prepareStatement(query1, Statement.RETURN_GENERATED_KEYS);

			ps1.setString(1, firstName);
			ps1.setString(2, lastName);
			ps1.setDouble(3, balance);

			ps1.executeUpdate();

			// get generated custid
			ResultSet rs = ps1.getGeneratedKeys();
			int custId = 0;

			if (rs.next()) {
				custId = rs.getInt(1);
			}

			// insert into commercialcustomer
			String query2 = "INSERT INTO commercialcustomer (custid, contactpersonname, contactpersonnumber) VALUES (?, ?, ?)";

			PreparedStatement ps2 = conn.prepareStatement(query2);

			ps2.setInt(1, custId);
			ps2.setString(2, contactPersonName);
			ps2.setLong(3, contactPersonNumber);

			ps2.executeUpdate();

			conn.close();

			result = "Commercial Customer Added Successfully\nCustomer Id: " + custId;

		} catch (Exception e) {
			e.printStackTrace();
		}

		return result;
	}

	/*
	 * public String addPersonalCustomer(String firstName, String lastName,
	 * double balance, long homePhone, long workPhone) {
	 * 
	 * PersonalCustomer personalCustomer = new PersonalCustomer(firstName,
	 * lastName, balance, homePhone, workPhone);
	 * customerList.add(personalCustomer);
	 * 
	 * return "Personal Customer Added Successfully \n" + "Customer Id: " +
	 * personalCustomer.getCustId(); }
	 */
	public String addPersonalCustomer(String firstName, String lastName, double balance, long homePhone,
			long workPhone) {

		String result = "";

		try {

			Connection conn = getConnection();

			// Insert into customer table
			String query1 = "INSERT INTO customer (firstname, lastname, balance) VALUES (?, ?, ?)";

			PreparedStatement ps1 = conn.prepareStatement(query1, Statement.RETURN_GENERATED_KEYS);

			ps1.setString(1, firstName);
			ps1.setString(2, lastName);
			ps1.setDouble(3, balance);

			ps1.executeUpdate();

			// Get generated customer ID
			ResultSet rs = ps1.getGeneratedKeys();
			int custId = 0;

			if (rs.next()) {
				custId = rs.getInt(1);
			}

			// Insert into personalcustomer table
			String query2 = "INSERT INTO personalcustomer (custid, homephone, workphone) VALUES (?, ?, ?)";

			PreparedStatement ps2 = conn.prepareStatement(query2);

			ps2.setInt(1, custId);
			ps2.setLong(2, homePhone);
			ps2.setLong(3, workPhone);

			ps2.executeUpdate();

			conn.close();

			result = "Personal Customer Added Successfully\nCustomer Id: " + custId;

		} catch (Exception e) {
			e.printStackTrace();
		}

		return result;
	}

	/*
	 * public String showAllCustomers() {
	 * 
	 * if (customerList.isEmpty()) return
	 * "Customers Not Found, List is Empty!!!"; String result = ""; for (Object
	 * obj : customerList) { result += (Customer) obj + "\n"; } return result; }
	 */
	public String showAllCustomers() {

		String result = "";

		try {

			Connection conn = getConnection();

			String query = "SELECT * FROM customer";

			Statement stmt = (Statement) conn.createStatement();

			ResultSet rs = ((java.sql.Statement) stmt).executeQuery(query);

			while (rs.next()) {

				result += "Customer ID: " + rs.getInt("custid") + " First Name: " + rs.getString("firstname")
						+ " Last Name: " + rs.getString("lastname") + " Balance: " + rs.getDouble("balance") + "\n";
			}

			conn.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

		if (result.isEmpty())
			return "No Customers Found";

		return result;
	}

	/*
	 * public String showCustomerById(int custId) {
	 * 
	 * if (customerList.isEmpty()) return
	 * "Customers Not Found, List is Empty!!!";
	 * 
	 * for (Object obj : customerList) { Customer customer = (Customer) obj; if
	 * (customer.getCustId() == custId) { return customer + ""; } } return
	 * "Customer Record Not Found!"; }
	 */
	public String showCustomerById(int custId) {

		String result = "";

		try {

			Connection conn = getConnection();

			String query = "SELECT * FROM customer WHERE custid=?";

			PreparedStatement ps = conn.prepareStatement(query);

			ps.setInt(1, custId);

			ResultSet rs = ps.executeQuery();

			if (rs.next()) {

				result = "Customer ID: " + rs.getInt("custid") + " First Name: " + rs.getString("firstname")
						+ " Last Name: " + rs.getString("lastname") + " Balance: " + rs.getDouble("balance");
			}

			conn.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

		if (result.isEmpty())
			return "Customer Not Found";

		return result;
	}

	/*
	 * public String deposite(int custId, double amount) {
	 * 
	 * if (customerList.isEmpty()) return
	 * "Customers Not Found, List is Empty!!!";
	 * 
	 * for (Object obj : customerList) { Customer customer = (Customer) obj;
	 * 
	 * if (customer.getCustId() == custId) {
	 * customer.setBalance(customer.getBalance() + amount); return
	 * "Amount Deposited Successfully \n" + "Customer Id: " + custId + "\n" +
	 * "New Balance: " + customer.getBalance(); } } return
	 * "Customer Record Not Found!"; }
	 */

	public String deposite(int custId, double amount) {

		String result = "";

		try {

			Connection conn = getConnection();

			// check if customer exists
			String checkQuery = "SELECT balance FROM customer WHERE custid = ?";
			PreparedStatement ps1 = conn.prepareStatement(checkQuery);

			ps1.setInt(1, custId);

			ResultSet rs = ps1.executeQuery();

			if (!rs.next()) {
				conn.close();
				return "Customer Record Not Found!";
			}

			// update balance
			String updateQuery = "UPDATE customer SET balance = balance + ? WHERE custid = ?";
			PreparedStatement ps2 = conn.prepareStatement(updateQuery);

			ps2.setDouble(1, amount);
			ps2.setInt(2, custId);

			ps2.executeUpdate();

			// get updated balance
			String balanceQuery = "SELECT balance FROM customer WHERE custid = ?";
			PreparedStatement ps3 = conn.prepareStatement(balanceQuery);

			ps3.setInt(1, custId);

			ResultSet rs2 = ps3.executeQuery();

			double newBalance = 0;

			if (rs2.next()) {
				newBalance = rs2.getDouble("balance");
			}

			conn.close();

			result = "Amount Deposited Successfully\nCustomer Id: " + custId + "\nNew Balance: " + newBalance;

		} catch (Exception e) {
			e.printStackTrace();
		}

		return result;
	}

	/*
	 * public String withdraw(int custId, double amount) {
	 * 
	 * if (customerList.isEmpty()) return
	 * "Customers Not Found, List is Empty!!!";
	 * 
	 * for (Object obj : customerList) { Customer customer = (Customer) obj; if
	 * (customer.getCustId() == custId) { try { if (customer.getBalance() >=
	 * amount) { customer.setBalance(customer.getBalance() - amount);
	 * 
	 * return "Amount Withdrawn Successfully \n" + "Customer Id: " + custId +
	 * "\n" + "New Balance: " + customer.getBalance(); } else { throw new
	 * InsufficientFundsException("no sufficient funds available"); } } catch
	 * (InsufficientFundsException ie) { System.out.println(ie); } } } return
	 * "Customer Record Not Found!"; }
	 */
	public String withdraw(int custId, double amount) {

		String result = "";

		try {

			Connection conn = getConnection();

			// Step 1: Check current balance
			String checkQuery = "SELECT balance FROM customer WHERE custid = ?";
			PreparedStatement ps1 = conn.prepareStatement(checkQuery);

			ps1.setInt(1, custId);

			ResultSet rs = ps1.executeQuery();

			if (!rs.next()) {
				conn.close();
				return "Customer Record Not Found!";
			}

			double balance = rs.getDouble("balance");

			// Step 2: Check sufficient balance
			if (balance < amount) {
				conn.close();
				return "Withdrawal Failed: Insufficient Balance!";
			}

			// Step 3: Update balance
			String updateQuery = "UPDATE customer SET balance = balance - ? WHERE custid = ?";
			PreparedStatement ps2 = conn.prepareStatement(updateQuery);

			ps2.setDouble(1, amount);
			ps2.setInt(2, custId);

			ps2.executeUpdate();

			// Step 4: Get updated balance
			String balanceQuery = "SELECT balance FROM customer WHERE custid = ?";
			PreparedStatement ps3 = conn.prepareStatement(balanceQuery);

			ps3.setInt(1, custId);

			ResultSet rs2 = ps3.executeQuery();

			double newBalance = 0;

			if (rs2.next()) {
				newBalance = rs2.getDouble("balance");
			}

			conn.close();

			result = "Amount Withdrawn Successfully\nCustomer Id: " + custId + "\nNew Balance: " + newBalance;

		} catch (Exception e) {
			e.printStackTrace();
		}

		return result;
	}

	/*
	 * 
	 * public String getBalance(int custId) {
	 * 
	 * if (customerList.isEmpty()) return
	 * "Customers Not Found, List is Empty!!!";
	 * 
	 * for (Object obj : customerList) { Customer customer = (Customer) obj;
	 * 
	 * if (customer.getCustId() == custId) { return "Balance: " +
	 * customer.getBalance(); } }
	 * 
	 * return "Customer Record Not Found!"; }
	 */

	public String getBalance(int custId) {

		String result = "";

		try {

			Connection conn = getConnection();

			String query = "SELECT balance FROM customer WHERE custid = ?";

			PreparedStatement ps = conn.prepareStatement(query);

			ps.setInt(1, custId);

			ResultSet rs = ps.executeQuery();

			if (rs.next()) {

				double balance = rs.getDouble("balance");

				result = "Balance: " + balance;

			} else {

				result = "Customer Record Not Found!";
			}

			conn.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return result;
	}

	/*
	 * public String getCustomerByName(String firstName) {
	 * 
	 * if (customerList.isEmpty()) return
	 * "Customers Not Found, List is Empty!!!";
	 * 
	 * String result = "";
	 * 
	 * for (Object obj : customerList) { Customer customer = (Customer) obj;
	 * 
	 * if (customer.getFirstName().equals(firstName)) { result += customer +
	 * "\n"; } }
	 * 
	 * if (result.length() != 0) { return result; } return
	 * "Customer Record(s) Not Found!"; }
	 */

	public String getCustomerByName(String firstName) {

		String result = "";

		try {

			Connection conn = getConnection();

			String query = "SELECT * FROM customer WHERE firstname=?";

			PreparedStatement ps = conn.prepareStatement(query);

			ps.setString(1, firstName);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {

				result += "Customer ID: " + rs.getInt("custid") + " First Name: " + rs.getString("firstname")
						+ " Last Name: " + rs.getString("lastname") + " Balance: " + rs.getDouble("balance") + "\n";
			}

			conn.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

		if (result.isEmpty())
			return "Customer Not Found";

		return result;
	}

	/*
	 * public Customer getCustomer(int custId) {
	 * 
	 * for (Object obj : customerList) { Customer customer = (Customer) obj; if
	 * (customer.getCustId() == custId) {
	 * 
	 * return customer; } } return null; }
	 */
	public Customer getCustomer(int custId) {

		Customer customer = null;

		try {

			Connection conn = getConnection();

			// get base customer info
			String query = "SELECT * FROM customer WHERE custid = ?";
			PreparedStatement ps = conn.prepareStatement(query);

			ps.setInt(1, custId);

			ResultSet rs = ps.executeQuery();

			if (!rs.next()) {
				conn.close();
				return null;
			}

			String firstName = rs.getString("firstname");
			String lastName = rs.getString("lastname");
			double balance = rs.getDouble("balance");

			// check if personal customer
			String pQuery = "SELECT * FROM personalcustomer WHERE custid = ?";
			PreparedStatement ps2 = conn.prepareStatement(pQuery);

			ps2.setInt(1, custId);

			ResultSet rs2 = ps2.executeQuery();

			if (rs2.next()) {

				long homePhone = rs2.getLong("homephone");
				long workPhone = rs2.getLong("workphone");

				customer = new PersonalCustomer(firstName, lastName, balance, homePhone, workPhone);
			} else {

				// check commercial customer
				String cQuery = "SELECT * FROM commercialcustomer WHERE custid = ?";
				PreparedStatement ps3 = conn.prepareStatement(cQuery);

				ps3.setInt(1, custId);

				ResultSet rs3 = ps3.executeQuery();

				if (rs3.next()) {

					String contactPersonName = rs3.getString("contactpersonname");
					long contactPersonNumber = rs3.getLong("contactpersonnumber");

					customer = new CommercialCustomer(firstName, lastName, balance, contactPersonName,
							contactPersonNumber);
				}
			}

			conn.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return customer;
	}

	/*
	 * public String fundsTransfer(int custId, int beneficiaryId, double amount)
	 * {
	 * 
	 * if (customerList.isEmpty()) return
	 * "Customers Not Found, List is Empty!!!";
	 * 
	 * Customer customer = getCustomer(custId); Customer beneficiary =
	 * getCustomer(beneficiaryId);
	 * 
	 * if (customer == null) return "Customer Not Found, Check the Customer Id";
	 * 
	 * if (beneficiary == null) return
	 * "Beneficiary Customer Not Found, Check BeneficiaryId"; try { if
	 * (customer.getBalance() >= amount) {
	 * 
	 * customer.setBalance(customer.getBalance() - amount);
	 * beneficiary.setBalance(beneficiary.getBalance() + amount); return
	 * "funds successfully transferred from " + custId + " to " + beneficiaryId
	 * + " ."; } else { throw new
	 * InsufficientFundsException("no sufficient funds in your account to transfer"
	 * );
	 * 
	 * } } catch (InsufficientFundsException ie) { System.out.println(ie); }
	 * return "FundsTransfer Failed: Insufficient Balance..."; }
	 */

	public String fundsTransfer(int custId, int beneficiaryId, double amount) {

		String result = "";

		try {

			Connection conn = getConnection();

			conn.setAutoCommit(false); // start transaction

			// check sender balance
			String checkQuery = "SELECT balance FROM customer WHERE custid = ?";
			PreparedStatement ps1 = conn.prepareStatement(checkQuery);
			ps1.setInt(1, custId);

			ResultSet rs1 = ps1.executeQuery();

			if (!rs1.next()) {
				conn.close();
				return "Customer Not Found, Check the Customer Id";
			}

			double balance = rs1.getDouble("balance");

			if (balance < amount) {
				conn.close();
				return "FundsTransfer Failed: Insufficient Balance";
			}

			// check beneficiary exists
			PreparedStatement ps2 = conn.prepareStatement(checkQuery);
			ps2.setInt(1, beneficiaryId);

			ResultSet rs2 = ps2.executeQuery();

			if (!rs2.next()) {
				conn.close();
				return "Beneficiary Customer Not Found";
			}

			// deduct from sender
			String deductQuery = "UPDATE customer SET balance = balance - ? WHERE custid = ?";
			PreparedStatement ps3 = conn.prepareStatement(deductQuery);

			ps3.setDouble(1, amount);
			ps3.setInt(2, custId);

			ps3.executeUpdate();

			// add to beneficiary
			String addQuery = "UPDATE customer SET balance = balance + ? WHERE custid = ?";
			PreparedStatement ps4 = conn.prepareStatement(addQuery);

			ps4.setDouble(1, amount);
			ps4.setInt(2, beneficiaryId);

			ps4.executeUpdate();

			conn.commit(); // commit transaction

			conn.close();

			result = "Funds successfully transferred from " + custId + " to " + beneficiaryId;

		} catch (Exception e) {
			e.printStackTrace();
			result = "FundsTransfer Failed";
		}

		return result;
	}

}
