public class Holden extends Car{
	
	public Holden(int cylinders, String name) {
		super(cylinders, name);
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
	
}