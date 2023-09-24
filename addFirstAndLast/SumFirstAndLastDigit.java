public class SumFirstAndLastDigit {
    
    public static int sumFirstAndLastDigit(int number){
       
        if(number<0){
            return -1;
        }
        
        int lastDigit = number%10;
        int firstDigit = number;
        
		System.out.println(number);
		
        while(firstDigit >= 10){
            firstDigit /= 10;
        }
			
		System.out.println(firstDigit);
		System.out.println(lastDigit);
        
        return (firstDigit+lastDigit);
        
    }
	
	public static void main(String[] args){
		System.out.println(sumFirstAndLastDigit(5));
	}
    
}