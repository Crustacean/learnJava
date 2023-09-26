import java.util.*;
 
public class InputCalculator {
    
    public static void inputThenPrintSumAndAverage(){
        
		Scanner sc = new Scanner(System.in);
		boolean test = true;
		int input = 0;
		double avg = 0L;
		int sum = 0;
		int i=0;
		
        while(test){
			
			try{
				
				input = Integer.parseInt(sc.nextLine());
				
				sum+=input;
				System.out.println("cycle is "+i);
				System.out.println("total is "+sum);
				i++;
				
			}catch(NumberFormatException e){
				System.out.println("cycle is "+i);
				avg = (double)Math.round((sum/i));
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