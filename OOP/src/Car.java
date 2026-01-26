
public class Car {
	
	private static final int MAX_WHEELS =4;
	// Data Members
	
	private String color;
	private double amountOfGas;
	private int mileage;
	private int groundClearanceFt;
	private int groundClearanceIn;
	private boolean isClean = false;
	private Radio radio = new Radio();
	private Wheel[] wheels = new Wheel[MAX_WHEELS];
	
	
	private static int count = 0;
	
	// Constructors
	
	public Car(String rcolor) {
		color  = rcolor;
		amountOfGas = 1.0;
		mileage = 5;
		count++;
	}
	
	public Car(String color, double gas) {
		this.color = color;
		amountOfGas = gas;
		mileage = 0;
		count++;
		
	}
	
	// no arg constructor
	public Car() {
		count++;
	}
	
	
	// Getters and Setters (Accessors and Mutators)
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}

	public double getAmountOfGas() {
		return amountOfGas;
	}

	public void setAmountOfGas(double amountOfGas) {
		this.amountOfGas = amountOfGas;
	}

	public int getMileage() {
		return mileage;
	}

	public void setGrndClear(int grndClear) {
		this.groundClearanceFt = grndClear/12;
		this.groundClearanceIn = grndClear%12;
	}
	
	public int getGroundClearanceFt() {
		return groundClearanceFt;
	}

	public int getGroundClearanceIn() {
		return groundClearanceIn;
	}
	
	public static int getCount() {
		return count;
	}
	
	public boolean getClean() {
		return isClean;
	}
	
	public Radio getRadio(){
		return radio;
	}
	
	public Wheel[] getWheels() {
		return wheels;
	}

	

	
	// Other Methods
	


		//Methods
		public void drive(int miles) {
			for(int i =0; i< miles;i++) {
				System.out.print("+");
				this.mileage++;
				this.amountOfGas--;
			}
			System.out.println();
		}
		
		public void selfCleanCar() {
			isClean = true;
			
		}
	
		public static void cleanCar(Car car) {
			car.isClean = true;
			
		}
	
	
	
	@Override
	public String toString() {
		return "Color = " + color + "\nAmount Of Gas = " + amountOfGas + "\nMileage = " + mileage +
			"\nGround Clearance = "+ groundClearanceFt + "'" + groundClearanceIn + "'' " ;
	}

	
}
