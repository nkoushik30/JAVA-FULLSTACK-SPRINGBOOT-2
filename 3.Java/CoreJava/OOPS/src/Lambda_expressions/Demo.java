package Lambda_expressions;

interface calc{
	int sum(int a, int b);
}

public class Demo {
	public static void main(String[] args) {
		calc cl = (a, b)->{
			return a+b;
		};
		System.out.println("sum = "+cl.sum(10, 12));
	}
}
