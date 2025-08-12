/* -->BasicCalculator (Base class):
Implement at least three basic arithmetic methods, such as:
‌
--->add(int a, int b)
--->subtract(int a, int b)
--->multiply(int a, int b)
--->divide(int a, int b)
‌
--->AdvancedCalculator (Inherits from BasicCalculator):
Add 3 to 4 advanced mathematical operations, such as:
‌
--->power(int base, int exponent)
--->modulus(int a, int b)
--->squareRoot(double number)
‌
--->ScientificCalculator (Inherits from AdvancedCalculator):
Add scientific functions, such as:
‌
--->sin(double angle)
--->cos(double angle)
--->log(double value)
--->exp(double value)
* Demonstrate the use of inheritance by creating an object of ScientificCalculator and calling methods from all three levels of the class hierarchy.
* Use appropriate access specifiers and method overrides where required.
* Add a main() method to test all operations. */ 

import java.util.Scanner;

class Calculator {
    void add(int a, int b) {
        System.out.println("Addition of " + a + " and " + b + " is: " + (a + b));
    }

    void subtract(int a, int b) {
        System.out.println("Subtraction of " + a + " and " + b + " is: " + (a - b));
    }

    void multiplication(int a, int b) {
        System.out.println("Multiplication of " + a + " and " + b + " is: " + (a * b));
    }

    void division(int a, int b) {
        if (b != 0)
            System.out.println("Division of " + a + " and " + b + " is: " + (a / b));
        else
            System.out.println("Cannot divide by zero.");
    }
}

class AdvancedCalculator extends Calculator {
    void power(int base, int exponent) {
        System.out.println("Power of " + base + " raised to " + exponent + " is: " + Math.pow(base, exponent));
    }

    void modulus(int a, int b) {
        System.out.println("Modulus of " + a + " and " + b + " is: " + (a % b));
    }

    void squareRoot(int num) {
        System.out.println("Square root of " + num + " is: " + Math.sqrt(num));
    }
}

class ScientificCalculator extends AdvancedCalculator {
    void sin(double angle) {
        System.out.println("sin(" + angle + ") = " + Math.sin(Math.toRadians(angle)));
    }

    void cos(double angle) {
        System.out.println("cos(" + angle + ") = " + Math.cos(Math.toRadians(angle)));
    }

    void log(double num) {
        if (num > 0)
            System.out.println("log(" + num + ") = " + Math.log(num));
        else
            System.out.println("Logarithm undefined for non-positive numbers.");
    }

    void exponential(double num) {
        System.out.println("exp(" + num + ") = " + Math.exp(num));
    }
}

public class Problem7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ScientificCalculator sc = new ScientificCalculator();

        System.out.println("Enter the operation you want to perform:");
        System.out.println("\n 1.Addition\n 2.Subtraction \n 3.Multiplication \n 4.Division \n 5.Power \n 6.Modulus \n 7.SquareRoot \n 8.Sin \n 9.Cos \n 10.Log \n 11.Exponential");

        int choice = s.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter first number: ");
                int a1 = s.nextInt();
                System.out.print("Enter second number: ");
                int b1 = s.nextInt();
                sc.add(a1, b1);
                break;

            case 2:
                System.out.print("Enter first number: ");
                int a2 = s.nextInt();
                System.out.print("Enter second number: ");
                int b2 = s.nextInt();
                sc.subtract(a2, b2);
                break;

            case 3:
                System.out.print("Enter first number: ");
                int a3 = s.nextInt();
                System.out.print("Enter second number: ");
                int b3 = s.nextInt();
                sc.multiplication(a3, b3);
                break;

            case 4:
                System.out.print("Enter numerator: ");
                int a4 = s.nextInt();
                System.out.print("Enter denominator: ");
                int b4 = s.nextInt();
                sc.division(a4, b4);
                break;

            case 5:
                System.out.print("Enter base: ");
                int base = s.nextInt();
                System.out.print("Enter exponent: ");
                int exponent = s.nextInt();
                sc.power(base, exponent);
                break;

            case 6:
                System.out.print("Enter first number: ");
                int a6 = s.nextInt();
                System.out.print("Enter second number: ");
                int b6 = s.nextInt();
                sc.modulus(a6, b6);
                break;

            case 7:
                System.out.print("Enter number to find square root: ");
                int num = s.nextInt();
                sc.squareRoot(num);
                break;

            case 8:
                System.out.print("Enter angle (in degrees) for sin: ");
                double angleSin = s.nextDouble();
                sc.sin(angleSin);
                break;

            case 9:
                System.out.print("Enter angle (in degrees) for cos: ");
                double angleCos = s.nextDouble();
                sc.cos(angleCos);
                break;

            case 10:
                System.out.print("Enter number to find log: ");
                double logNum = s.nextDouble();
                sc.log(logNum);
                break;

            case 11:
                System.out.print("Enter number to find exponential: ");
                double expNum = s.nextDouble();
                sc.exponential(expNum);
                break;

            default:
                System.out.println("Invalid choice!");
        }

        s.close();
    }
}
