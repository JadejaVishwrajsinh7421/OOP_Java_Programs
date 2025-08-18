class Animal {
    void eat() {
        System.out.println("Animal eats food");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

public class singleinheritancedemo {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();  // from Animal
        d.bark(); // from Dog
    }
}

