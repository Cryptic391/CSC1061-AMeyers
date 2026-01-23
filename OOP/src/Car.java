
public class Car {
	
	// Data Members
	
	private String color;
	private double amountOfGas;
	private int mileage;
	private int groundClearanceFt;
	private int groundClearanceIn;
	
	// Constructors
	
	public Car(String rcolor) {
		color  = rcolor;
		amountOfGas = 1.0;
		mileage = 5;
	}
	
	public Car(String color, double gas) {
		this.color = color;
		amountOfGas = gas;
		mileage = 0;
		
	}
	
	// no arg constructor
	public Car() {
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
	
	
	
	
	
	@Override
	public String toString() {
		return "Color = " + color + "\nAmount Of Gas = " + amountOfGas + "\nMileage = " + mileage +
			"\nGround Clearance = "+ groundClearanceFt + "'" + groundClearanceIn + "'' " ;
	}

	
}
