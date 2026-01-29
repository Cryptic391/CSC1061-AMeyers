
public class InPersonCourse extends Course{
	
	private String roomNum;

	public InPersonCourse(String courseNum, int numStudents, int maxStudents, int credits, String roomNum) {
		super(courseNum, numStudents, maxStudents, credits);
		this.roomNum = roomNum;
	}
	
	

	

}
