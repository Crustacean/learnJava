public class NumberToWords {
    
    public static void numberToWords(int number){
        
        if(number<0){
            System.out.println("Invalid Value");
        }
        
        switch(number){
            
            case 1 -> System.out.println("One");
            case 2 -> System.out.println("Two");
            case 3 -> System.out.println("Three");
            case 4 -> System.out.println("Four");
            case 5 -> System.out.println("Five");
            case 6 -> System.out.println("Six");
            case 7 -> System.out.println("Seven");
            case 8 -> System.out.println("Eight");
            case 9 -> System.out.println("Nine");
            case 0 -> System.out.println("Zero");
            default -> System.out.println("Invalid Value");
            
        }
        
    }
	
	public static void main(String[] args){
		
		numberToWords(123);
		numberToWords(1010);
		numberToWords(1000);
		
	}	
    
}