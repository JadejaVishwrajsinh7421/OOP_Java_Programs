//  The abstract vegetable class has three subclasses named Potato, Brinjal and Tomato. 
// Write a java program that demonstrates how to establish this class hierarchy. Declare 
// one instance variable of type String that indicates the color of a vegetable. Crete and 
// display instances of these objects. Override the toString() method of object to return a 
// string with the name of vegetable and its color. 

abstract  class vegetables{
     String colour;
    public abstract String toString();
}
class Poatato extends vegetables{
    public Poatato(){
        colour = "reddish yellow ";
        System.out.println("the yellow class is called");
        
    }
    public String toString(){
        
        return colour;
    }
}

class Brinjal extends vegetables{
    public  Brinjal(){
        colour = "purple";
        System.out.println("the Brinjal class is called");
    }
    public String toString(){
        return colour;
    }
}
class Tomato extends vegetables{
    public Tomato(){
        colour = "red";
        System.out.println("the tomato class is called");
    }
    public String toString(){
        return colour;
    }
}
public class a12 {
    public static void main(String[] args){
        Poatato p1 = new Poatato();
        p1.toString();
        Tomato t1 = new Tomato();
        t1.toString();
        Brinjal b1 = new Brinjal();
        b1.toString();
    }
}

