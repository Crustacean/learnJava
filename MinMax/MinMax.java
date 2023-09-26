import java.util.*;

public class MinMax{
	
	public static void printMinAndMax(){
		
		Scanner sc = new Scanner(System.in);
		int myValue = 0;
		int min = 0;
		int max = 0;
		
		do{
			
			System.out.print("Enter a number: ");
			myValue = isNumber(sc.NextLine());
			
			if(max>myValue && min>myValue){
				min = myValue;
			}else{
				max = myValue;
			}		
			
			
		}while(isNumber);
		
		System.out.println("Min: "+min+", Max: "+max);
		
	}
	
	public static boolean isNumber(int num){
		
		try{
			
			Integer.parseInt(num);
			return true;
			
		}catch(NumberFormatException e){
			return false;
		}		
		
	}
	
	public static void main(String[] args){
		
		printMinAndMax();
		
	}
	
}