package Errors;

import java.util.Scanner;

// Remove: import javax.naming.AuthenticationException;
@SuppressWarnings("unused")

public class DemoThrows1 {
	private String userName;
	private String password;

	// Custom exception
	@SuppressWarnings("serial")
	public static class InvalidLoginException extends Exception {
		public InvalidLoginException(String message) {
			super(message);
		}
	}

	private void login(String userName, String password) throws InvalidLoginException {
		this.userName = userName;
		this.password = password;

		String validUser = "Koushik_iam";
		String validPass = "Koushik@1234567890";

		if (validUser.equals(userName) && validPass.equals(password)) {
			System.out.println("Login successful");
		} else {
			throw new InvalidLoginException("Invalid username or password");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter username: ");
		String userName = sc.next();
		System.out.println("Enter password: ");
		String password = sc.next();

		DemoThrows1 obj = new DemoThrows1();
		try {
			obj.login(userName, password);
		} catch (InvalidLoginException e) {
			System.out.println("Login failed: " + e.getMessage());
		} finally {
			sc.close();
		}
	}
}