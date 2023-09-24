public class Convert{
	
	public static double convertToCentimeters(int inch){
		
		double constant = 2.54;
		
		return inch*constant;
		
	}
	
	public static double convertToCentimeters(int feet, int inch){
		
		int constant = 12;
		
		int feetToInch = feet*constant;
		
		int heightInInches = feetToInch+inch;
		
		return convertToCentimeters(heightInInches);
		
	}
	
	
	public static void main(String[] args){
		
		System.out.println(convertToCentimeters(68));
		System.out.println(convertToCentimeters(12,2));
		
	}	
	
}