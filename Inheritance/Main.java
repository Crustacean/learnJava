public class Main{
	
	public static void main(String[] args){
		
		Employee bob = new Employee("Bob","1970-07-23","2019-01-07");		
		System.out.println(bob);
		System.out.println("Age: " + bob.getAge());
		System.out.println("Salary: " + bob.collectPay());
		
		SalariedEmployee jane = new SalariedEmployee("Jane","2000-03-10","2019-01-07",260000.89);		
		System.out.println(jane);
		System.out.println("Age: " + jane.getAge());
		System.out.println("Salary: " + jane.collectPay());
		System.out.println("Jane's Paycheck is $" + jane.collectPay());
		
		jane.retire();
		System.out.println("Jane's pension is $" + jane.collectPay());
		
		HourlyEmployee mary = new HourlyEmployee("Mary","2010-07-10","2021-12-07",15.90);
		System.out.println(mary);
		System.out.println("Mary's basic Paycheck is $" + mary.collectPay());
		System.out.println("Mary's Holiday Pay is $" + mary.getDoublePay());
		
	}
	
}