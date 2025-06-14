class obj{
    static int a =0;
    public obj(){
        a++;
    }
}
public class st {
    public static  void main(String[] args){
        obj var = new obj();
        System.out.println("the total num of counting in object");
        System.out.println("value of a" +obj.a);
    }
}
