import java.util.ArrayList;
import java.util.List;

public class BreakStatement {

	public static void main(String[] args) {
		
		int[][] intArray = {
				{1, 2, 3},
				{4, 8},
				{6, 7, 8, 9}		
		};
		
		
		
		List<Integer> intList = new ArrayList<>();
		
		intList.add(Integer.valueOf(1));
		intList.add(0);	// Auto boxing
		intList.add(3);
		intList.add(5);
		intList.add(3);
		
		for(int i =0; i< intList.size(); i++) {
			System.out.println(intList.get(i));
		}
		
		System.out.println();
		
		for(int num:intList) {	//auto un-boxing
			System.out.println(num);
		}
		
		int index = findIndex(intList, 3);
		System.out.println("\nFound at index: "+index);
		
		int rowIndex = -1;
		int colIndex = -1;
		boolean found = false;
		
		for(int i = 0; i < intArray.length; i++) {
			for(int j = 0; j < intArray[i].length; j++) {
				if(intArray[i][j] == 8) {
					rowIndex = i;
					colIndex = j;
					found = true;
					break;
				}
			}
			if(found)	break;
		}
		System.out.println("\nRow: " + rowIndex + "\nCollum: " + colIndex);
		System.out.println();
		
		
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 > 0) {
				continue;		// Back to start of loop , still increases i	
			}	
			System.out.println(i);
			System.out.println("Print stuff");
			
		}


	} // main ends
	
	
	public static int findIndex(List<Integer> ints, int num) {
		int index = -1;
		for(int i = 0; i < ints.size(); i++) {
			if(num == ints.get(i)) {
				index = i;
				break; 
			}
		}
		return index;
		
//		return ints.indexOf(num);
		
		
		
		
		
	}
	

}
