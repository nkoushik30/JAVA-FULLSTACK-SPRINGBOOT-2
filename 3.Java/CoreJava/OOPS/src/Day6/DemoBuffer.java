package Day6;

import java.lang.StringBuffer;

public class DemoBuffer {

	public static void main(String[] args) {
		StringBuffer sbr = new StringBuffer();

		sbr = sbr.append("Hello Java");

		System.out.println("\n" + "Appened 'Hello Java' text into sbr : " + sbr);

		// reverse a string using .reverse()

		System.out.println("\n" + "reverse a string using .reverse() method : " + sbr.reverse());
		System.out.println("\n" + "reverse a string using .reverse() method : " + sbr.reverse());

		System.out.println("\n" + "Removing vowel from Hello Java using sbr.deleteCharAt() : " + sbr.deleteCharAt(1));
		sbr.delete(0, 9);
		sbr.append("Hello World");
		System.out.println("\n" + "final :" + sbr);

		sbr.insert(6, "Java ");

		System.out.println("\n" + "insert method for buffer inserted Java at 6 th pos : " + sbr);

		// palinndrome check using String Buffer

		StringBuffer sbr1 = new StringBuffer();
		sbr1.append("MADAM");

		StringBuffer sbr2 = new StringBuffer();
		sbr2 = sbr1.reverse();

		if (sbr1.equals(sbr2))
			System.out.println("\n" + sbr1 + " is a palindrome : " + sbr2);

		// counting words present in the string

		sbr.toString();
		System.out.println("\n" + "sbr : " + sbr);

		sbr.append(" Developers");
		System.out.println("\n" + "sbr : " + sbr);

		String[] words = sbr.toString().split("\\s+");

		System.out.println("\n" + "Sentence length :  " + words.length);

		// replace all the spaces by hyphens

		System.out.println("\n" + "originl string : " + sbr);
		String s = sbr.toString().replace(" ", "-");

		System.out.println(
				"\n" + "first sbr is converted to string then replaced ' ' with '-' and stored in String s : " + s);
		System.out.println("\n" + "originl string : " + sbr);

		// counting chars manually
		int n = sbr.length(), count = 0;

		for (int i = 0; i < n; i++) {
			if (sbr.charAt(i) == 'l')
				count++;
		}
		System.out.println("\n" + "counted the 'l' count using charAt() method manually : " + count);
		System.out.println("\n" + "Length of sbr : " +n);

		System.out.println("\n" + "Deleted part (developers) from sbr : " +sbr.delete(17, 27));
		
		//insrting * for everey alternative char
		n = sbr.length();
		
		for(int i=n-1;i>0;i--){
			sbr.insert(i, '*');
		}
		System.out.println("\n"+sbr);
		
		
		// remove chars at even indexes 
		n=sbr.length();
		for(int i=n-1; i>0; i--){
			if(!(( i & 1 ) == 0) ){  // used AND opr to solve even odd
				sbr.deleteCharAt(i);
			}
		}
		
		System.out.println("\n"+"removed chars at evenindexes : "+sbr);
		

	}

}
