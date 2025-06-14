// Write a Java program to create an interface Shape with the getArea() method. Create 
// three classes Rectangle, Circle, and Triangle that implement the Shape interface. 
// Implement the getArea() method for each of the three classes.
interface Shape{
    void getArea();
}

class Circle implements Shape{
    public void getArea(){
        System.out.println("the area method called in circle class");
    }
}

class Rectangle implements Shape{
    public void getArea(){
        System.out.println("the area method called in Rectangle class");
    }
}

class Triangle implements Shape{
    public void getArea(){
        System.out.println("the area method called in Triangle class");
    }
}
public class a2 {
    public static void main(String [] args){
        Circle obj1 = new Circle();
        obj1.getArea();
        Rectangle obj2 = new Rectangle();
        obj2.getArea();
        Triangle obj3 = new Triangle();
        obj3.getArea();

    }
}
