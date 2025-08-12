/*
Write a program to implement bank functionality in the above scenario.
 Note: Create few classes namely Customer, Account, RBI (Base Class) and few derived classes (SBI, ICICI, PNB etc).
 Assume and implement required member variables and methods in each class.
Hint:
class Customer
{
//Personal Details ...
// Few functions ...
}
class Account
{
// Account Detail ...
// Few functions ...
}
abstract class RBI
{
Customer c; //hasA relationship
Account a; //hasA relationship
..
public abstract double getInterestRate();
public abstract double getWithdrawalLimit();
}
class SBI extends RBI
{
//Use RBI functionality or define own functionality.
}
class ICICI extends RBI
{
//Use RBI functionality or define own functionality.
} */
 
class Customer{
	String customerName;
	int customerAge;
	
	public Customer(String customerName,int customerAge){
		this.customerName=customerName;
		this.customerAge=customerAge;
	}
	public String toString(){
		return "Customer Name  : "+customerName+" customer Age : "+customerAge;
	}
}

class Account{
	int accountNumber;
	double balance;
	public Account(int accountNumber,double balance){
		this.accountNumber=accountNumber;
		this.balance=balance;
	}
	
	public String toString(){
		return "Account Number : "+accountNumber+" Balance : "+balance;
	}

}

abstract class RBI{
	
	Customer customer;
	Account account;
	
	public RBI(Customer customer,Account account){
		this.customer=customer;
		this.account=account;
	}
	
	static final double  intrestRate=300.00;
	static final double minwithDrawLimit=2000.00;
	static final double maxWithDrawLimit=25000.00;
	
    public abstract double getInterestRate();
    public abstract double getWithdrawalLimit();	
	public abstract double getMaxWithdrawlLimit();
	
	public void displayDetails(){
		System.out.println(customer);
		System.out.println(account);
		System.out.println("Intrest Rate : "+getInterestRate());
		System.out.println("Minimum With Drawal Limit : "+getWithdrawalLimit());
		System.out.println("Maximum With Drawal Limit : "+getMaxWithdrawlLimit());
	}	
	
}
class SBI extends RBI{
	Customer customer;
	Account account;
	double intrestRate=350.00;
	double minWithDrawLimit=2500.00;
	double maxwithDrawLimit=50000.00;
	
	public SBI(Customer customer,Account account){
		super(customer,account);
	}
		
	
	public double getInterestRate(){
		return intrestRate;
    }
	
	public double getWithdrawalLimit(){
		return minWithDrawLimit;
	}
	
	public double getMaxWithdrawlLimit(){
		return maxwithDrawLimit;
	}
	public String toString(){
		return "Bank : SBI";
    }
	
	
}


class ICICI extends RBI{
	Customer customer;
	Account account;
	
	public ICICI(Customer customer,Account account){
		super(customer,account);
	}
	
	
	double intrestRate=500.00;
	double minWithDrawLimit=1000.00;
	double maxwithDrawLimit=100000.00;
	
	
	public double getInterestRate(){
		return intrestRate;
    }
	
	public double getWithdrawalLimit(){
		return minWithDrawLimit;
	}
	
	public double getMaxWithdrawlLimit(){
		return maxwithDrawLimit;
	}
	
	public String toString(){
		return "Bank : ICICI";
    }
	
}

public class Problem1{
	public static void main(String[]args){
		Customer c1=new Customer("abc",18);
		Account a1=new Account(12345,6000.00);
		RBI sbi=new SBI(c1,a1);
		System.out.println(sbi);
		sbi.displayDetails();
		System.out.println();
		Customer c2=new Customer("xyz",21);
		Account a2=new Account(78901,75000);
		RBI icici=new ICICI(c2,a2);
		System.out.println(icici);
		icici.displayDetails();
	}
}

		
		
		
		
		
		


	


	