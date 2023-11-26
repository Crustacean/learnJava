import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		
		int[] arrays = MinimumElement.readIntegers(5);
		
		System.out.println(Arrays.toString(arrays));
		
		System.out.println(MinimumElement.findMin(arrays));
		
	}
	
}