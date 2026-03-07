package day5;

import java.util.Scanner;

public class RunBankApp {

	public static void main(String[] args) {

		int choice = 0;
		int custId;
		String firstName;
		String lastName;
		double balance;
		String result;
		double amount;

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		Bank bank = new Bank();

		while (true) {
			System.out.println("Select Your Choice");
			System.out.println("******************");

			System.out.println("1. Add Commercial Customer");
			System.out.println("2. Add Personal Customer");

			// create functions for each show method
			System.out.println("3. Show All Customers");
			System.out.println("4. Show Customer By Id");
			System.out.println("5. Deposite");
			System.out.println("6. Withdraw");
			System.out.println("7. Get Balance");
			System.out.println("8. Get Customer By Name");
			System.out.println("9. Funds Transfer");
			System.out.println("10. Exit \n");

			System.out.print("Enter Your Choice: ");
			choice = scan.nextInt();
			System.out.println();

			switch (choice) {

			case 1:
				System.out.print("Enter First Name : ");
				firstName = scan.next();

				System.out.print("Enter  Last Name : ");
				lastName = scan.next();

				System.out.print("Balance  Amount  : ");
				balance = scan.nextDouble();

				System.out.print("ContactPersonName: ");
				String contactPersonName = scan.next();

				System.out.print("Contact Person No: ");
				long contactPersonNumber = scan.nextLong();

				result = bank.addCommercialCustomer(firstName, lastName, balance, contactPersonName,
						contactPersonNumber);

				System.out.println(result);

				break;

			case 2:
				System.out.print("Enter First Name : ");
				firstName = scan.next();

				System.out.print("Enter  Last Name : ");
				lastName = scan.next();

				System.out.print("Balance  Amount  : ");
				balance = scan.nextDouble();

				System.out.print("Home Phone Number: ");
				long homePhone = scan.nextLong();

				System.out.print("Work Phone Number: ");
				long workPhone = scan.nextLong();

				result = bank.addPersonalCustomer(firstName, lastName, balance, homePhone, workPhone);

				System.out.println(result);

				break;

			case 3:
				result = bank.showAllCustomers();
				System.out.println(result);
				break;

			case 4:
				System.out.print("Enter Customer Id: ");
				custId = scan.nextInt();

				result = bank.showCustomerById(custId);
				System.out.println(result);
				break;

			case 5:
				System.out.print("Enter Customer Id: ");
				custId = scan.nextInt();

				System.out.print("Enter the Amount : ");
				amount = scan.nextDouble();

				result = bank.deposite(custId, amount);
				System.out.println(result);
				break;

			case 6:
				System.out.print("Enter Customer Id: ");
				custId = scan.nextInt();

				System.out.print("Enter the Amount : ");
				amount = scan.nextDouble();

				result = bank.withdraw(custId, amount);
				System.out.println(result);
				break;

			case 7:
				System.out.print("Enter Customer Id: ");
				custId = scan.nextInt();

				result = bank.getBalance(custId);
				System.out.println(result);
				break;

			case 8:
				System.out.print("Enter FirstName: ");
				firstName = scan.next();

				result = bank.getCustomerByName(firstName);
				System.out.println(result);
				break;

			case 9:
				System.out.print("Enter Customer Id  : ");
				custId = scan.nextInt();

				System.out.print("Enter BeneficiaryId: ");
				int beneficiaryId = scan.nextInt();

				System.out.print("Enter the Amount   : ");
				amount = scan.nextDouble();

				result = bank.fundsTransfer(custId, beneficiaryId, amount);
				System.out.println(result);

				break;

			case 10:
				System.out.println("Application Terminated...");
				System.exit(0);
				break;

			default:
				System.out.println("Invalid Choice!!!");
				break;
			}

			System.out.println("\n");
		}
	}
}
