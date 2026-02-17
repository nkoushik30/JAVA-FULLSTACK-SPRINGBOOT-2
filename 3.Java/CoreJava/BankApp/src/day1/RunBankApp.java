package day1;

import java.util.Scanner;

public class RunBankApp {

	public static void main(String[] args) {

		int choice = 0;
		int custId;
		int custId1;
		int custId2;

		String firstName;
		String lastName;
		double balance;
		String result;
		double amount;

		Scanner scan = new Scanner(System.in);
		Bank bank = new Bank();

		while (true) {
			System.out.println("Select Your Choice");
			System.out.println("******************");

			System.out.println("1. Add Customer");
			System.out.println("2. Show All Customers");
			System.out.println("3. Show Customer By Id");
			System.out.println("4. Deposite");
			System.out.println("5. Withdraw");
			System.out.println("6. Get Balance");
			System.out.println("7. Get Customer By Name");
			System.out.println("8. Funds Transfer");
			System.out.println("9. Exit \n");

			System.out.print("Enter Your Choice: ");
			choice = scan.nextInt();
			System.out.println();

			switch (choice) {

			case 1:
				System.out.print("Enter First Name: ");
				firstName = scan.next();

				System.out.print("Enter  Last Name: ");
				lastName = scan.next();

				System.out.print("Balance  Amount : ");
				balance = scan.nextDouble();

				result = bank.addCustomer(firstName, lastName, balance);
				System.out.println(result);

				break;

			case 2:
				result = bank.showAllCustomers();
				System.out.println(result);
				break;

			case 3:
				System.out.print("Enter Customer Id: ");
				custId = scan.nextInt();

				result = bank.showCustomerById(custId);
				System.out.println(result);
				break;

			case 4:
				System.out.print("Enter Customer Id: ");
				custId = scan.nextInt();

				System.out.print("Enter the Amount : ");
				amount = scan.nextDouble();

				result = bank.deposite(custId, amount);
				System.out.println(result);
				break;

			case 5:
				System.out.print("Enter Customer Id: ");
				custId = scan.nextInt();

				System.out.print("Enter the Amount : ");
				amount = scan.nextDouble();

				result = bank.withdraw(custId, amount);
				System.out.println(result);
				break;

			case 6:
				System.out.print("Enter Customer Id: ");
				custId = scan.nextInt();

				result = bank.getBalance(custId);
				System.out.println(result);
				break;

			case 7:
				System.out.print("Enter FirstName: ");
				firstName = scan.next();

				result = bank.getCustomerByName(firstName);
				System.out.println(result);
				break;

			case 8:
				System.out.println("Enter Payer account id : ");
				custId1 = scan.nextInt();

				System.out.println("Enter enter amount to be transferred : ");
				amount = scan.nextDouble();

				System.out.println("Enter Payee/reciever account id : ");
				custId2 = scan.nextInt();
				bank.transferFunds(custId1, custId2, amount);

				break;

			case 9:
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
