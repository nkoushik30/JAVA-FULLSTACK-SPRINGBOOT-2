package Day6;

//Strings String buffers, String builders for java

public class Demo1 {

	public static void main(String[] args) {
		String str = "";
		System.out.println("isEmpty(str) : " + str.isEmpty());

		str = "Hello world";
		System.out.println("Updated str :" + str);

		System.out.println("\n" + "str.charAt(3): " + str.charAt(3) + " in Hello world");
		System.out.println("\n" + "str.codePointAt(3): " + str.codePointAt(3) + " in Hello world");
		System.out.println("\n" + "str.codePointBefore(3): " + str.codePointBefore(3) + " in Hello world");
		System.out.println("\n" + "str.concat( Bye): " + str.concat(" Bye") + " to Hello world");
		System.out.println("\n" + "str.contains(Hello): " + str.contains("Hello") + " in Hello world");
		System.out.println("\n" + "str updated : " + str);
		System.out.println("\n" + "str.endsWith(world): " + str.endsWith("world") + " in Hello world");
		System.out.println("\n" + "str.equals(Hello world) in str : " + str.equals("Hello world") + " in Hello world");
		System.out.println("\n" + "str.equalsIgnoreCase(hello world) in str : " + str.equalsIgnoreCase("hello world")
				+ " in Hello world");
		String Name = "koushik";
		int Age = 20;
		String Study = "Btech";
		String result = String.format("Name : %s, Age : %d, Study : %s", Name, Age, Study);
		System.out.println("\n" + "Formated method in String methods : " + result + "\n");
		System.out
				.println("\n" + "str.getBytes() " + "Hello world " + " in str : " + str.getBytes() + " in Hello world");

		System.out.println(
				"\n" + "str.indexOf(method) " + "Hello world " + " in str : " + str.indexOf('H') + " in Hello world");

		String k = str.intern();

		System.out.println("\n" + "str.intern() " + "Hello world " + " in str : " + k + " in Hello world");

	}

}
