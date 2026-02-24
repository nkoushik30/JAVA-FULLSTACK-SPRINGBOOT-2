package Errors;

import java.util.Scanner;

@SuppressWarnings("serial")
class OddNumberException extends Exception {
	public OddNumberException(String msg) {
		super(msg);
	}
}

public class Demo6 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an Even number : ");
		int n = sc.nextInt();
		try {
			if ((n & 1) == 0) {
				System.out.println("Even number ");
			} else {
				throw new OddNumberException("Enter even number");
			}
		} catch (OddNumberException oe) {
			oe.printStackTrace();

		}
		System.out.println("\n hello world!!!");
		sc.close();
	}
}
