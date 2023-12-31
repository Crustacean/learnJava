public class NumberToWords {
    
    public static void numberToWords(int number){
        
        if(number<0){
            System.out.println("Invalid Value");
        }
        
        int control = reverse(number);
		int count = getDigitCount(number);
        int x = 0;
        
        while(count>0){
            
            x = control%10;
            
            String wordOfNumber = switch(x){
            
                case 1 -> "One";
                case 2 -> "Two";
                case 3 -> "Three";
                case 4 -> "Four";
                case 5 -> "Five";
                case 6 -> "Six";
                case 7 -> "Seven";
                case 8 -> "Eight";
                case 9 -> "Nine";
                case 0 -> "Zero";
                default -> {
                    yield "Invalid Value";
                }
                
            };
            
            System.out.print(wordOfNumber+" ");
            
            control/=10;
			count--;
            
        }
        
    }
    
    public static int getDigitCount(int number){
		
		if(number < 0){
            return -1;
        }else if(number == 0){
            return 1;
        }		
		
        int count = 0;
		
        while(number > 0){
            count++;
            number /= 10;
        }
        return count;
        
    }
    
    public static int reverse(int number){
        
        int reversedNumber = 0;
        
        int control = number;
        
        if(number<0){
            number*=-1;
        }
        
        while(number>0){
			int remainder = number%10;
			reversedNumber = reversedNumber*10 + remainder;
            number/=10;
        }
        
        if(control<0){
            reversedNumber*=-1;
        }
        
        return reversedNumber;
        
    }
	
	public static void main(String[] args){
		
		numberToWords(37683);
		System.out.println("\n");
		numberToWords(1010);
		System.out.println("\n");
		numberToWords(1000);
		System.out.println("\n");
		numberToWords(777);
		System.out.println("\n");
		numberToWords(0);
		System.out.println("\n");
		numberToWords(1);
		System.out.println("\n");
		numberToWords(20);
		System.out.println("\n");
		numberToWords(02);
		System.out.println("\n");
		
	}	
    
}