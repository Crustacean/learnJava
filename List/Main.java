import java.util.*;

public class Main {
	
	public static void main(String... args) {
		
		String[] items = {"milk", "juice", "soda", "wine", "vinegar"};
		
		List<String> list = List.of(items);
		
		System.out.println(list);
		System.out.println(list.getClass().getName());
		System.out.println(list.getClass().getSimpleName());
		
		ArrayList<String> anotherList = new ArrayList<>(List.of("tomato sauce", "mustard", "chilli"));
		System.out.println(anotherList);
		
		anotherList.addAll(List.of("ham", "beef", "chicken"));
		System.out.println(anotherList);
		
		anotherList.addAll(Arrays.asList("pig", "cow", "goat"));
		System.out.println(anotherList);
		
		anotherList.retainAll(Arrays.asList("pig", "cow", "goat"));
		System.out.println(anotherList);
		
		anotherList.sort(Comparator.reverseOrder());
		System.out.println(anotherList);
		
		if(anotherList.contains("chicken")){
			System.out.println("Contains chicken");
		}else{
			System.out.println("Does not contain chicken");
			anotherList.add("Chicken");
			System.out.println(anotherList);
		}
		
		var myArray = anotherList.toArray(new String[anotherList.size()]);
		System.out.println("myArray "+Arrays.toString(myArray));
		
		ArrayList<Integer> numbers = new ArrayList<>(List.of(1,3,4,5,6));
		System.out.println(numbers);
		
		ArrayList<Double> decimals = new ArrayList<>(Arrays.asList(1.0,3.2,4.90,5.6,6.4));
		System.out.println(decimals);
		
		for(int i=0; i<decimals.size()-1; i++) {
			System.out.println(decimals.get(i));
		}
		
		ArrayList<String> stringLists = new ArrayList<>(Arrays.asList("Monday", "Tuesday", "Wednesday"));
		String[] stringArray = stringLists.toArray(new String[0]); 
		
		System.out.println(stringArray);
		
	}
	
}