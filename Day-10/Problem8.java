/* Develop a Java program to manage a list of bank accounts using ArrayList.
--->Create an Account class with the following attributes:
a. accountNumber (int)
b. holderName (String)
c. balance (double)
--->Use autoboxing to store the balance and interest as Double wrapper objects.
--->Use manual boxing to convert a primitive interest rate into a Double object.
--->Unbox the values (both automatic and manual) to calculate and update the new balance.
--->Add at least three Account objects to an ArrayList<Account>.
--->For each account:
a. Display the holder name, account number, original balance
b. Apply 5% interest
c. Show the new balance using primitive values (unboxed). */

import java.util.*;

class Account{
  int accountNumber;
  String holderName;
  Double balance;
  
  public Account(int accountNumber,String holderName,double balance){
	  this.accountNumber=accountNumber;
	  this.holderName=holderName;
	  this.balance=balance;
  }
  
}

public class Problem8{
	public static void main(String[]args){
		List<Account> accounts=new ArrayList<>();
		accounts.add(new Account(123,"ABC",50000.00));
		accounts.add(new Account(456,"XYZ",19700.00));
		accounts.add(new Account(123,"PQRS",458900));
		
		double rate=50.00;
		Double rateOfIntrest=Double.valueOf(rate);
		
		for(Account acc : accounts ){
			System.out.println("Account Number  : "+acc.accountNumber);
			System.out.println("Account Holder Name : "+acc.holderName);
			System.out.println("Original Balance : "+acc.balance);
			
			double balance=acc.balance;
			double intrest=Double.valueOf(rateOfIntrest);
			
			System.out.println("Balance with intrest : "+(balance+intrest));
			
		}
	}
	
}
			
			
			
			
		
		
		
		
		  