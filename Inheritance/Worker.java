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
		return name+", "+birthDate;
	}
	
	public int getAge(){
		
		try{
			
			LocalDate dateOfBirth = LocalDate.parse(birthDate);
			LocalDate currentDate = LocalDate.now();
			
			if ((dateOfBirth != null) && (currentDate != null)) {
				
					return Period.between(dateOfBirth, currentDate).getYears();
				
			} else {
				
				return 0;
			
			}
			
		}catch(Exception e){
			
			System.out.print("Error. Enter date of birth in YYYY-MM-DD format.");
			
			System.err.println("ParseException caught!");
            e.printStackTrace();
			
		}
		
		return 0;
		
	}
	
	public double collectPay() {
		 if (getAge() <= 65 ){
			return 15000.87;
		 }else {		
			return 0.0;	
		 }			
	}
	
	public void terminate(String endDate){
		
		this.endDate = endDate;
		
	}
	
}