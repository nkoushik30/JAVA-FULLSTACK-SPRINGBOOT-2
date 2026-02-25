package Collections;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Demo13 {

	public static void main(String[] args) {
		Set<Integer> set = new LinkedHashSet<>();
		// adding elements to set using iterator
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter(prefer positive) the noof elements to be added to the set : ");
		int k = sc.nextInt();

		while (k > 0) {
			set.add(sc.nextInt());
			k--;
		}
		sc.close();
		Iterator<Integer> it = set.iterator();
		while (it.hasNext()) {
			System.out.print(" " + it.next());
		}
	}
}
