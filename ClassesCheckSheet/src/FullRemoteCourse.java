
public class FullRemoteCourse extends OnlineCourse {
	

	private String email;

	public FullRemoteCourse(String courseNum, int numStudents, int maxStudents, int credits, String email) {
		super(courseNum, numStudents, maxStudents, credits);
		this.email = email;
	}
	
	
}
