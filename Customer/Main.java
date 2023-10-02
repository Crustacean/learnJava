public class Main{
	
	public static void main(String[] args){
		
		Customer firstCustomer = new Customer("Bancy Nashipai", 2000, "bancynashipai@gmail.com");
		firstCustomer.getCustomerDetails();
		System.out.println(firstCustomer.getName());
		
		Customer secondCustomer = new Customer("John Doe", "jdoe@email.com");
		System.out.println(secondCustomer.getName());
		
		Customer unknownCustomer = new Customer();
		System.out.println(unknownCustomer.getName());
		System.out.println(unknownCustomer.getCreditLimit());
		System.out.println(unknownCustomer.getEmail());
		
	}
	
}