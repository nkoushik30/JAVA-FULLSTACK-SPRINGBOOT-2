package Inheritence1;

interface parent {
	void colour();

	void infotainment();

	void brakes();

	void steering();
}

class Swift2 implements parent {
	@Override
	public void colour() {
		System.out.println("colour        : red");
	}

	@Override
	public void infotainment() {
		System.out.println("colour        : Dolby infotainment ");
		
	}

	@Override
	public void brakes() {
		System.out.println("colour        : Hydraulic brakes with ABS ");
		
	}

	@Override
	public void steering() {
		System.out.println("colour        : Power house ");		
	}
}

class Magnite1 implements parent {
	@Override
	public void infotainment() {
		System.out.println("Music          : No infotainment System ");
	}

	@Override
	public void brakes() {
		System.out.println("Brakes         : Drum Brakes ");
	}

	@Override
	public void steering() {
		System.out.println("Steering       : Power based ");
	}

	@Override
	public void colour() {
		System.out.println("colour        : blue ");
	}
}

public class Demo3 {

	public static void main(String[] args) {

		Swift2 swift = new Swift2();
		System.out.println("Swift Specifications");
		swift.colour();
		swift.infotainment();
		swift.brakes();
		swift.steering();

		Magnite1 magnite = new Magnite1();
		System.out.println("ford Specifications");
		 magnite.colour();
		 magnite.infotainment();
		 magnite.brakes();
		 magnite.steering();
	}

}
