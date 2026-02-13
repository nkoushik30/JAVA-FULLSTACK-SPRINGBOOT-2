package day1;

import java.util.Scanner;

public class Demo18 {
	public static void main(String[] args) {
		
		int[] arr = new int[5];
		Scanner scan = new Scanner(System.in);
			
		for (int i = 0; i < arr.length; i++) {
			System.out.print("arr[" + i + "]: ");
			arr[i] = scan.nextInt();
		}
		System.out.println();
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "]: " + arr[i]);   
		}
	}
}




