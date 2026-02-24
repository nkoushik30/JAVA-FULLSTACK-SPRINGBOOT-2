package Collections;

import java.util.ArrayList;
import java.util.Collections;

public class Demo11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(2);
		list.add(312);
		list.add(23);
		list.add(87);
		list.add(2);
		System.out.println("Before sorting : "+list);
		Collections.sort(list);
		System.out.println("After sorting : "+list);
	}
}
