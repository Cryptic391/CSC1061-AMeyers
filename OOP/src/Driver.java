
public class Driver {

	public static void main(String[] args) {
		
		Car carOne = new Car();
		
		Car carTwo = new Car("Yellow", 10);
		
		carTwo.setGrndClear(13);
		
		System.out.println(carTwo.toString());
		carTwo.drive(6);
		System.out.println(carTwo);
	}

}
