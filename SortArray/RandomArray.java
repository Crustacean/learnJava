import java.util.*;

public class RandomArray {
	
	public static int[] sortArray(int length) {
		
		int[] myArray = new int[length];
		
		Random random = new Random();
		
		for(int i=0; i<length; i++) {
			myArray[i] = random.nextInt(5);
		}
		
		return myArray;
		
	}
	
}