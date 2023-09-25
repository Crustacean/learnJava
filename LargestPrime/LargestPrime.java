public class LargestPrime {
    
    public static int getLargestPrime(int number){
        
        if(number<=0 || number<=1){
            return -1;
        }else{
            
            int largestPrime = 2;
            
            while(largestPrime<number){
                System.out.println(largestPrime);
                if(number%largestPrime != 0){
                    largestPrime++;
                }else{
                    number/=largestPrime;
                }
                
            }
            
            return number;
            
        }
        
    }
	
	public static void main(String[] args){
		
		System.out.println(getLargestPrime(30));
		
	}
    
}