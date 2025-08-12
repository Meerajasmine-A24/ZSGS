/*  
Design a class named BankAccount that uses the concept of encapsulation.  
The class should have the following private data members: account number, 
account holder name, and balance. Provide public getter and setter methods 
to access and modify these fields. 
Also, include a method to deposit and 
withdraw amount ensuring that the balance cannot go negative. 
*/


import java.util.Scanner;

class BankAccount {
    private final String commonAccountValue = "ABCDEFXYZ";
    private static long accountVal = 10072600;
    private String accountNumber;
    private String accountHolderName;
    private final double minimumBalance = 1000.00;
    private double balance = minimumBalance;

    public void setAccountNumber() {
        accountNumber = commonAccountValue+""+accountVal++;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println( amount + " deposited successfully in ur account ");
        } else {
            System.out.println("Invalid deposit amount.please try again !!");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && (balance - amount) >= minimumBalance) {
            balance -= amount;
            System.out.println(amount + " withdrawn successfully.");
        } else {
            System.out.println("Insufficient balance /   invalid amount.");
        }
    }

    public double getBalance() {
        return balance;
    }

    public void displayDetails() {
        System.out.println("\n\t\tBank Account Details");
        System.out.println("Account Number      : " + getAccountNumber());
        System.out.println("Account Holder Name : " + getAccountHolderName());
        System.out.println("Current Balance     :  " + getBalance());
    }
}

public class Problem5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        BankAccount bacc = new BankAccount();
        bacc.setAccountNumber();
        System.out.print("Enter Account Holder Name : ");
        String name = s.nextLine();
        bacc.setAccountHolderName(name);
        System.out.print("Enter amount to deposit : ");
        double depositAmt = s.nextDouble();
        bacc.deposit(depositAmt);
        System.out.print("Enter amount to withdraw : ");
        double withdrawAmt = s.nextDouble();
        bacc.withdraw(withdrawAmt);
        bacc.displayDetails();
    }
}
