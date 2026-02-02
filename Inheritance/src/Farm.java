import java.util.ArrayList;
import java.util.List;

public class Farm {

	public static void main(String[] args) {
		
		Cat tango = new Cat(3);
//		System.out.println(tango);
//		System.out.println(tango.makeSound());
		
		Animal[] animals = new Animal[3];
		
		animals[0] = new Cat(3);
		
		animals[1] = new Horse(5);
		
		animals[2] = new Dog();
		
		
		List<Animal> animalList = new ArrayList<>();
		
		animalList.add(new Cat(4));
		
//		for(int i = 0; i< animals.length; i++) {	
//		System.out.println(animals[i].makeSound());
//		}
		
		for (Animal anim:animals) {
//			System.out.println(anim.toString());
//			printAnimal(anim);
//			WithoutToString(anim);
		}
		

	}
	
	public static void printAnimal(Animal anim) {
		System.out.println(anim);
	}
	
	public static void WithoutToString(Animal anim) {
		System.out.print("Name: " + anim.getName());
		System.out.print("  Weight: " + anim.getHeight());
		System.out.print("  Height: " + anim.getWeight());
		
		if (anim instanceof Cat) {
			System.out.println("  Wisker Length: " + ((Cat) anim).getLengthOfWiskers());
		}
		if (anim instanceof Dog) {
			System.out.println("  Bark Volume: " + ((Dog) anim).getBarkVolume());	
		}
		if (anim instanceof Horse) {
			System.out.println("  Speed: " + ((Horse) anim).getSpeed());	
		}
		
	}

}
