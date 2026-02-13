package day1;

public class Demo13 {
	public static void main(String[] args) {
		System.out.println("While Loop");
		int i = 1;
		while (i < 6) {
			System.out.print(i + " ");
			i++;
		}
		System.out.println("\n");
		
		System.out.println("Do-While Loop");
		i = 1;
		do {
			System.out.print(i + " ");
			i++;
		} while (i > 22);
		System.out.println("\n");
		
		System.out.println("For Loop");
		for (i = 1; i < 6; i++) {
			System.out.print(i + " ");
		}
		System.out.println("\n");
	}
}
