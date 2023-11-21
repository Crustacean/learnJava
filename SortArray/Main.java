public class Main {
	
	public static void main(string[] args) {
		
		int arraylength = 10;
		
		int[] arrayStorage = new int[arraylength];
		arrayStorage = RandomArray.sortArray(arraylength);
		
		System.out.println(Arrays.toString(arrayStorage));
		
		int[] copyArray = new int[arraylength];
		
		copyArray = Arrays.copyOf(arrayStorage);
		
		Arrays.sort(arrayStorage);
		
		int[] descendingArray = new int[arraylength];
		
		for(int i=arraylength; i>0; i--) {
			for(int j=0; j<arraylength; j++) {
				descendingArray[j] =  arrayStorage[i];
			}
		}
		
		System.out.println(Arrays.toString(descendingArray));
		
	}
	
}