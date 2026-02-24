package Collections;

import java.util.HashSet;
//Hashset - geniric collection (similar data)
public class Demo2 {
	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<Integer>();
		
		set.add(123);
		set.add(1);
		set.add(10);
		set.add(2);
		set.add(4);
		
		System.out.println(set);
	}
}