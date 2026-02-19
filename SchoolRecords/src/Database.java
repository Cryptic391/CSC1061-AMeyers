
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Copyright (c) 2026 Austin Meyers
 *@author Austin Meyers
 *@version 1
 */

/**
 * Creates and writes a database for all peoples
 */
public class Database {
	/**
	 * The set name and file type for the database
	 */
	private final String FILE_NAME = "PersonDatabase.csv";
	private File outfile = new File(FILE_NAME);
	PrintWriter printer;
	Scanner reader;
	
	/**
	 * Creates database and checks to make sure that the database exists and can be located.
	 */
	public Database() {
		try {
			if(!outfile.exists()) {
				outfile.createNewFile();
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
			System.out.println("Could not create database.");
			System.exit(-1);
		}
		try {
			printer = new PrintWriter(outfile.getName());
			reader = new Scanner(outfile);
			
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			System.out.println("Database could not be found.");
			System.exit(-1);
		}
	}
	/**
	 * Writes the person selected into the database
	 * @param person selected
	 */
	public void writePerson(Person person) {
		printer.print(person.getClass().getName() + ",");
		printer.print(person.getName() + ",");
		printer.print(person.getAddress() + ",");
		printer.print(person.getPhonenum() + ",");
		printer.print(person.getEmail() + ",");
		
		if(person instanceof Student) {
			printer.print(((Student) person).getStatus() + ",");
		}
		
		else if(person instanceof Faculty) {
			printer.print(((Employee) person).getOffice() + ",");
			printer.print(((Employee) person).getSalary() + ",");
			printer.print(((Employee) person).getHireDate() + ",");
			
			printer.print(((Faculty) person).getOfficeHours() + ",");
			printer.print(((Faculty) person).getRank() + ",");
			
		}
		else if(person instanceof Staff) {
			printer.print(((Employee) person).getOffice() + ",");
			printer.print(((Employee) person).getSalary() + ",");
			printer.print(((Employee) person).getHireDate() + ",");
			
			printer.print(((Staff) person).getTitle() + ",");
		}
		
		printer.println();
		printer.flush();
		
	}
	/**
	 * This takes all the people in the database and puts them into an arrayList of people
	 * @return arrayList of people in database
	 */
	public ArrayList<Person> readDatabase() {
		ArrayList<Person> people = new ArrayList<>();
		while(reader.hasNextLine()) {
		
			String line;
			if(reader.hasNext()) {
				line = reader.nextLine();
			}
			else {
				return null;
			}
		
			String[] tokens = line.split(",");
		
			Person person = null;
			if (tokens[0].equals("Student")){
				person = new Student(tokens[1],tokens[2],tokens[3],tokens[4],tokens[5]);
			}
			else if(tokens[0].equals("Faculty")) {
				person = new Faculty(tokens[1],tokens[2],tokens[3],tokens[4],tokens[5],tokens[6],tokens[7],tokens[8],tokens[9]);
			}
			else if(tokens[0].equals("Staff")) {
				person = new Staff(tokens[1],tokens[2],tokens[3],tokens[4],tokens[5],tokens[6],tokens[7],tokens[8]);
			}
			people.add(person);
		}
		return people;
	}

}
