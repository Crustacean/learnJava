import java.util.*;

record Place(String name, int distance) {
	
	public Place {
		Objects.requireNonNull(name);
		Objects.requireNonNull(distance);
	}
	
	@Override
	public String toString() {
		return String.format("%s %d", name, distance);
	}
	
}

public class Main {
	
	public static void main(String... args) {
		
		LinkedList<Place> placesToVisit = new LinkedList<>();
		
		Place newPlace = new Place("Tokyo", 300);
		addPlace(placesToVisit, newPlace);
		addPlace(placesToVisit, new Place("Nairobi", 43000));
		addPlace(placesToVisit, new Place("Arusha", 50000));
		addPlace(placesToVisit, new Place("Zambia", 23000));
		addPlace(placesToVisit, new Place("Bisbane", 90000));
		addPlace(placesToVisit, new Place("local", 410));
		placesToVisit.addFirst(new Place("Sydney", 0));
		System.out.println(placesToVisit);
		
		var iterator = placesToVisit.ListIterator();
		Scanner scanner = new Scanner(System.in);
		boolean quitLoop = false;
		boolean forward = true;
		
		printMenu();
		
		while(!quitLoop) {
			System.out.print("Enter command: ");
			String command = scanner.nextLine().toUpperCase().subString(0, 1);
			
		}
		
	}
	
	private static void printMenu() {
		private String message = """
			Available actions (select word or letter):
			(F)orward
			(B)ackward
			(L)ist Places
			(M)enu
			(Q)uit""";
			
		System.out.println(message);
	}
	
	private static void addPlace(LinkedList<Place> listOfPlaces, Place place) {
		
		if(listOfPlaces.contains(place)) {
			System.out.println("Found a duplicate. Not added "+place.name());
			return;
		}
		
		for(Place p : listOfPlaces) {
			if(p.name().equalsIgnoreCase(place.name())) {
				System.out.println("Found a duplicate. Not added "+place.name());
				return;
			}
		}
		
		int matchedIndex = 0;
		for(var listPlace : listOfPlaces) {
			if(place.distance() < listPlace.distance()){
				listOfPlaces.add(matchedIndex, place);
				return;
			}
			matchedIndex++;
		}
		
		listOfPlaces.add(place);
		
	}
	
	
	
}
