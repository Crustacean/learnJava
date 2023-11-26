import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		
		int[] arr = new int[]{1,2,3,4,5,8};
		
		System.out.println(Arrays.toString(arr));
		
		System.out.println(Arrays.toString(reverse(arr)));
		
	}
	
	public static int[] reverse(int[] parameter) {
		
		int n = parameter.length-1;
		
		int halfLength = parameter.length/2;
		
		int tmp;
		
		for(int i=0; i<halfLength; i++) {
			tmp = parameter[i];
			parameter[i] = parameter[n];
			parameter[n] = tmp;
			n--;
		}
		
		return parameter;
		
	} 
	
}