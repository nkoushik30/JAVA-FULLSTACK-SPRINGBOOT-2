package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;

public class Demo12 {

	public static void main(String[] args) {
		// sets problems
		ArrayList<Integer> list = new ArrayList<Integer>();
		HashSet<Integer> set1 = new HashSet<Integer>();
		Collections.addAll(set1, 10, 20, 100, 11, 23);

		HashSet<Integer> set2 = new HashSet<Integer>();
		Collections.addAll(set2, 11, 20, 11, 911, 23);

		for (int num : set1) {
			if (set2.contains(num)) {
				list.add(num);
			}
		}
		System.out.println("common elements in set1 and set2 are : " + list);

		// removing duplicates and sorting automatically
		TreeSet<Integer> sorted = new TreeSet<Integer>();
		Collections.addAll(sorted, 11, 20, 11, 911, 23);
		Collections.addAll(sorted, 10, 20, 100, 11, 23);
		System.out.println(sorted);

	}
}
