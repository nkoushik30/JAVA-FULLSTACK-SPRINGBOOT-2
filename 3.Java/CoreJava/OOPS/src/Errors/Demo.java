package Errors;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		int[] arr = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the elements of array : ");
		for(int i=0;i<5;i++){
			arr[i] = sc.nextInt();
		}
		try{
			System.out.println("Enter from 0-4(inclusive) : ");
			int n = sc.nextInt();
			System.out.println("num at index "+n+" : "+arr[n]);
		}catch(ArrayIndexOutOfBoundsException ae){
			System.out.println(ae);
			System.out.println("exception handled by catch ");
			System.out.println("enter fron 0-4 only");
			int n = sc.nextInt();
			System.out.println("num at index "+n+" : "+arr[n]);
		}
		finally{
			System.out.println("finally block executed");
		}
		sc.close();
	}
}
