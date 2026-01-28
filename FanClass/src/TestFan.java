
public class TestFan {

	public static void main(String[] args) {
		
		Fan fan1 = new Fan();
		fan1.setSpeed(5);
		fan1.setOn(true);
		
		System.out.println(fan1);
		
		Fan fan2 = new Fan();
		fan2.setOn(false);
		fan2.setRadius(17);
		
		
		System.out.println(fan1);
		System.out.println(fan2);
	}

}
