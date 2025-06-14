// Write a program that illustrates interface inheritance. Interface A is extended by A1 and 
// A2. Interface A12 inherits from both A1 and A2.Each interface declares one constant 
// and one method. Class B implements A12.Instantiate B and invoke each of its methods. 
// Each method displays one of the constants. 

interface A {  
    int a =10;
    void callinterA();
}
interface a1 extends A {
    int a1 = 12;
    void callintera1();
}

interface b1 extends A {
    int b1 =14;
    void callinterb1();
}

interface  a12 extends a1,b1{
    int a12 =43;
    void callintera12();
}
class B implements a12{
    public void callinterA(){
        System.out.println("a is called"+ a);
    }

    public void callintera1(){
        System.out.println("a1 is called"+ a1);
    }

    public void callinterb1(){
        System.out.println("a1 is called"+ b1);
    }

    public void callintera12(){
        System.out.println("a1 is called"+ a12);
    }
} 


public class interfacedemo {
    public static void main(String[] args) {
        B obj1 = new B();
        obj1.callinterA();
        obj1.callintera1();
        obj1.callinterb1();
        obj1.callintera12();
    }
}
