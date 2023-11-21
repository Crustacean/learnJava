import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		
		int arraylength = 10;
		
		int[] arrayStorage = new int[arraylength];
		arrayStorage = RandomArray.sortArray(arraylength);
		
		System.out.println("Randomly generated Array: " + Arrays.toString(arrayStorage));
		
		int[] copyArray = Arrays.copyOf(arrayStorage, arraylength);
		
		Arrays.sort(arrayStorage);
		
		System.out.println("ArrayStorage sorted: " + Arrays.toString(arrayStorage));
		
		int[] descendingOrderArray = new int[arraylength];
		
		for(int i=0; i<arraylength; i++) {
			//System.out.printf("%2d, ", arrayStorage[i]);
			descendingOrderArray[i] = arrayStorage[arraylength-i-1];
		}
		
		System.out.println("Array sorted in descending order: " + Arrays.toString(descendingOrderArray));
		
	}
	
}