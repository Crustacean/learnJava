public class FlourPacker {
    
    public static boolean canPack(int bigCount, int smallCount, int goal){
        
        int sizeOfBigCount = 5*bigCount;
        int sizeOfSmallCount = 1*smallCount;
        int totalCount = 0;
		int goalControl = goal;
		
        if(totalCount<goal){
            while(sizeOfBigCount>0){
				if((totalCount + 5) <= goalControl){
					totalCount+=5;
					goal-=5;
				}
				
				sizeOfBigCount-=5;
				
				if((totalCount + 5) > goalControl){
					break;
				}
            }
        }
		
		if(totalCount<goalControl){
			while(sizeOfSmallCount>0){
				if((totalCount + 1)<=goalControl){
					totalCount++;
					goal--;
				}
				
				sizeOfSmallCount--;
				
				if((totalCount + 1)>goalControl){
					break;
				}
            }
		}
		
		if(totalCount<goalControl){
			return false;
		}else if(totalCount==goalControl){
			return true;
		}
		
		return false;
        
    }
	
	public static void main(String[] args){
		
		System.out.println(canPack (1, 0, 4));
		
	}
	
}