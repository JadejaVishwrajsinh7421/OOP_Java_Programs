// Create interface EventListener with performEvent() method. Create MouseListener 
// interface which inherits EventListener along with mouseClicked(), mousePressed(), 
// mouseReleased(), mouseMoved(), mouseDragged() methods. Also create KeyListener 
// interface which inherits EventListener along with keyPressed(), keyReleased() methods. 
// WAP to create EventDemo class which implements MouseListener and KeyListener and 
// demonstrate all the methods of the interfaces

interface EventListener{
   void  performEvent();
}

interface MouseListener extends EventListener{
   void  mouseClicked();
   void  mousePressed();
   void mouseMoved();
   void mouseDragged();
   void  mouseReleased();
}

interface KeyListener extends EventListener{
    void keyPressed();
    void keyReleased();
}
// if u donot want pass the methods of all above interface u can make class eventdemo as abstract class.
class EventDemo implements MouseListener,KeyListener{
    public void  performEvent(){
        System.out.println("perform event is called in base class");
    }
    public void  mouseClicked(){
        System.out.println("mouseclicked event is called in base class");
    }
    public void  mousePressed(){
        System.out.println("mousepressed event is called in base class");
    }
    public void mouseMoved(){
        System.out.println("mousemoved event is called in base class");

    }
    public void mouseDragged(){
        System.out.println("mouseDragged event is called in base class");

    }
    public void  mouseReleased(){
        System.out.println("mouseReleased event is called in base class");

    }
    public void keyPressed(){
        System.out.println("keyPressed event is called in base class");

    }
    public void keyReleased(){
        System.out.println("mouseReleased event is called in base class");

    }

}
public class a1 {
    public static void main(String[] args){
        EventDemo obj1 = new EventDemo();

        obj1.performEvent();
        obj1.mouseClicked();
        obj1.mousePressed();
        obj1.mouseMoved();
        obj1.mouseDragged();
        obj1.mouseReleased();
        obj1.keyPressed();
        obj1.keyReleased();
    }
}
