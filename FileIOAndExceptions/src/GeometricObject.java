import java.util.Date;

public class GeometricObject {
	private String color;
	private boolean isFilled;
	private Date dateCreated = new Date();	
	
	
	public GeometricObject(String color, boolean isFilled) {
		this.color = color;
		this.isFilled = isFilled;
		dateCreated = new Date();
	}

	public GeometricObject() {
	}

	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public boolean isFilled() {
		return isFilled;
	}

	public void setFilled(boolean isFilled) {
		this.isFilled = isFilled;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	@Override
	public String toString() {
		return "GeometricObject [color=" + color + ", isFilled=" + isFilled + ", dateCreated=" + dateCreated + "]";
	}

	
	
	
	
	
	
	
		
		

	

}
