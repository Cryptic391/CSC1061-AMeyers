
public class Driver {

	public static void main(String[] args) {
		
		System.out.println("Number of cars: " + Car.getCount());
		
		Car myCar = new Car("Pink");
		
		Car myCar2 = new Car();
		
		System.out.println("Number of cars: " + Car.getCount());
		
		System.out.println("\nCar clean? " + myCar.getClean());
		myCar.selfCleanCar();
		System.out.println("Car clean? " + myCar.getClean());
		
		Car.cleanCar(myCar2);
		
		myCar.getRadio().setVolume(6);
		
		Wheel[] wheels = myCar.getWheels();
		System.out.println(wheels[1].getRadius());
	}

}
