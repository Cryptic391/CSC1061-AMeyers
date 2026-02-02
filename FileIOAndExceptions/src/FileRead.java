import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileRead {

	public static void main(String[] args) {
		
		File myFile = new File("fileWriteTest");
		Scanner input = null;
		 
		try {
			input = new Scanner(myFile);
			
		} catch (FileNotFoundException e) {
			
			//System.out.println("File not Found");
			System.out.println(e.getMessage());
			e.printStackTrace();
			System.exit(-1);	// -1 something went wrong, 0 for everything okay.
		}
		
		
		while(input.hasNextLine()) {
			String line = input.nextLine();
			System.out.println(line);
		}
		
		int[] numbers = {1,2,3};
		try {
		addOne(numbers, 4);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	
	
	public static void addOne(int[] nums,int index) {
		nums[index]++;
	}
	
	
	
}
