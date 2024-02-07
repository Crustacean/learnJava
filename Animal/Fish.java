public class Fish extends Animal{
	
	public Fish(String type, String size, double weight) {
		super(type, size, weight);
	}
	
	@Override
	public void move(String speed) {
		if(speed.equals("slow")) {
			System.out.println(type + " swimming lazily.");
		}else {
			System.out.println(type + " darting.");
		}
	}
	
	@Override
	public void makeNoise() {
		
		if (type == "Goldfish") {
			System.out.println("Swish!!");			
		}else{
			System.out.println("Splash!");	
		}
		
	}
	
}