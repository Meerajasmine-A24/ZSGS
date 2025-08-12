/* 1. Illustrate the concept-Encapsulation with the Payment Gateway System.
[The class should encapsulate private data members such as transaction ID, payer name, payee name, amount, 
payment method, and transaction status. Provide appropriate public getter and setter methods to access and 
modify these details securely.
 Also include a method to display the transaction summary.] */
 
 import java.util.Scanner;
 
 class PaymentGateWaySystem{
	 private int idCounter=1;
	 private int transactionId;
	 private String payerName;
	 private  final String payeeName="Mr.ABC";
	 private double amount;
	 private final String[]paymentMethods={"cash","UPI","creditCard","DebitCard"};
	 private String paymentMethod;
	 private final String[]status={"Transaction Successfull","Transaction Failed"};
	 private String transactionStatus;
	 
	 
	 public void setTransactionId(){
		 this.transactionId=idCounter++;
	 }
	 
	 public int getTransactionId(){
		 return transactionId;
	 }
	 
	 public void setPayerName(String payerName){
		 this.payerName=payerName;
	 }
	 
	 public String getPayerName(){
		 return payerName;
	 }
	 
	 public String getPayeeName(){
		 return payeeName;
	 }
	 
	 public void setAmount(double amount){
		 this.amount=amount;
	 }
	 
	 public double getAmount(){
		 return amount;
	 }
	 
	 public void setPaymentMethod(int choice ){
		 paymentMethod=paymentMethods[choice-1];
	 }
	 
	 public String getPaymentMethod(){
		 return paymentMethod;
	 }
	 
	 public void setTransactionStatus(int choice){
	    transactionStatus=status[choice-1];
	 }
	 
	 public String getTransactionStatus(){
		 return transactionStatus;
	 }
	 
	 public void displayTransactionSummary(){
		 System.out.println("\n/t/tTransaction Summary ");
		 System.out.println("TransactionId : " + getTransactionId());
		 System.out.println("Payer Name : " +getPayerName());
		 System.out.println("Payee Name : "+getPayeeName());
		 System.out.println("Amount : "+getAmount());
		 System.out.println("Payment Method : "+getPaymentMethod());
		 System.out.println("Transaction Status : "+getTransactionStatus());
	 
	 }		 
 }
 
 public class Problem1{
	 public static void main(String[]args){
		 Scanner s=new Scanner(System.in);
		 PaymentGateWaySystem pgs=new PaymentGateWaySystem();
		 pgs.setTransactionId();
		 System.out.println("Enter payer Name : ");
		 String name=s.nextLine();
		 pgs.setPayerName(name);
		 System.out.println("Enter Amount : ");
		 double amount=s.nextDouble();
		 pgs.setAmount(amount);
		  System.out.println("Enter your choice  of transaction : 1.cash 2.UPI 3.CreditCard 4.DebitCard");
		 int choice=s.nextInt();
		 pgs.setPaymentMethod(choice);
		 System.out.println("Enter Transaction Status : 1.Succesfull 2.failuer ");
		 int sts=s.nextInt();
		 pgs.setTransactionStatus(choice-1);
		 pgs.displayTransactionSummary();
	 
	 }
 }