package abstraction;

public class Abstract {
    
public static void main( String []args){

    audi a1 =new audi();
    a1.price= 4000000;
    a1.start();
    System.out.println(a1.price);
    
}

}

abstract class car{

   int price;

   abstract void start();

}

class audi extends car{

    @Override
    void start() {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'start'");
        System.out.println("bnw is started");
    }
     
}

class bmw extends car{

    @Override
    void start() {
        // TODO Auto-generated method stub
      //  throw new UnsupportedOperationException("Unimplemented method 'start'");

        System.out.println("audi started");
    }

}
