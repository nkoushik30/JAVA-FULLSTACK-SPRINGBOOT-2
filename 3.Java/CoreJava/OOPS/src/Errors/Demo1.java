package Errors;

import java.util.Scanner;

public class Demo1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a, b :  ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		try {
			int c = a / b;
			System.out.println("Quotient : " + c);
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("Enter a, b without zero:  ");
			a = sc.nextInt();
			b = sc.nextInt();
			int c = a / b;
			System.out.println("Quotient : " + c);
		}
		System.out.println("Hello all");
		sc.close();
	}
}
