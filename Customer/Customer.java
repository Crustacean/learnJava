public class Customer{
	
	private String name;
	private int creditLimit;
	private String email;
	
	public Customer(){
		this("Nobody", "No email");
	}
	
	public Customer(String name, String email){
		this(name, 500, email);
	}
	
	public Customer(String name, int creditLimit, String email){
		
		this.name=name;
		this.creditLimit=creditLimit;
		this.email=email;
		
	}
	
	public String getName(){ return name;}
	
	public int getCreditLimit(){ return creditLimit; }
	
	public String getEmail(){ return email; }
	
	public void getCustomerDetails(){
		
		System.out.println("Name: "+name);
		System.out.println("Credit Limit: "+creditLimit);
		System.out.println("Email Address: "+email);
		
	}
	
}