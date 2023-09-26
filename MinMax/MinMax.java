import java.util.*;

public class MinMax{
	
	public static void printMinAndMax(){
		
		Scanner sc = new Scanner(System.in);
		boolean isNumber = true;
		int myValue = 0;
		int min = 0;
		int max = 0;
		int i = 1;
		
		do{
			
			try{
				
				System.out.print("Enter a number: ");
				myValue = Integer.parseInt(sc.nextLine());
				
				if(i==1){
					min = myValue;
					max = myValue;
				}else{
					if(myValue>max){
					max = myValue;
					}else if(myValue<max && min>myValue){
						min = myValue;
					}
				}
				i++;
				
			}catch(NumberFormatException e){
				
				System.out.println("Ending session.");
				isNumber= false;				
				break;
				
			}
			
		}while(isNumber);
		
		if(i>1){
			System.out.println("Min: "+min+", Max: "+max);
		}else{
			System.out.println("No valid data entered.");
		}
		
	}
	
	public static void main(String[] args){
		
		printMinAndMax();
		
	}
	
}