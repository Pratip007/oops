//Create an abstract class Bird with an abstract method speak(). Implement subclasses Sparrow and Parrot with their specific speak() methods


public class Main {
  public static void main(String[]args){
        Parrot p1 = new Parrot();
        p1.speak();

        Sparrow s1 = new Sparrow();
        s1.speak();
  }  
}

abstract class Bird{
   abstract  void speak();
}

class Sparrow extends  Bird{
    void speak(){
        System.out.println("Sparrow is speaking");
    }
}

class Parrot extends Bird{
     void speak(){
        System.out.println("Parrot is speaking");
    }
}
