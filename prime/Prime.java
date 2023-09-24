public class Prime{
	
	public static boolean isPrime(int num){
		
		if(num<=2){
			return (num == 2);
		}
		
		for(int div=2; div<=num/2; div++){
			
			if(num%div == 0){
				return false;
			}
			
		}
		
		return true;
		
	}
	
	public static void main(String[] args){
		
		int x = 0;
		
		for(int i=10; x<3 && i<=500/2;i++){
			if(isPrime(i)){
				System.out.println(i+" is a Prime Number.");
				x++;
			}
		}
		
		System.out.println(x);
		
	}
	
}