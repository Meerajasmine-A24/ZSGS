// Explicit type casting

public class Problem6 {

    public static void main(String[] args) {
        double doubleValue = 10.75;
        int intValue = (int) doubleValue;

        int largeInt = 130;
        byte byteValue = (byte) largeInt;

        System.out.println("Double value: " + doubleValue);
        System.out.println("After casting to int: " + intValue);

        System.out.println("Int value: " + largeInt);
        System.out.println("After casting to byte: " + byteValue);
    }
} 
