
public class Fan {
	private static final int SLOW = 1;
	private static final int MEDIUM =2;
	private static final int FAST =3;
	
	
	private static int id = 0;
	
	private int speed = 1;
	private boolean on = false;
	private double radius = 5;
	private String color = "Blue";
	


	public Fan() {
		id++;
	}
	
	
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		if(speed >= FAST) {
			this.speed = FAST;
		}
		else {
			this.speed = speed;
		}
	}
	
	public boolean isOn() {
		return on;
	}
	public void setOn(boolean on) {
		this.on = on;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

	public int getId() {
		return id;
	}


	@Override
	public String toString() {
		if(isOn()) {
			return "Fan " + getId() + " Speed:" + speed + " Color:" + color + " Radius:" + radius;
		}
 		else {
 			return "Fan " + getId() + " Speed:" + speed + " Color:" + color + " Radius:" + radius + " This fan is off.";
		}
		
	}
	
	
	
	
	
	
	

}
