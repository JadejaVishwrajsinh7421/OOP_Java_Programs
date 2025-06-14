class member{
    String name;
    int age;
    int phone;
    String address;
    int salary;

    member(String name,int age,int phone,String address,int salary){
        this.name=name;
        this.age=age;
        this.phone=phone;
        this.address=address;
        this.salary=salary;
    }
        
    void printSalary(){
    }
}

class employee extends member{
    String specialization;
    String department;

    employee(String name,int age,int phone,String address,int salary,String specialization,String department){
        super(name,age,phone,address,salary);
        this.specialization=specialization;
        this.department=department;
    }
}
class manager extends member{
    String specialization;
    String department;
    manager(String name,int age,int phone,String address,int salary,String specialization,String department){
        super(name,age,phone,address,salary);
        this.specialization=specialization;
        this.department=department;
    }
}

public class b3 {
    public static void main(String[]args){

    }
}