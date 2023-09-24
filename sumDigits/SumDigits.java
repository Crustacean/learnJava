public class SumDigits{
	
	public static int sumDigits(int number){
		
		if(number<0){
			return -1;
		}
		
		int x = 0;
		int sum = 0;
		
		while(number!=0){
			x = number%7;
			System.out.println(x);
			sum += x;
			number /= 7;
		}
		
		return sum;
	}
	
	
	public static void main(String[] args){
		
		System.out.println(sumDigits(125));
		
	}
	
}