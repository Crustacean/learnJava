public class Main {
	
	public static void main(String[] args) {
		
		int[] intArray = {20, 35, 7, 89, 12, -1, 0, 89};
		
		for (int firstUnsortedIndex = 1; firstUnsortedIndex < intArray.length; firstUnsortedIndex++) {
			
			int newElement = intArray[firstUnsortedIndex];
			
			int i;
			
			for (i = firstUnsortedIndex; i>0 && intArray[i-1]>newElement; i--) {
				intArray[i] = intArray[i-1];
			}
			
			intArray[i] = newElement;			
			
		}
		
		printArray(intArray);
		
	}
	
	public static void printArray(int[] array) {
		
		for(int i=0; i<array.length; i++) {
			System.out.println(array[i]);
		}
		
	}	
	
}