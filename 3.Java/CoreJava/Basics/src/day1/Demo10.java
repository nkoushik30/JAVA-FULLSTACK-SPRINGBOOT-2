package day1;

public class Demo10 {
	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		int z = 30;
		
		int max = x;
		
		if (max < y)
			max = y;
		
		if (max < z)
			max = z;
		
		System.out.println(max + " is greater");
	}
}
