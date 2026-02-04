
public class TestGeometricObject {

	public static void main(String[] args) {
		Circle cir1 = new Circle("Green", true, 2.0);
		System.out.println("Area of cir1: " + cir1.getArea());

		int radius = 5;
		System.out.println("Circle with radius " + radius
				+ " will have area of " + Circle.getArea(radius));
		
		Rectangle rect1 = new Rectangle("red", true, 2.0,3.0);
		System.out.println(rect1.getPerimeter());
		
		Database db = new Database();
		db.write(cir1);
		db.write(rect1);
		
		
		
	}

}
