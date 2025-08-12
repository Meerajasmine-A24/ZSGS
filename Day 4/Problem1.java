// 1. We want to store the information about different vehicles. Create a class named Vehicle with two data member named mileage and price. Create its two subclasses
// ---Car with data members to store ownership cost, warranty (by years), seating capacity and fuel type (diesel or petrol).
// ---Bike with data members to store the number of cylinders, number of gears, cooling type(air, liquid or oil), wheel type(alloys or spokes) and fuel tank size(in inches)
// Make another two subclasses Audi and Ford of Car, each having a data member to store the model type.
// Next, make two subclasses Bajaj and TVS, each having a data member to store the make-type.
// Now, store and print the information of an Audi and a Ford car (i.e. model type, ownership cost, warranty, seating capacity, fuel type, mileage and price.)
// Do the same for a Bajaj and a TVS bike.

class Vehicle {
    int mileage;
    double price;
}

class Car extends Vehicle {
    double ownershipCost;
    int warranty;
    int seatingCapacity;
    String fuelType;
}

class Audi extends Car {
    String modelType;
    void display() {
        System.out.println("Audi Model: " + modelType);
        System.out.println("Ownership Cost: " + ownershipCost);
        System.out.println("Warranty: " + warranty + " years");
        System.out.println("Seating Capacity: " + seatingCapacity);
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("Mileage: " + mileage);
        System.out.println("Price: " + price);
        System.out.println();
    }
}

class Ford extends Car {
    String modelType;
    void display() {
        System.out.println("Ford Model: " + modelType);
        System.out.println("Ownership Cost: " + ownershipCost);
        System.out.println("Warranty: " + warranty + " years");
        System.out.println("Seating Capacity: " + seatingCapacity);
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("Mileage: " + mileage);
        System.out.println("Price: " + price);
        System.out.println();
    }
}

class Bike extends Vehicle {
    int cylinders;
    int gears;
    String coolingType;
    String wheelType;
    int fuelTankSize;
}

class Bajaj extends Bike {
    String makeType;
    void display() {
        System.out.println("Bajaj Make: " + makeType);
        System.out.println("Cylinders: " + cylinders);
        System.out.println("Gears: " + gears);
        System.out.println("Cooling Type: " + coolingType);
        System.out.println("Wheel Type: " + wheelType);
        System.out.println("Fuel Tank Size: " + fuelTankSize + " inches");
        System.out.println("Mileage: " + mileage);
        System.out.println("Price: " + price);
        System.out.println();
    }
}

class TvsBike extends Bike {
    String makeType;
    void display() {
        System.out.println("TVS Make: " + makeType);
        System.out.println("Cylinders: " + cylinders);
        System.out.println("Gears: " + gears);
        System.out.println("Cooling Type: " + coolingType);
        System.out.println("Wheel Type: " + wheelType);
        System.out.println("Fuel Tank Size: " + fuelTankSize + " inches");
        System.out.println("Mileage: " + mileage);
        System.out.println("Price: " + price);
        System.out.println();
    }
}

public class Problem1 {
    public static void main(String[] args) {
        Audi audi = new Audi();
        audi.modelType = "A4";
        audi.ownershipCost = 500000;
        audi.warranty = 4;
        audi.seatingCapacity = 5;
        audi.fuelType = "Petrol";
        audi.mileage = 15;
        audi.price = 4500000;
        
        Ford ford = new Ford();
        ford.modelType = "Mustang";
        ford.ownershipCost = 600000;
        ford.warranty = 3;
        ford.seatingCapacity = 4;
        ford.fuelType = "Petrol";
        ford.mileage = 12;
        ford.price = 5500000;
        
        Bajaj bajaj = new Bajaj();
        bajaj.makeType = "Pulsar";
        bajaj.cylinders = 1;
        bajaj.gears = 5;
        bajaj.coolingType = "Air";
        bajaj.wheelType = "Alloys";
        bajaj.fuelTankSize = 15;
        bajaj.mileage = 50;
        bajaj.price = 120000;
        
        TvsBike tvs = new TvsBike();
        tvs.makeType = "Apache";
        tvs.cylinders = 1;
        tvs.gears = 5;
        tvs.coolingType = "Oil";
        tvs.wheelType = "Spokes";
        tvs.fuelTankSize = 12;
        tvs.mileage = 45;
        tvs.price = 110000;
        
        audi.display();
        ford.display();
        bajaj.display();
        tvs.display();
    }
}
