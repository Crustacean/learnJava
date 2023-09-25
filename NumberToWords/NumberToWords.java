public class NumberToWords {
    
    public static void numberToWords(int number){
        
        if(number<0){
            System.out.println("Invalid Value");
        }
        
        int control = reverse(number);
		System.out.println(number);
        int x = 0;
        
        while(control>0){
            
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
            
        }
        
    }
    
    public static int getDigitCount(int number){
        
        if(number<0){
            return -1;
        }
        
        String stringOfNumber = ""+number;
        int x = stringOfNumber.length();
        
        return x;
        
    }
    
    public static int reverse(int number){
        
        int reversedNumber = 0;
        
        while(number>0){
			int remainder = number%10;
			reversedNumber = reversedNumber*10 + remainder;
            number/=10;
        }
        
        return reversedNumber;
        
    }
	
	public static void main(String[] args){
		
		numberToWords(123);
		numberToWords(1010);
		numberToWords(1000);
		
	}	
    
}