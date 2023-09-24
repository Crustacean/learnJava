public class EvenDigitSum{
	
	public static int getEvenDigitSum(int number){
        
        if(number < 0){
           return -1; 
        }
        
        int x = 0 ;
        int y = 0;
        
        while(number > 0){
			y = number % 10;
            number/=10;
			if(y%2 == 0){
				x+=y;
			}
        }
        
        return x;
        
    }	
	
	public static void main(String[] args){
		System.out.println(getEvenDigitSum(123456789));
		//System.out.println(getEvenDigitSum(252));
		//System.out.println(getEvenDigitSum(-22));
	}
	
}