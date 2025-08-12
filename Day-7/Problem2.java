/* Design a Payment Gateway System using an interface named PaymentMethod with a method pay(double amount).
 Implement this interface in different classes like CreditCardPayment, DebitCardPayment, and UPIPayment.
 Write a main class where you can accept payment using different methods. */

import java.util.Scanner;

interface PaymentMethod {
	public double pay(double amount);
}

class CreditCardPayment implements PaymentMethod {
	@Override
	public double pay(double amount) {
		double discount = amount * 0.20;
		System.out.println("Congratulations 20 % discount offer have been applied to your payment ");
		return amount - discount;
	}
}

class DebitCardPayment implements PaymentMethod {
	@Override
	public double pay(double amount) {
		double discount = amount * 0.05;
		System.out.println("Congratulations 5 % discount offer have been applied to your payment ");
		return amount - discount;
	}
}

class UPIPayment implements PaymentMethod {
	@Override
	public double pay(double amount) {
		if (amount > 2500) {
			System.out.println("Congratulations you have saved Rs.100  ");
			return amount - 100;
		}
		return amount;
	}
}

public class Problem2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		PaymentMethod payment = null;
		double amount = 4500.80;
		System.out.println("Choose Payment Method:");
		System.out.println("1.Credit Card");
		System.out.println("2.Debit Card");
		System.out.println("3.UPI");
		int choice = s.nextInt();
		switch (choice) {
			case 1:
				payment = new CreditCardPayment();
				break;
			case 2:
				payment = new DebitCardPayment();
				break;
			case 3:
				payment = new UPIPayment();
				break;
			default:
				System.out.println("Invalid choice.");
				System.exit(0);
		}

		double finalAmount = payment.pay(amount);

		System.out.println("Final Amount to be pay was : " + finalAmount);
		System.out.println("Please Wait Processing your payment ");
		System.out.println("-----------------------------");
		System.out.println("Payment Successfull");

		s.close();
	}
}
