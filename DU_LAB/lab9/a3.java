// Write a Java program to create an interface Playable with a method play() that takes no 
// arguments and returns void. Create three classes Football, Volleyball, and Basketball 
// that implement the Playable interface and override the play() method to play the 
// respective sports

interface Playable{
    void play();
}

class Football implements Playable{
    public void play(){
        System.out.println("the area method called in Football class");
    }
}

class Volleyball implements Playable{
    public void play(){
        System.out.println("the area method called in Volleyball class");
    }
}

class Basketball implements Playable{
    public void play(){
        System.out.println("the area method called in Basketball class");
    }
}
public class a3 {
    public static void main(String [] args){
        Playable obj1 = new Football();
        obj1.play();
        Playable obj2 = new Volleyball();
        obj2.play();
        Playable obj3 = new Basketball();
        obj3.play();

    }
}
