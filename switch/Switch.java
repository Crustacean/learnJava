public class Switch{
	
	public static void whatValue(int value){
		
		switch(value){
			
			case 1:
				System.out.println("Value is 1");
				break;
				
			case 2:
				System.out.println("Value is 2");
				break;
				
			default:
				System.out.println("Value is neither 1 or 2");
				break;
			
		}
		
	}
	
	public static String getQuarter(String month){
		
		return switch(month){
			
			case "JANUARY", "FEBRUARY", "MARCH" -> "1st";
			case "APRIL", "MAY", "JUNE" -> "2nd";
			case "JULY", "AUGUST", "SEPTEMBER" -> "3rd";
			case "OCTOBER", "NOVEMBER", "DECEMBER" -> "4th";
			default -> {
				String badResponse = month+" is a bad value";
				yield badResponse;
			}
		};
		
	}
	
	public static String getNATOPhonetic(char phonetic){
		
		return switch(phonetic){
			
			case 'A' -> "Able";
			case 'B' -> "Baker";
			case 'C' -> "Charlie";
			case 'D' -> "Dog";
			case 'E' -> "Easy";
			default -> {
				String badResponse = (phonetic+" Not found");
				yield badResponse;
			}
			
		};
		
	}
	
	public static void printDayOfWeek(int day){
		
		String dayOfTheWeek = "";
		
		dayOfTheWeek = switch(day){
			
			case 0 -> "Sunday";
			case 1 -> "Monday";
			case 2 -> "Tuesday";
			case 3 -> "Wednesday";
			case 4 -> "Thursday";
			case 5 -> "Friday";
			case 6 -> "Saturday";
			default -> {
				yield "Invalid Day";
			}
			
		};
		
		System.out.println(dayOfTheWeek);
		
	}
	
	public static boolean isLeapYear(int year){
        
        if(year>=1 && year<=9999){
            
            if((year%4 == 0 && year%100 != 0) || (year%400 == 0)){
                return true;
            }else{
                return false;
            }
            
        }else{
            return false;
        }
        
    }
    
    public static int getDaysInMonth(int month, int year){
        
        if(month<1 || month>12){
            return -1;
        }
        
        if(year<1 || year>9999){
            return -1;
        }
        
        if(month==2 && isLeapYear(year)){
            return 29;
        }else{
            return switch(month){
                case 1 -> 31;
                case 2 -> 28;
                case 3 -> 31;
                case 4 -> 30;
                case 5 -> 31;
                case 6 -> 30;
                case 7 -> 31;
                case 8 -> 31;
                case 9 -> 30;
                case 10 -> 31;
                case 11 -> 30;
                case 12 -> 31;
                default -> {
                    yield -1;
                }
            };
        }
        
    }
	
	public static void main(String[] args){
		
		whatValue(1);
		String month = "neew";		
		System.out.println(month+" is in the "+getQuarter(month)+" quarter of the year.");
		System.out.println(getNATOPhonetic('J'));
		
		for(int i=0; i<=6; i++){
			printDayOfWeek(i);
		}
		
		printDayOfWeek(7);
		printDayOfWeek(-1);
		printDayOfWeek('A');
		System.out.println(getDaysInMonth(2, 2020));
		
	}
	
}