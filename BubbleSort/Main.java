public class Main {
	
	public static void main(String[] args) {
		
		int[] intArray = {20, 35, 7, 89, 12, -1, 0, 89};
		
		for (int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex < 0; lastUnsortedIndex--) {
			
			for (int i=0; i<lastUnsortedIndex; i++) {
				
				if (intArray[i] > intArray[i+1] ) {
					swap(intArray, i, i+1);
				}
				
			}
			
		}
		
		printArray(intArray);
		
	}
	
	public static void swap(int[] array, int i, int j) {
		
		if (i == j) {
			return;
		}
		
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
		
	}
	
	public static void printArray(int[] array) {
		
		for (int i = 0; i<array.length; i++) {
			System.out.println(array[i]);			
		}
		
	}
	
	
}