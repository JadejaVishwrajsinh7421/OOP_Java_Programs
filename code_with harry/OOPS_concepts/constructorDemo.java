class Car {
    String brand;
    int year;

    // Default Constructor
     Car() {
        brand = "Unknown";
        year = 0;
        System.out.println("Default constructor called!");
    }

    Car(String b, int y) {
        brand = b;
        year = y;
        System.out.println("Parameterized constructor called!");
    }

     void display() {
        System.out.println("Brand: " + brand + ", Year: " + year);
    }
}

public class constructorDemo {
    public static void main(String[] args) {
        Car c1 = new Car(); // Auto calls default constructor
        System.out.println("Brand: " + c1.brand);

        Car c2 = new Car("Tesla", 2025);
        System.out.println("Brand: " + c2.brand + ", Year: " + c2.year);

        Car c3 = new Car("BMW", 2023);

        c1.display();
        c2.display();
        c3.display();
    }
}
