
//Create a class Student that inherits from Person with an additional attribute roll_number. Create a student object and print their details.

class persion{
int age;
String name;
    persion(int a, String n){
        age = a;
        name=n;
    }
    

    void read(){
        System.out.println("is reading");
    }
}

class student extends persion{
    int roll;
 student( int a, String n, int r){
    super(a, n);
    roll =r ;
 }

 void print( ){

    System.out.println(age+ " "+ name+" "+roll);
 }
}


public class Main{
  
 public static void main(String[]args){
     persion p1 = new persion(18,"pratip");
    p1.age=15;
    p1.read();;

    

    student s1 = new student(18, "pratip", 1147);
    s1.print();

 }
    
}
