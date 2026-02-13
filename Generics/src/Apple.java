
public class Apple implements Comparable<Apple>{
	private String color = "Red";
	private int diameter = 1;
	
	public int compareTo(Apple other) {
		if(diameter < other.diameter) {
			return -1;
		}
		if(diameter > other.diameter) {
			return 1;
		}
		else
			return 0;
	}
}
