class Employee {
    String name;
    int yearOfJoining;
    String address;

    Employee(String name, int yearOfJoining, String address) {
        this.name = name;
        this.yearOfJoining = yearOfJoining;
        this.address = address;
    }
}

public class Problem6 {
    public static void main(String[] args) {
        Employee e1 = new Employee("Robert", 1994, "64C- WallsStreat");
        Employee e2 = new Employee("Sam", 2000, "68D- WallsStreat");
        Employee e3 = new Employee("John", 1999, "26B- WallsStreat");

        System.out.println("Name\tYear of joining\tAddress");
        System.out.println(e1.name + "\t" + e1.yearOfJoining + "\t\t" + e1.address);
        System.out.println(e2.name + "\t" + e2.yearOfJoining + "\t\t" + e2.address);
        System.out.println(e3.name + "\t" + e3.yearOfJoining + "\t\t" + e3.address);
    }
}
