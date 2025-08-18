// this is basically the current object’s reference
class Student {
    String name;
    
    Student(String name) {
        this.name = name; // 'this.name' = instance variable, 'name' = parameter
    }

    void display() {
        System.out.println("Name: " + this.name);
    }
}

public class thisDemo1 {
    public static void main(String[] args) {
        Student s = new Student("Vishwrajsinh");
        s.display();
    }
}

// 2. To call another method in the same class

// class Demo {
//     void show() {
//         System.out.println("Show method called");
//     }
    
//     void display() {
//         this.show(); // Calls show() method
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Demo d = new Demo();
//         d.display();
//     }
// }

// // 3. To call another constructor in the same class
// // This is constructor chaining.

// class Car {
//     String brand;
//     int year;

//     Car() {
//         this("Unknown", 0); // Calls parameterized constructor
//     }

//     Car(String brand, int year) {
//         this.brand = brand;
//         this.year = year;
//     }

//     void display() {
//         System.out.println(brand + " - " + year);
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Car c = new Car();
//         c.display();
//     }
// }

// // 4. To pass current object as a parameter
// // Useful when passing the current object to another method or constructor.

// class Test {
//     void print(Test obj) {
//         System.out.println("Method called using: " + obj);
//     }

//     void call() {
//         print(this); // Pass current object
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Test t = new Test();
//         t.call();
//     }
// }
// // 5. Returning current object
// // this can return the current object, useful for method chaining.
// class Calculator {
//     int value = 0;

//     Calculator add(int n) {
//         this.value += n;
//         return this;
//     }

//     Calculator multiply(int n) {
//         this.value *= n;
//         return this;
//     }

//     void show() {
//         System.out.println("Value: " + value);
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         new Calculator().add(5).multiply(3).show(); // Chaining
//     }
// }