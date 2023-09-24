public class While{
	
	public static boolean isEvenNumber(int num){
		
		if(num <= 0 ){
			return false;
		}
		
		if(num%2 == 0){
			return true;
		}
		
		return false;
		
	}
	
	public static void main(String[] args){
		
		int count = 0;
		int i = 4;
		int end = 20;
		
		while(i<=end){
			i++;
			if(!isEvenNumber(i)){
				continue;
			}
			System.out.println(i);
			count++;
			if(count == 5){
				break;
			}
		}
		
	}
	
}