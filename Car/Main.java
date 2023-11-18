public class Main {
	
	public static void main(String[] args) {
		
		Car car = new Car("2016 Mazda CX5");
		race(car);
		
		Car ferrari = new GasPoweredCar("GTC4 Lussso", 27.4, 8);
		race(ferrari);
		
	}
	
	public static void race(Car car) {
		
		car.startEngine();
		car.drive();
		
	}
	
	
}