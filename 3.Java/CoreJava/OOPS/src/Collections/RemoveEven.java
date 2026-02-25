package Collections;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveEven {
	public static void main(String[] args) {
		// remove even from list

		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		System.out.println("Enter the noof elements you wanted to add : ");
		int n = sc.nextInt();

		System.out.println(" - :");
		for (int i = 0; i < n; i++) {
			list.add(sc.nextInt());
		}
		System.out.println("original list : " + list);
		System.out.println("even numbers removed list");

		list.removeIf(k -> k % 2 == 0);

		System.out.println("list removed even : " + list);
		sc.close();
	}
}
