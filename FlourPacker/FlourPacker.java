public class FlourPacker {
    
    public static boolean canPack(int bigCount, int smallCount, int goal){
        
        int sizeOfBigCount = 5*bigCount;
        int sizeOfSmallCount = 1*smallCount;
        int totalCount = 0;
        
        while(totalCount<goal){
            if((sizeOfBigCount>0) && ((totalCount + 5) < goal)){
                totalCount+=5;
                sizeOfBigCount-=5;
            }else if((sizeOfSmallCount>0) && (totalCount + 1)<goal){
                totalCount++;
                sizeOfSmallCount--;
            }
        }
		
		System.out.println("The goal was: "+goal);
		System.out.println("Achieved: "+totalCount);
		
		
		
		if(totalCount<goal){
			return false;
		}else if(totalCount==goal){
			return true;
		}
		
		return false;
        
    }
	
	public static void main(String[] args){
		
		System.out.println(canPack (3, 2, 9));
		System.out.println(canPack (1, 0, 5));
		
	}
	
}