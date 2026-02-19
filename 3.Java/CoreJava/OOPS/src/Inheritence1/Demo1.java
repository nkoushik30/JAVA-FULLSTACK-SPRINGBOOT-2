package Inheritence1;

class Car {
	public void colour() {
		System.out.println("Colour         : White ");
	}

	public void infotainment() {
		System.out.println("Music          : No infotainment System ");
	}

	public void brakes() {
		System.out.println("Brakes         : Drum Brakes ");
	}

	public void steering() {
		System.out.println("Steering       : Power based ");
	}
}

class Swift extends Car {

	@Override
	public void colour() {
		System.out.println("Colour         : red ");
	}

}

class Ford extends Car {
	@Override
	public void colour() {
		System.out.println("Colour         : blue ");
	}

	@Override
	public void infotainment() {
		System.out.println("Music          : Dolby infotainment System ");
	}

}

public class Demo1 {

	public static void main(String[] args) {
		Swift swift = new Swift();
		System.out.println("Swift Specifications");
		swift.colour();
		swift.infotainment();
		swift.brakes();
		swift.steering();

		Ford ford = new Ford();
		System.out.println("ford Specifications");

		ford.colour();
		ford.infotainment();
		ford.brakes();
		ford.steering();

	}

}
