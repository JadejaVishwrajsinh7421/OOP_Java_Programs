// Parent class with final variable and final method
class Parent /*extends FinalClass*/ {
    final int speedLimit = 120; // final variable

    final void displayLimit() { // final method
        System.out.println("Speed limit is: " + speedLimit);
    }
}

// Child class inherits Parent, but cannot override final method
class Child extends Parent {
    // Error if you try to override
    
    // cannot change speed limit
   /*  void displayLimit() {
        
        System.out.println("Speed limit is: " + super.speedlimitr);

        System.out.println("Trying to override...");
    }*/
}

// Final class (cannot be extended further)
final class FinalClass {
    void showMessage() {
        System.out.println("This is a final class. Nobody can extend me!");
    }
}

// class DEMO2 extends final class{
//     // cannnot happen
// }

public class FinalDemo {
    public static void main(String[] args) {
        // Working with final variable and final method
        Child c = new Child();
        c.displayLimit(); // Calls parent's final method
        // c.speedLimit = 200; //  Error: cannot change value of final variable

        // Working with final class
        FinalClass f = new FinalClass();
        f.showMessage();

        // Error if you try:
        // class SubClass extends FinalClass {}
    }
}
