import java.util.*;

public class ReadUserInput{
	
	public static double readUserInput(int count){
		
		double sum = 0;
		
		Scanner sc = new Scanner(System.in);
		
		int i = 1;
		do{
			System.out.print("Enter number #"+i+": ");
			
			try{
				double number = Double.parseDouble(sc.nextLine());
				i++;
				sum+=number;
			}catch(NumberFormatException e){
				System.out.println("Characters not allowed! Try again.");
			}
			
		}while(i<=count);
		
		return sum;
		
	}
	
	public static void main(String[] args){
		
		int count = 5;
		
		System.out.println(readUserInput(count));
		
	}
	
}