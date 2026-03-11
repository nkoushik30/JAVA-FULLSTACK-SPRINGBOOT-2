package day1;

public class Demo17 {
	public static void main(String[] args) {

		int[] arr = { 10, 20, 30, 40, 50 };

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("\n");

		// Enhansed for loop or foreach loop
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
}
