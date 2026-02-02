import java.awt.dnd.DropTargetEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CSclasses {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	
		List<Course> classes = new ArrayList<>();
	
		classes.add(new InPersonCourse("CSC119", 10, 20, 3, "NC16"));
		classes.add(new FullRemoteCourse("CSC120", 15, 30, 4, "email@email.com"));
		classes.add(new RealTimeRemoteCourse("CSC121", 17, 35, 2, "zoom code"));
	
		for(Course courses:classes) {
			printCourse(courses);
			System.out.println();
			
		}
	
	
	
	}
	
	public static void printCourse(Course course) {
		System.out.println(course);
	}
	
	public static void noToStringPrint(Course course) {
		System.out.println("Course Number= " + course.getCourseNum());
		System.out.println("Number Students= " + course.getNumStudents());
		System.out.println("Max Students= " + course.getMaxStudents());
		System.out.println("Credits= " + course.getCredits());
		
		if(course instanceof InPersonCourse) {
			System.out.println("Room Number= " + ((InPersonCourse)course).getRoomNum());
			}
		if(course instanceof FullRemoteCourse) {
			System.out.println("Email= " + ((FullRemoteCourse)course).getEmail());
			}
		if(course instanceof RealTimeRemoteCourse) {
			System.out.println("Zoom= " + ((RealTimeRemoteCourse)course).getZoom());
			}

	}

}
