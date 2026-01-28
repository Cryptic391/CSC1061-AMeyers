
public class Horse extends Animal {
	private double speed;

	public Horse(double speed) {
		super("Horse",10,20);
		this.speed = speed;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}
	
	@Override
	public String makeSound() {
		return "Neigh";
	}

	@Override
	public String toString() {
		return "Horse " + super.toString() + " Speed=" + speed ;
	}
	
	
	
	
}
