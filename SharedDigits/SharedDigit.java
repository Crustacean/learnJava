public class SharedDigit {
    
    public static boolean hasSharedDigit(int a, int b){
        
        if((a<10 || a>99) || (b<10 || b>99)){
            return false;
        }
        
		int placeholder = b;
        int y = 0;
        int x = 0;
        
        while(a>0){
            y=a%10;
            System.out.println("When 'y' is: "+y);
            
			b = placeholder;
			
            while(b>0){
                x=b%10;
                System.out.println("x is "+x);
				b/=10;
                
                if(y==x){
					return true;
			    }
				
            }
			
            a/=10;
            
        }
        
        return false;
        
    }
	
	public static void main(String[] args){
		System.out.println(hasSharedDigit(12, 51));
		//System.out.println(hasSharedDigit(12, 13));
	}
    
}