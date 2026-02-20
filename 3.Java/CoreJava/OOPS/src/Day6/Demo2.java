package Day6;
//Demonstration on String

public class Demo2 {

	public static void main(String[] args) {
		String str = "";
		long startTime = System.currentTimeMillis();
		str+=Math.cos(30);
		System.out.println("Str after for loop: "+str);
		long endTime = System.currentTimeMillis();
		System.out.println("total time in ms : "+(endTime - startTime));
		
	}

}
