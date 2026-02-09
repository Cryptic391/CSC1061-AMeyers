
public class Bike extends Vehicle{


	@Override
	public String drive() {
		return "Peddle your legs.";
	}

	@Override
	public void feed(int numGallons) {
		System.out.println("Feed yourself." + numGallons);
		
	}

}
