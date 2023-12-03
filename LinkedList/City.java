public class City {
	
	private String town;
	private String distance;
	
	public City(String town, String distance) {
		this.town = town;
		this.distance = distance;
	}
	
	public String getTown() {
		return town;		
	}
	
	public String getDistance() {
		return distance;
	}
	
	public static City CreateList(String town, String distance) {
		return new City(town, distance);
	}
	
}