class Demo {
    static void greet() { // Static method
        System.out.println("Hello from static method!");
    }

    
    // non static method
    void sayHi() { // Non-static method
        System.out.println("Hello from non-static method!");
    }

    public static void main(String[] args) {
        // Calling without object
        // Demo.greet();

        // Or directly, since main is static and in the same class
        greet();

         // Need to create an object
        Demo obj = new Demo();
        obj.sayHi();
    }
       

}

// 
