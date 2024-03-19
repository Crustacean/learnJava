public class Main {
	
	public static void main(String[] args) {
		
		int[] intArray = new int[7];
		
		intArray[0] = 20;
		intArray[1] = 33;
		intArray[2] = 19;
		intArray[3] = 2;
		intArray[4] = 12;
		intArray[5] = 60;
		intArray[6] = 7;
		
		int index = -1;
		
		for(int i=0; i<intArray.length; i++) {
			if (intArray[i] == 7) {
				index = i;
				break;
			}
		}
		
		System.out.println("index = " + index);
		
	}
	
}