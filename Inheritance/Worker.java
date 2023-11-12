import java.time.*;
import java.util.*;

public class Worker {
	
	private String name;
	private String birthDate;
	private String endDate;
	
	public Worker(){
		
	}
	
	public Worker(String name, String birthDate, String endDate){
		
		this.name;
		this.birthDate;
		this.endDate;
		
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
		
		try{
			
			LocalDate terminateDate = LocalDate.parse(endDate);
			
			if(getAge() >= 65 || terminateDate >= LocalDate.now() ){
				System.out.println("Yes");
			}else{
				System.out.println("No");
			}
			
		}catch(ParseException e){
			System.out.println(endDate+" is not a valid date");
		}
		
	}
	
}