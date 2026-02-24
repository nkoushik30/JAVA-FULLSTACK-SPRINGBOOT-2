package Errors;

import java.util.InputMismatchException;

class calculator {
	public void ArtimDemo(int a, int b) throws InputMismatchException, ArithmeticException {
		System.out.println("addition : " + (a + b));
		System.out.println("reminder : " + (a % b));
		System.out.println("substraction : " + (a - b));
		System.out.println("multiplication : " + (a * b));
		System.out.println("quotient : " + (a / b));
	}
}

public class Demo5 {

	public static void main(String[] args) {
		// demonstration for throws, keyword

		calculator obj = new calculator();
		try {
			obj.ArtimDemo(10, 10);

		} catch (ArithmeticException ae) {
			ae.printStackTrace();

		} catch (InputMismatchException ie) {
			ie.printStackTrace();

		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			System.out.println("finally block executed");
		}
	}

}
