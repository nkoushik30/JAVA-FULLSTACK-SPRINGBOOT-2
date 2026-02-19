package Inheritence1;

abstract class Car1 {
	public abstract void colour();

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

class Swift1 extends Car1 {

	public void colour() {
		System.out.println("colour        : red");
	}

}

class Ford1 extends Car1 {
	@Override
	public void colour() {
		System.out.println("Colour         : blue ");
	}

	@Override
	public void infotainment() {
		System.out.println("Music          : Dolby infotainment System ");
	}

}

public class Demo2 {

	public static void main(String[] args) {
		Swift1 swift = new Swift1();
		System.out.println("Swift Specifications");
		swift.colour();
		swift.infotainment();
		swift.brakes();
		swift.steering();

		Ford1 ford = new Ford1();
		System.out.println("ford Specifications");
		ford.colour();
		ford.infotainment();
		ford.brakes();
		ford.steering();

	}

}
