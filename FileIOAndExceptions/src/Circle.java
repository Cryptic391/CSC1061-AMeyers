
public class Circle extends GeometricObject {
	private double radius;
	
	
	public Circle(String color, boolean isFilled, double radius) {
		super(color, isFilled);
		this.radius = radius;
	
	}

	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	
	// Methods
	
	public double getArea() {	// pi r squared
		radius = Math.abs(radius);
		return (Math.PI * radius *  radius); 
	}
	
	public static double getArea(int radius) {
		return (radius * radius * Math.PI);
	}
	
	public static double getArea(double radius) {
		return (radius * radius * Math.PI);
	}
	
	public double getCircumference() { // 2 pi r
		radius = Math.abs(radius);
		return (2 * Math.PI * radius);
	}
	
	public double modRadius(int modifier) {
		radius = radius * modifier;
		return radius;
	}


	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", color=" + getColor() + ", isFilled=" + isFilled() + ", dateCreated="
				+ getDateCreated() + "]";
	}
	
	
	
	
	
	
	

}
