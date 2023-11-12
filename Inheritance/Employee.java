public class Employee extends Worker {
	
	private Long employeeId;
	private String hireDate;
	
	public Employee(String name, String birthDate, Long employeeId, String hireDate){
		super(name, birthDate);
		this.employeeId = employeeId;
		this.hireDate = hireDate;
	}
	
	public String toString(){
		return super.toString()+", "+employeeId+", "+hireDate;
	}
	
}