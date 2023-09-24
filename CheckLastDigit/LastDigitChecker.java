public class LastDigitChecker{
	
	public static boolean hasSameLastDigit(int a, int b, int c){
        
        if(!isValid(a) || !isValid(b) || !isValid(c)){
           return false; 
        }
        
        int x = a%10;
        int y = b%10;
        int z = c%10;
        
        if(x==y || x==z || y==z){
            return true;
        }
        
        return false;
        
    }
    
    public static boolean isValid(int num){
        
        if(num>=10 && num<=1000){
            return true;
        }
        
        return false;
        
    }
	
	
	public static void main(String[] args){
		
		System.out.println(hasSameLastDigit (41, 22, 71));
		System.out.println(hasSameLastDigit (9, 21, 71));
		System.out.println(hasSameLastDigit (60, 21, 55));
		System.out.println(hasSameLastDigit (23, 32, 42));
		
	}	
	
}