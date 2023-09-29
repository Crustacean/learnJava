import java.util.*;

public class BankDetails{
	
	private long accountNumber;
	private double accountBalance;
	private String custName;
	private String custEmail;
	private long custPhone;
	
	public void setAccountNumber(long accountNumber){
		this.accountNumber = accountNumber;
	}
	
	public void setAccountBalance(double accountBalance){
		this.accountBalance = accountBalance;
	}
	
	public void setCustName(String custName){
		this.custName = custName;
	}
	
	public void setCustEmail(String custEmail){
		this.custEmail = custEmail;
	}
	
	public void setCustPhone(long custPhone){
		this.custPhone = custPhone;
	}
	
	public long getAccountNumber(){		
		return this.accountNumber;		
	}
	
	public double getAccountBalance(){		
		return accountBalance;
	}
	
	public String getCustName(){
		return custName;		
	}
	
	public String getCustEmail(){
		return custEmail;
	}
	
	public long getCustPhone(){
		return custPhone;
	}
	
	public void deposit(){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please enter your name: ");
		custName = sc.nextLine();
		
		System.out.print("Please enter your email address: ");
		custEmail=sc.nextLine();
		
		System.out.print("Please enter your phone number: ");
		custPhone=sc.nextLong();
		
		try{
			System.out.print("Please enter your Account number: ");
			accountNumber=Long.parseLong(sc.next());
		}catch(NumberFormatException e){
			System.out.println("NumberFormat Exception: Enter a valid account number.");
		}
		
		if(accountNumber == 1L){
			this.accountBalance = 1900.34d;
		}else if(accountNumber == 2L){
			this.accountBalance = 100.04d;
		}else if(accountNumber == 3L){
			this.accountBalance = 10.34d;
		}else if(accountNumber == 22435L){
			this.accountBalance = 1_000_000.34d;
		}else{
			this.accountBalance = 0;
		}
		
		System.out.println("Account-holder's name: "+custName+", Email Address: "+custEmail+", Phone Number: "+custPhone+", Account number: "+accountNumber+", Account balance: "+accountBalance);
		
	}
	
	public void withdraw(){
		
		Scanner sc = new Scanner(System.in);
		int withdrawalAmount = 0;
		
		if(accountBalance>0.0){
			System.out.println(custName+", please go ahead and withdraw");
			
			System.out.println("Enter an amount to withdraw: ");
			
			try{
				withdrawalAmount=Integer.parseInt(sc.next());
				
				if(withdrawalAmount<=accountBalance){
					System.out.println("You are going to withdraw: "+withdrawalAmount);
					System.out.println("Dispensing $"+withdrawalAmount+"...");
					System.out.println("New balance is "+(accountBalance-withdrawalAmount));
				}else{
					throw new NumberFormatException();
				}				
				
			}catch(NumberFormatException e){
				System.out.println("Wrong amount. Please try again.");
			}
			
		}else{
			System.out.println(custName+", you do not have sufficient balance. Please topup and return.");
		}
		
	}
	
}