public class SmartKitchen{
	
	private DishWasher dishWasher;
	private Refrigerator iceBox;
	private CoffeeMaker brewMaster;
	
	public SmartKitchen(){
		brewMaster = new CoffeeMaker();
		dishWasher = new DishWasher();
		iceBox = new Refrigerator();
	}
	
	public Refrigerator getIceBox(){
		return iceBox;
	}
	
	public DishWasher getDishWasher(){
		return dishWasher;
	}
	
	public CoffeeMaker getBrewMaster(){
		return brewMaster;
	}
	
}

class Refrigerator {
	
	private boolean hasWorkToDo;
	
	public void setHasWorkToDo(boolean hasWorkToDo){
		
		this.hasWorkToDo = hasWorkToDo;
		
	}
	
	public void orderFood(){
		
		if(hasWorkToDo){
			System.out.println("Cooling food...");
			hasWorkToDo = false;
		}
	}
	
}

class DishWasher {
	
	private boolean hasWorkToDo;
	
	public void setHasWorkToDo(boolean hasWorkToDo){
		
		this.hasWorkToDo = hasWorkToDo;
		
	}
	
	public void doDishes(){
		if(hasWorkToDo){
			System.out.println("Doing dishes...");
			hasWorkToDo = false;
		}
	}
	
}

class CoffeeMaker {
	
	private boolean hasWorkToDo;
	
	public void setHasWorkToDo(boolean hasWorkToDo){
		
		this.hasWorkToDo = hasWorkToDo;
		
	}
	
	public void brewCoffee(){
		if(hasWorkToDo){
			System.out.println("Brewing coffee...");
			hasWorkToDo = false;
		}
	}
	
}