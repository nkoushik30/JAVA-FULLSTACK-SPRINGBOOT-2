package day1;

import java.util.Scanner;

public class Demo14 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter a Number1: ");
		int num1 = scan.nextInt();

		System.out.print("Enter a Number2: ");
		int num2 = scan.nextInt();

		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);
		scan.close();

	}
}