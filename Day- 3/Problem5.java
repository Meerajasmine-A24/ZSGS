// invnetory management system 

import java.lang.classfile.instruction.ThrowInstruction;
import java.lang.management.ThreadInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Store {
    static String storeName;
    static String storeLocation;
    List<Product> storeProducts = new ArrayList<>();

    static void setStoreDetails(String name, String location) {
           storeName = name;
        storeLocation = location;
    }

    static void displayStoreDetails() {
        System.out.println("Store Name: " + storeName);
        System.out.println("Store Location: " + storeLocation);
    }

    void addProduct(Product product) {
        storeProducts.add(product);
    }

    void displayAllProducts() {
        for (Product p : storeProducts) {
            p.displayProduct();
        }
    }
}

class Product {
    int productId;
    String productName;
    double price;
    int quantity;

    Product(int productId, String productName, double price, int quantity) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    void displayProduct() {
        System.out.println("\n Product ID : " + productId);
        System.out.println("Product Name : " + productName);
        System.out.println("Price : " + price);
        System.out.println("Quantity : " + quantity);
    }
}

public class Problem5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter Store Name: ");
        String storeName = s.nextLine();
        System.out.print("Enter Store Location: ");
        String storeLocation = s.nextLine();
        Store.setStoreDetails(storeName, storeLocation);

        Store store = new Store();

        Product p1 = new Product(1, "Bath Soap",50.00, 50);
        Product p2 = new Product(2, "Shampoo", 30.00, 30);
        Product p3 = new Product(3, "Toothpaste", 25.00, 40);

        store.addProduct(p1);
        store.addProduct(p2);
        store.addProduct(p3);

        Store.displayStoreDetails();
        System.out.println(" Products in store ");
        store.displayAllProducts();
    }
}
