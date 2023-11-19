public class Car {
	
	private boolean engine;
	private int cylinders;
	private String name;
	private int wheels;
	
	public Car(int cylinders, String name) {
		this(true, cylinders, name, 4);
	}
	
	public Car(boolean engine, int cylinders, String name, int wheels) {
		this.engine = engine;
		this.cylinders = cylinders;
		this.name = name;
		this.wheels = wheels;
	}
	
	public void startEngine() {
		System.out.println("Starting " +getClass().getSimpleName()+ "...");
	}
	
	public void accelerate() {
		System.out.println("Accelerating " +getClass().getSimpleName()+ "...");
	}
	
	public void brake() {
		System.out.println("Braking " +getClass().getSimpleName()+ "...");
	}
	
	public int getCylinders() {
		return cylinders;
	}
	
	public String getName() {
		return name;
	}
	
	
	
	
}