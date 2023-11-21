import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		
		/*String stringArray = Arrays.toString(FillRandom.FillArray(10000));
		System.out.println(stringArray);
		
		int[] arrayHolder = FillRandom.FillArray(10);
		Arrays.sort(arrayHolder);
		System.out.println(Arrays.toString(arrayHolder));
		
		int[] arrayCopy = Arrays.copyOf(arrayHolder, arrayHolder.length);
		System.out.println(Arrays.toString(arrayCopy));*/
		
		String[] friendsList = {"June", "Kelvin", "Peter", "Mark", "John", "Violet", "Bancy"};		
		Arrays.sort(friendsList);
		if(Arrays.binarySearch(friendsList, "Bancy") > -1) {
			System.out.println("Found!");
		}else {
			System.out.println("Not found.");
		}
		
		
		
	}
	
}