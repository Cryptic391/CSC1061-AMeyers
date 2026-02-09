
public class Car extends Vehicle{

	
	@Override
	public String drive() {
		return "Push the gas.";
	}

	@Override
	public void feed(int numGallons) {
		System.out.println("Gas in the tank." + numGallons);
		
	}

}
