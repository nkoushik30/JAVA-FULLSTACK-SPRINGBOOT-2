package Collections;

import java.util.ArrayList;
import java.util.Arrays;

public class Demo7 {

	public static void main(String[] args) {
		//Reverse a List without Collections.reverse() [1,2,3,4]
		
		ArrayList<Integer> list1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4));
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		int n= list1.size();
		for(int i=n-1;i>=0;i--){
			list2.add(list1.get(i));
		}
		System.out.println("reversed list without removing list1 : "+list2);
	}

}
