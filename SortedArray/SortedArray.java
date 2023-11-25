import java.util.*;

public class SortedArray {
    // write code here
    
    
    public static int[] getIntegers(int sizeOfArray) {
        
        int[] array = new int[sizeOfArray];
        
        Scanner scanner = new Scanner(System.in);
        
        for(int i=0; i<sizeOfArray;i++) {
            array[i] = scanner.nextInt();
        }
        
        return array;
        
    }
    
    public static void printArray(int[] array) {
        
        int length = array.length;
        
        for(int i=0; i<length; i++) {
            System.out.printf("Element %d contents %d%n", i,array[i]);
        }
        
    }
    
    public static int[] sortIntegers(int[] arr) {
        
        int length = arr.length;
        
        int[] sortedArray = Arrays.copyOf(arr, length);
        
        boolean swap = true;
        
        int tmp;
        
        while(swap) {
            swap = false;
            for(int i=0; i<length-1; i++) {
                if(sortedArray[i] < sortedArray[i+1]) {
                    tmp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = tmp;
                    swap = true;
                }
            }
        }
        
        return sortedArray;
        
    }
    
}
    
 