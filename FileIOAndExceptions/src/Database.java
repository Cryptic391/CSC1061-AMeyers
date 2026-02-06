import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Database {
	private File outfile = new File("database.csv"); // csv is a comma separated values - can be imported into excell or other database applications
	PrintWriter printer;
	Scanner reader;
	
	
	public Database() {
			try {
				if(!outfile.exists()) {
					outfile.createNewFile();
				}
			} catch (IOException e) {
				System.out.println(e.getMessage());
				System.out.println("Database could not be created.");
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
	
	public void write(GeometricObject shape) {
		printer.print(shape.getClass().getName() + ",");
		printer.print(shape.getColor()+ ",");
		printer.print(shape.isFilled()+ ",");
		printer.print(shape.getDateCreated()+ ",");
		
		if(shape instanceof Circle) {
			printer.print(((Circle)shape).getRadius());
		}
		else if(shape instanceof Rectangle) {
			Rectangle rect = (Rectangle)shape;
			printer.print(rect.getWidth()+ ",");
			printer.print(rect.getHeight());
		}
		printer.println();
		printer.flush();
	}
	
	public void read() {
		String line;
		while(reader.hasNext()) {
			System.out.println();
		}
		
	}
	
	

}
