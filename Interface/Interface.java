package  Interface;



public class Interface implements car, Persion{
    public static void main(String []args){
Transformer t1 = new Transformer();
        t1.start();
        t1.walk();

    }

    @Override
    public void start() {
        // TODO Auto-generated method stub
       // throw new UnsupportedOperationException("Unimplemented method 'start'");
       System.out.println("car is starting");
    }

    @Override
    public void walk() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'walk'");
    }
}

interface car{
    void start();
}

interface Persion{
    void walk();
}

class Transformer{
    void start(){
        System.out.println("car is starting");
    }

    void walk(){
        System.out.println("persion is walking");
    }
}