class th{
    int a=12;
    static double b = 90.0;
    static int c  = 20;
    
    public th(int a, double b){
        this.a=a;
        this.b=b;

        // only warning is coming when static var is ussed in this keyword//
    }
    static int add(){
        return a+c;
    }
}
public  class thise{
    public static void main(String[] args){
        th var = new th(23,9.2);
        System.out.println("the ans in add method " +th.add());
        System.out.println("the value in this:  "+ var.a);
        System.out.println("the value in this:  "+ th.b);

    }
}

