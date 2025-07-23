class Vehicle {
    private static int vehicleCount = 0;
    private int vehicleID;
    private String brandName;
    private double price;

    Vehicle(int vehicleID, String brandName, double price) {
        this.vehicleID = vehicleID;
        this.brandName = brandName;
        this.price = price;
        vehicleCount++;
    }

    public static int getVehicleCount() {
        return vehicleCount;
    }

    void display() {
        System.out.println("Vehicle ID: " + vehicleID);
        System.out.println("Brand Name: " + brandName);
        System.out.println("Price     : " + price);
        System.out.println();
    }
}

public class Problem4 {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle(101, "Toyota", 30000);
        Vehicle v2 = new Vehicle(102, "Honda", 25000);
        Vehicle v3 = new Vehicle(103, "Ford", 28000);

        v1.display();
        v2.display();
        v3.display();

        System.out.println("Total vehicles created: " + Vehicle.getVehicleCount());
    }
}
