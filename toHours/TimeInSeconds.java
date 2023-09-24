public class TimeInSeconds{
	
	public static String getDurationString(int seconds){
		
		if(seconds>=0){
			
			return getDurationString(seconds/60,seconds%60);
			
		}else{
			return "Invalid parameter";
		}
		
	}
	
	public static String getDurationString(int minutes, int seconds){
		
		if(minutes>=0 && (seconds>=0 && seconds<=59)){
			
			int hours = minutes/60;
			int min = minutes%60;
			
			return hours+" "+min+" "+seconds;
			
		}else{
			return "Invalid parameter";
		}
		
	}
	
	public static void main(String[] args){
		
		System.out.println(getDurationString(4000));
		System.out.println(getDurationString(76,-12));
		
	}	
	
}