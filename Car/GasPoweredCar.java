public class GasPoweredCar extends Car{
	
	private double avgkmPerLitre;
	private int cylinders;
	
	public GasPoweredCar(String description) {
		super(description);
	}
	
	public GasPoweredCar(String description, double avgkmPerLitre, int cylinders) {
		super(description);
		this.avgkmPerLitre = avgkmPerLitre;
		this.cylinders = cylinders;
		
	}	
	
	public void startEngine() {
		
		System.out.printf("All %d cylinders are fired up, and ready!%n", cylinders);
		
	}
	
	protected void runEngine() {
		
		System.out.printf("Engine is running. Fuel usage %.2f km/l exceeds the average%n", avgkmPerLitre);
		
	}
	
}