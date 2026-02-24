package Collections;

import java.util.LinkedHashSet;

public class Demo3 {

	public static void main(String[] args) {
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();

		set.add(100);
		set.add(300);
		set.add(200);
		set.add(100);
		System.out.println(set);
	}

}
