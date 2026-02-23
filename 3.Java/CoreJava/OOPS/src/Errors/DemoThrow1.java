package Errors;

import java.util.Scanner;

import javax.imageio.IIOException;

public class DemoThrow1 {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IIOException {
		Scanner sc = new Scanner(System.in);

		String userName = "Koushik_iam";
		String pass = "Koushik@8309094146";

		System.out.println("Enter your username : ");
		String str1 = sc.next();
		System.out.println("Enter your password : ");
		String str2 = sc.next();
		try {
			if (!str1.equals(userName) && !str2.equals(pass)) {
				throw new SecurityException("Your login is Unsuccessful check yuor username, password");
			}
		} finally {
			System.out.println("FINALLY BLOCK");
		}
		sc.close();
	}
}
