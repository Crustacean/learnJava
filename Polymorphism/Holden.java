public class Holden extends Car{
	
	public Ford(boolean engine, int cylinders, String name, int wheels) {
		super(engine, cylinders, name, wheels);
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
	
}