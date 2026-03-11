package day1;

public class Demo19 {
	public static void main(String[] args) {

		int sum = 0;
		int prod = 1;
		int min;
		int max;
		int[] arr = new int[] { 5, 7, 2, 9, 3 };

		min = arr[0];
		max = arr[0];
		for (int i : arr) {
			System.out.print(i + " ");

			sum += i;
			prod *= i;

			if (min > i)
				min = i;

			if (max < i)
				max = i;
		}
		System.out.println("\n");

		System.out.println("Min  = " + min);
		System.out.println("Max  = " + max);
		System.out.println("Sum  = " + sum);
		System.out.println("Prod = " + prod);
	}
}
