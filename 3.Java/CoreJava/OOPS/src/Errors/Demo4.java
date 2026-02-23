package Errors;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo4 {
public static void main(String[] args) {
@SuppressWarnings("resource")
Scanner sc = new Scanner(System.in);
	
	try{
		System.out.println("Enter a , b : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(b!=0){
			int c= a/b;
			System.out.println("Quotient : "+c);		
		}
		else{
			return;
		}
	}
	catch(ArithmeticException ae){
		System.out.println(ae);
		System.out.println("Arithmetic exception by zero");
	}catch(InputMismatchException ie){
		System.out.println(ie);
		System.out.println("inputMismatchException exception by zero");
	}catch(Exception  e){
		System.out.println(e);
		System.out.println("error occured ");
	}
	finally{
		System.out.println("finally block is executed");
	}
	}
}
