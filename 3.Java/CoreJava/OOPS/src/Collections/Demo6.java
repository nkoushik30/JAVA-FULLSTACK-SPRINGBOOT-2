package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Demo6 {

	public static void main(String[] args) {
		// Remove duplicates without using Set [10,2345,123456,234567, 20, 10, 30, 20, 40]
		
		ArrayList<Integer> OriginalList = new ArrayList<Integer>(Arrays.asList(10,2345,123456,234567, 20, 10, 30, 20, 40));
		ArrayList<Integer> removedList = new ArrayList<Integer>();
		
		
		for(int num: OriginalList){
			if(!removedList.contains(num)){
				removedList.add(num);
			}
		}
		System.out.println("Duplicates removed list : "+removedList);
		
		//finding second largest without using sorting 
		Collections.sort(removedList);
		System.out.println("second max in list : "+removedList.get(removedList.size()-2));		
		
	}
}
