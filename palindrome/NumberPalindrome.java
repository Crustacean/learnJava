public class NumberPalindrome {
    
    public static boolean isPalindrome(int number){
        
		int control = number;
        int reverse = 0;
        
        while(number!=0){
            
            int lastDigit = number%10;
            reverse *=10;
            reverse+=lastDigit;
            number /=10;
			System.out.println(reverse);
            
        }
		
		System.out.println(reverse);
		System.out.println(number);
		System.out.println(control);
        
        if(control == reverse){
            return true;
        }
        
        return false;
        
    }
	
	public static void main(String[] args){
		
		System.out.println(isPalindrome(-1221)); //→ should return true
		System.out.println(isPalindrome(707)); //→ should return true
		System.out.println(isPalindrome(11212)); //→ should return false because reverse is 21211 and that is not equal to 11212
		
	}
 
}