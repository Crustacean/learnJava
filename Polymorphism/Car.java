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
	
	public String startEngine() {
		return ("Starting " +getClass().getSimpleName()+ "...");
	}
	
	public String accelerate() {
		return ("Accelerating " +getClass().getSimpleName()+ "...");
	}
	
	public String brake() {
		return ("Braking " +getClass().getSimpleName()+ "...");
	}
	
	public int getCylinders() {
		return cylinders;
	}
	
	public String getName() {
		return name;
	}
	
}