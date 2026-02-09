
public class Animal implements Feedable{
	private String name;
	private double weight;
	
	
	@Override
	public void feed(int numGallons) {
		System.out.println("Feed the animal." + numGallons);
		
	}
	
	
}
