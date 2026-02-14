package day1;

//Getter & Setter
class Example7 {
	
	private int data;
	
	//Setter - setting the value or initializing the value
	public void setData(int data) {
		this.data = data;
	}
	
	//Getter - getting the value or reteriving the value
	public int getData() {
		return data;
	}
}

public class Demo7 {
	public static void main(String[] args) {

		Example7 obj = new Example7();
		
		obj.setData(25);
		
		int result = obj.getData();
		System.out.println("Data = " + result);
		//OR
		System.out.println("Data = " + obj.getData());
	}
}
