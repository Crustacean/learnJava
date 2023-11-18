public class Car {
	
	public String description;
	
	public Car(String description) {
		
		this.description = description;
		
	}
	
	public void startEngine() {
		
		System.out.println("Start car engine.");
		
	}
	
	protected void runEngine() {
		
		System.out.println("Engine is running...");
		
	}
	
	
	
	public void drive() {
		
		System.out.println("Driving " + getClass().getSimpleName() + " car...");
		runEngine();
		
	}
	
}