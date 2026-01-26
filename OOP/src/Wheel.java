
public class Wheel {
	private int radius;
	private String material;
	
	
	public Wheel(int radius, String material) {
		this.radius = radius;
		this.material = material;
	}


	public int getRadius() {
		return radius;
	}


	public String getMaterial() {
		return material;
	}


	@Override
	public String toString() {
		return "Wheel [radius=" + radius + ", material=" + material + "]";
	}
	
	
	

}
