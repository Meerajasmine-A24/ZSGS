/*  Use Threads to implement the ATM machine, where create thread to check the PIN number, 
another thread to perform the cash withdrawal,
 another one to check the balance amount and print the receipt. */
 
import java.util.Scanner; 
class AtmMachine{
	final int pinNum=1234;
	int cash=5000;
	boolean pinVerified=false;
	boolean withDrawl=false;
	public synchronized  void checkPin(int pin){ 
	   if(pinNum==pin){
		   System.out.println("Pin Number Confirmed");
		   pinVerified=true;
		   notifyAll();
	   }
	   else
	   {
		   System.out.println("Invalid pin number ");
	   }
	   
   }   
     public synchronized void cashWithDraw(int amount){
     try{
		 while(!pinVerified){
			 wait();
		 }
			if(amount<=cash){
				System.out.println(amount+"  withdrawed Successfully");
				cash=cash-amount;
				withDrawl=true;
				notifyAll();
			}
			else{
				System.out.println("Insufficient Balance ");
			}
		}
		catch(Exception e){
		  e.printStackTrace();
		}	
	 }	
	 
	 public synchronized void checkBalance(){
		 try{
			 while(!withDrawl){
				 wait();
			 }
			 System.out.println("Balance of your account was : "+cash);
		 }
		 catch(Exception e){
			 e.printStackTrace();
		 }
	 }			 
}
 class PinNumber extends Thread{
   AtmMachine atm;
   int pin; 
   public PinNumber(AtmMachine atm,int pin){
	   this.atm=atm;
	   this.pin=pin;
   } 
   public void run(){
	   atm.checkPin(pin);
   }  
}

class CashWithDrawal extends Thread{
	AtmMachine atm;
	int cash;
	public CashWithDrawal(AtmMachine atm,int cash){
		this.atm=atm;
		this.cash=cash;
	}
	
	public void run(){
		atm.cashWithDraw(cash);
	}
}

class Balance extends Thread{
	AtmMachine atm; 
	public Balance(AtmMachine atm){
		this.atm=atm;
	} 
    	public void run(){
			atm.checkBalance();
		}
}
public  class Problem6{
	public static void main(String[]args){
		Scanner s=new Scanner(System.in);
		AtmMachine atm=new AtmMachine();
		System.out.println("Atm Machine");
		System.out.println("Enter your 4 digit pin number : ");
		int pin=s.nextInt();
		PinNumber pn=new PinNumber(atm,pin);
		pn.start();
		try{
			pn.join();
		}
		catch(InterruptedException e){
			e.printStackTrace();
		} 
		if(atm.pinVerified){ 
		System.out.println("Enter cash to withDrawl : ");
        int cash=s.nextInt();
        CashWithDrawal cd=new CashWithDrawal(atm,cash);
		Balance b=new Balance(atm);
		cd.start();
		b.start(); 
		}
				
	}
}

			
		
		
	
	