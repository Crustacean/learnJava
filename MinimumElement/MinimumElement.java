import java.util.*;

public class MinimumElement {
	
	public static int[] readIntegers(int sizeOfArray) {
		
		Scanner scanner = new Scanner(System.in);
		
		int[] array = new int[sizeOfArray];
		
		for(int i=0; i<sizeOfArray; i++) {
			array[i] = scanner.nextInt();
		}
		
		return array;
		
	}
	
	
	
	
}