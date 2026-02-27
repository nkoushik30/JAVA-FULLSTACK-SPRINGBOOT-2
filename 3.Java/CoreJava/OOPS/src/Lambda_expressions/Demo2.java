package Lambda_expressions;

public class Demo2 {
	public static void main(String[] args) {
		// anonymous class
		Car car = new Car() {
			@Override // it cn bee executed without override
			public void drive() {
				System.out.println("Driving swift car...");
			}
		};
		car.drive();
	}
}
