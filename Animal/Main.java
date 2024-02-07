import java.util.*;

public class Main{
	
	public static void main(String[] args) {
		
		Dog dog = new Dog("Wolf", "big", 100);
		dog.makeNoise();
		
		doAnimalStuff(dog);
		
		ArrayList<Animal> animals = new  ArrayList<>();
		
		animals.add(dog);
		animals.add(new Dog("Germanshepherd", "small", 150));
		animals.add(new Dog("Akita", "large", 150));
		animals.add(new Fish("Shark", "big", 200));
		animals.add(new Fish("Goldfish", "small", 1));
		
		for(Animal animal : animals) {
			doAnimalStuff(animal);
		}
		
		
	}
	
	private static void doAnimalStuff(Animal animal) {
		
		animal.makeNoise();
		animal.move("slow");
		
	}
	
}