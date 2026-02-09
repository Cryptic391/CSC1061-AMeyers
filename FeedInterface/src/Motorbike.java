
public class Motorbike extends Vehicle{


	@Override
	public String drive() {
		return "Twist the handle.";
	}

	@Override
	public void feed(int numGallons) {
		System.out.println("Feed the gas tank." + numGallons);
		
	}

}
