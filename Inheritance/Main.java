public class Main{
	
	public static void main(String[] args){
		
		Employee bob = new Employee("Bob","1950-07-23","2019-01-07");		
		System.out.println(bob);
		System.out.println("Age: " + bob.getAge());
		System.out.println("Salary: " + bob.collectPay());
		
		Employee jane = new Employee("Jane","2000-03-10","2019-01-07");		
		System.out.println(jane);
		System.out.println("Age: " + jane.getAge());
		System.out.println("Salary: " + jane.collectPay());
		
	}
	
}