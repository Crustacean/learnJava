import java.util.*;
 
public class InputCalculator {
    
    public static void inputThenPrintSumAndAverage(){
        
		Scanner sc = new Scanner(System.in);
		boolean test = true;
		int input = 0;
		int avg = 0;
		int sum = 0;
		int i=0;
		
        while(test){
			
			try{
				
				input = Integer.parseInt(sc.nextLine());
				sum+=input;
				i++;
				
			}catch(NumberFormatException e){
				double median = (double)sum/i;
				avg = (int)Math.round(median);
				System.out.println("SUM = "+sum+" AVG = "+avg);
				test = false;
				break;				
			}
			
		}
        
    }
	
	public static void main(String[] args){
		
		inputThenPrintSumAndAverage();
		
	}
    
}