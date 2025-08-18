class Animal {
    String color = "White"; // Parent variable

    // Parent constructor
    Animal() {
        System.out.println("Animal constructor called");
    }

    // Parent method
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    String color = "Black"; // Child variable

    // Child constructor
    Dog() {
        super(); //Calls parent constructor
        System.out.println("Dog constructor called");
    }

    void displayColors() {
        System.out.println("Child color: " + color);        // Child variable
        System.out.println("Parent color: " + super.color); //Access parent variable
    }

    @Override
    void sound() {
        super.sound(); //Call parent method
        System.out.println("Dog barks");
    }
}

public class superdemo {
    public static void main(String[] args) {
        Dog d = new Dog();

        // Show variable access
        d.displayColors();

        // Show method overriding with super
        d.sound();
    }
}
