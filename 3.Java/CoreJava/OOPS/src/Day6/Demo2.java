package Day6;
//Demonstration on String

public class Demo2 {

	public static void main(String[] args) {
		String str = "";
		long startTime = System.currentTimeMillis();

		long endTime = System.currentTimeMillis();

		System.out.println("\n" + "total time in ms : " + (endTime - startTime));

		str = "Hello world guyssssssss                      ";
		System.out.println("\n" + "str.charAt(1) : " + str.charAt(1));
		str = str.trim();
		System.out.println("\n" + "str.trim() : " + str);

		System.out.println("\n" + "str.length() method : " + str.length());
		System.out.println("\n" + "str.substring(20,23) : " + str.substring(20, 23));

		System.out.println("\n" + "str.equals(Hello world guyssssssss) : " + str.equals("Hello world guyssssssss"));

		System.out.println("\n" + "str.equalsIgnoreCase(hello world guyssssssss) : "
				+ str.equalsIgnoreCase("hello world guyssssssss"));

		System.out.println("\n" + "str.toUpperCase() : " + str.toUpperCase());
		System.out.println("\n" + "str.toLowerCase() : " + str.toLowerCase());
		str = "HelloWorld";
		System.out.println("\n" + "replace char str.replace('e', 'k') at by char : " + str.replace('e', 'k'));

		System.out.println("\n" + "str.contains(Hello) : " + str.contains("Hello"));

	}

}
