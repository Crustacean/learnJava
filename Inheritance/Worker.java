import java.time.*;
import java.util.*;

public class Worker {
	
	private String name;
	private String birthDate;
	protected String endDate;
	
	public Worker(){
		
	}
	
	public Worker(String name, String birthDate){
		
		this.name = name;
		this.birthDate = birthDate;
		
	}
	
	public String toString(){
		return name+", "+birthDate+", "+endDate;
	}
	
	public int getAge(){
		
		System.out.print("Enter date of birth in YYYY-MM-DD format: ");
		
		Scanner scanner = new Scanner(System.in);
		
		String birthDate = scanner.nextLine();  
		scanner.close(); 
		
		LocalDate dateOfBirth = LocalDate.parse(birthDate);
		LocalDate currentDate = LocalDate.now();
		
		if ((dateOfBirth != null) && (currentDate != null)) {
			
				return Period.between(dateOfBirth, currentDate).getYears();
			
			} else {
				
				return 0;
			
			}
		
		}
		
	}
	
	public double collectPay(){
		
		if(getAge()<65){
			
			return 176000.90;
			
		}
		
	}
	
	public String terminate(String endDate){
		
		this.endDate = endDate;
		
	}
	
}