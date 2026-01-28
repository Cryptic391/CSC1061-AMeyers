
public class Cat extends Animal {
	private int lengthOfWiskers;

	public Cat(int lengthOfWiskers) {
		super("Cat", 2.0, 3.0);
		this.lengthOfWiskers = lengthOfWiskers;
	}

	@Override
	public String toString() {
		return "Cat" + super.toString() +  " Length Of Wiskers= " + lengthOfWiskers;
	}
	
	@Override
	public String makeSound() {
		return "Meow";
	}

	
	

}
