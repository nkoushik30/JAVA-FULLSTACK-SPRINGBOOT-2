package Collections;

import java.util.TreeSet;

public class Demo4 {
	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<Integer>();
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);
		set.add(10);
		System.out.println("Treeset : " +set);
	}
}
