package Collections;

import java.util.HashSet;

public class Demo1 {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
			//sets
		
		HashSet set = new HashSet<>();
		//Hash does not follow any order 
		//set does not allow duplicaates
		
		//combined both gives you the best storage for data
		//any kind of collection holds dissimilar data

		set.add("Hello");
		set.add(10);
		set.add(11);
		set.add(1.2f);
		set.add('l');
		set.add(10);
		set.add("Hello");
		System.out.println(set);
		
	}

}
