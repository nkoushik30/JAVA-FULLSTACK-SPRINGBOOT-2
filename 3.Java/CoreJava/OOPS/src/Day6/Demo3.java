package Day6;

public class Demo3 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("Hello ");
		System.out.println("\n" + "sb.append(Hello) : " + sb.append("World"));
		sb.insert(2, "bye");
		System.out.println("\n" + "sb.insert() : " + sb);

		sb.replace(2, 5, "");
		System.out.println("\n" + "sb.replace() with empty string at bye place : " + sb);

		sb.delete(6, 11);
		System.out.println("\n" + "sb.delete() from 6 to 11 : " + sb);

		sb.deleteCharAt(0);
		System.out.println("\n" + "sb.deleteCharAt(o) i.e H : " + sb);

		sb.reverse();
		System.out.println("\n" + "sb.revesre() method : " + sb);

		System.out.println("\n" + "sb.charAt(idx) 2 : " + sb.charAt(2));

		sb.setCharAt(1, 'z');
		System.out.println("\n" + "sb.setCharAt(1) to Z : " + sb);

		System.out.println("\n" + " delete total sb : " + sb.delete(0, 5));

		sb.append("    Java Full Stack ");
		System.out.println("\n" + "sb.length() Java Full Stack : " + sb.length());

		String result = sb.toString().trim();
		System.out.println("\n" + "result = sb.toString().trim() : " + result);

		System.out.println("\n" + "sb.substring() : " + sb.substring(2, 10));

		// building json

		StringBuilder json = new StringBuilder();

		json.append("{");
		json.append("\"name\":\"Koushik\",");
		json.append("\"role\":\"DevOps Engineer\"");
		json.append("}");

		System.out.println("\n" + "json file : " + json);

		StringBuilder query = new StringBuilder();
		query.append("SELECT * from users WHERE age>20");

		System.out.println("\n" + "Database Query with stringbuilder : " + query);

	}
}
