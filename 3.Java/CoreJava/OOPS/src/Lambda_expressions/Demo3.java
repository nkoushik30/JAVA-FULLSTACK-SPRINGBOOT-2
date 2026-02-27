package Lambda_expressions;

public class Demo3 {
	public static void main(String[] args) {
		// anonymous method using lambdaa expression
		/*
		 * Car car = () ->{
		 * System.out.println("Anonymous method print statments");
		 * System.out.println("Anonymous method drive slowly"); };
		 */
		Car car = () -> System.out.println("Anonymous method states that......");
		car.drive();
	}
}
