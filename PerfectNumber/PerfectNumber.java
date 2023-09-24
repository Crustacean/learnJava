public class PerfectNumber {
    
    public static boolean isPerfectNumber(int number){
        
        if(number<1){
            return false;
        }
        
        int control = 0;
        
        for(int i=1; i<=number/2; i++){
            if(number%i == 0){
				System.out.println(i);
                control+=i;
            }
        }
        
        if(control==number){
            return true;
        }
        
        return false;
        
    }
	
	public static void main(String[] args){
		
		System.out.println(isPerfectNumber(28));
		System.out.println(isPerfectNumber(7));
		
	}
    
}