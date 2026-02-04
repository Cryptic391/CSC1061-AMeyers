
public class Rectangle extends GeometricObject {
	private double width;
	private double height;
	
	
	public Rectangle() {
		super();
		width = this.width;
		height = this.height;
	}


	public Rectangle(String color, boolean isFilled, double width, double height) {
		super(color,isFilled);
		this.width = width;
		this.height = height;
	}


	public double getWidth() {
		return width;
	}


	public void setWidth(double width) {
		this.width = width;
	}


	public double getHeight() {
		return height;
	}


	public void setHeight(double height) {
		this.height = height;
	}
	
	
	public double getArea() {
		return (width * height);
	}
	
	public double getPerimeter() {
		return (2 * (width + height));
	}


	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + ", getColor()=" + getColor() + ", isFilled()="
				+ isFilled() + "]";
	}
	
	
	
	
	
	

}
