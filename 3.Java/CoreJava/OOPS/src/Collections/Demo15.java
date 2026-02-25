package Collections;

public class Demo15 {

	public static void main(String[] args) {
		// Wrapper classes
		
		//every premitive data has Wrapper class
		Byte a = new Byte((byte) 1);
		Short b = new Short((short)12);
		Integer c = new Integer(25);
		Long d = new Long(30);
		Float e = new Float(20.03);
		Double f = new Double(20.23455);
		Boolean g = new Boolean(true);
		Character h = new Character('k');
		String i = new String("Hello all");
		
		System.out.println("a : "+ a+"\n"
				           +"b : "+ b+"\n"
				           +"c : "+ c+"\n"
				           +"d : "+ d+"\n"
				           +"e : "+ e+"\n"
				           +"f : "+ f+"\n"
				           +"g : "+ g+"\n"
				           +"h : "+ h+"\n"
				           +"i : "+ i+"\n");
		
	}

}
