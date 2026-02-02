import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class FileWrite {

	public static void main(String[] args) throws IOException {
		File myFile = new File("fileWriteTest");
		
//		if(myFile.canWrite()) {
//			System.out.println("Can Write to " + myFile.getName());
//		}
//		else
//			System.out.println("Can't write");
	
		if(!myFile.exists()) {
			myFile.createNewFile();
		}
		
		
		FileOutputStream fileOut = new FileOutputStream(myFile.getName(),false); // true will add to the file
		PrintWriter printer = new PrintWriter(fileOut);
		
		printer.println("The moon is full today!");
		printer.print("");
		
		printer.flush(); // saves text to the file
		
		
		
		

	}

}
