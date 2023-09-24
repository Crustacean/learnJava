public class CalculateInterest{
	
	
	public static void calculateInterest(double a, double b, double x){
		
		for(double i=b; i<=a; i+=x){
			double interestAmount = calculateInterest(100.00,i);
			System.out.println("$100 @"+i+" interest = $"+interestAmount);
		}
		
	}
	
	public static double calculateInterest(double amount, double interest){
		
		return (amount*interest);
		
	}	
	
	public static void main(String[] args){
		
		double upper = 10.0;
		double lower = 7.5;
		double increment = 0.25;
		
		calculateInterest(upper, lower, increment);		
		
	}
	
}