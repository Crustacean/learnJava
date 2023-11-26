import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		
		int arrays = MinimumElement.readIntegers();
		
		System.out.println(Arrays.toString(arrays));
		
		System.out.println(MinimumElement.findMin(arrays));
		
	}
	
}