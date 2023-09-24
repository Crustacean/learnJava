public class GreatestCommonDivisor {
    
    public static int getGreatestCommonDivisor(int first, int second){
        
        if(first<10 || second<10){
            return -1;
        }
        
        int max = 0;
        
        if(first<second){
            max=first;
        }else{
            max=second;
        }
        
        int control = 0;
        
       /* for(int i=1; i<=max; i++){
            if(first%i == 0 && second%i == 0){
                control=i;
            }
        }*/
        
        int i = 1;
        while(i<=max){
            if(first%i == 0 && second%i == 0){
				System.out.println("Other common divisors are: "+i);
                control=i;
            }
            i++;
        }
        
        return control;
        
    }
	
	public static void main(String[] args){
		
		System.out.println("The greatest common divisor is: "+getGreatestCommonDivisor(12, 30));
		
	}
    
}