

import java.util.ArrayList;

/**
 * The test for the School Records
 * 
 * @author Austin Meyers
 * @version 1.0
 */

public class TestSchoolRecords {

	public static void main(String[] args) {

		Student stu1 = new Student("stu1", "add1", "phone1", "email1", "Freshman");
		Student stu2 = new Student("stu2", "add2", "phone2", "email2", "Junior");
		Faculty fac1 = new Faculty("fac1", "add3", "phone3", "email3", "office1", "salary1", "hire1", "hours1", "rank1");
		Faculty fac2 = new Faculty("fac2", "add4", "phone4", "email4", "office2", "salary2", "hire2", "hours2", "rank2");
		Staff sta1 = new Staff("sta1", "add5", "phone5", "email5", "office3", "salary3", "hire3", "title1");
		Staff sta2 = new Staff("sta2", "add6", "phone6", "email6", "office4", "salary4", "hire4", "title2");

		Database db = new Database();
		db.writePerson(stu1);
		db.writePerson(stu2);
		db.writePerson(fac1);
		db.writePerson(fac2);
		db.writePerson(sta1);
		db.writePerson(sta2);
		

		ArrayList<Person> people = db.readDatabase();
		
		for(Person person: people) {
		System.out.println(person);		
		}
	}
}
