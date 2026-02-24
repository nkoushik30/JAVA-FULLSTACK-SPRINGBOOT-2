package Collections;

import java.util.ArrayList;
import java.util.Collections;

public class Demo10 {
public static void main(String[] args) {
ArrayList<Integer> list = new ArrayList<Integer>();
	
	list.add(100);
	list.add(2);
	list.add(10);
	list.add(12);
	list.add(10);
	System.out.println(list);

	System.out.println("Before sorting : " + list);
	Collections.sort(list);
	System.out.println("after sorting : " + list);
}
}
