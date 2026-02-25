package day1;

import java.util.Scanner;

public class Demo12 {
	public static void main(String[] args) {
		
		int a = 10;
		int b = 3;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Select Your Choice");
		System.out.println("******************");
		
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		System.out.println("5. All Operations");
		System.out.println("6. Exit \n");
		
		System.out.print("Enter Your Choice: ");
		int choice = scan.nextInt();
		System.out.println();
		
		switch(choice) {		
		case 1: System.out.println("Sum = " + (a + b));
		break;		
		case 2: System.out.println("Sub = " + (a - b));
		break;		
		case 3: System.out.println("Mul = " + (a * b));
		break;		
		case 4: System.out.println("Quo = " + (a / b));
				System.out.println("Rem = " + (a % b));
		break;		
		case 5:	System.out.println("Sum = " + (a + b));
				System.out.println("Sub = " + (a - b));
				System.out.println("Mul = " + (a * b));
				System.out.println("Quo = " + (a / b));
				System.out.println("Rem = " + (a % b));
		break;
		
		case 6: System.out.println("Application Teminated");
		 		System.exit(0);
		break;
		
		default:System.out.println("Invalid Choice");
		break;
		}
		scan.close();
		
	}
}
