
public class Dog extends Animal {
	private double barkVolume;

	
	public Dog() {
		super("Dog", 4, 2);
		this.barkVolume = barkVolume;
	}


	public double getBarkVolume() {
		return barkVolume;
	}


	public void setBarkVolume(double barkVolume) {
		this.barkVolume = barkVolume;
	}

	@Override
	public String makeSound() {
		return "Bark";
	}

	@Override
	public String toString() {
		return "Dog:" + super.toString() + " Bark Volume=" + barkVolume ;
	}
	
	
	
	
	
	
	

}
