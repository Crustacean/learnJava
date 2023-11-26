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
	
	public static int findMin(int[] arr) {
		
		int min = Integer.MAX_VALUE;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]<min) {
				min = arr[i];
			}
		}
		
		return min;
		
	}
	
	
}