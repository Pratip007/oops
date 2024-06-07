import encapsulation.Encapsulation;
import abstraction.Abstract;

public class Main {
    public static void main (String[]args){
        System.out.println("Hello Worls");


    Persion p1 =new Persion(); // defult constructor
    Persion p2 =new Persion(14, "Anuj Kumar");
    Devloper d1 = new Devloper(22, "Rahul");
    Encapsulation obj = new Encapsulation();
    
   
    
    p1.age =42;
    p1.name ="Ptatip";
   
        System.out.println(p1.age+" "+p1.name);
        System.out.println(p2.name );
        p1.walk();
        p2.eat();
        p2.walk(2);
        
        d1.walk();
        d1.walk(10);
        obj.doWork();
        
        
         

        
    }
}

class Persion{
   protected String name; // only access childe class
    int age;
    static int count;

    public Persion(){
        System.out.println("creating an object");
        count ++;
    }


// public Persion(int newAge , String newName){
//     age = newAge;
//     name= newName;

// }
    Persion ( int age , String name){
        this();
        this.age=age;
        this.name=name;
    }


    void walk(){
        System.out.println(name +" is walking");
    }
    void eat (){
        System.out.println(name +" is eating");
    }
    void walk(int steps){
        System.out.println(name + " walked "+ steps+ " steps");
    } 
}

class Devloper extends Persion{
    public Devloper(int age , String name ){
        super(age, name);
    }
}
