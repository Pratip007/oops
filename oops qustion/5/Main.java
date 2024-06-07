//Create a class Shape with a method area() that returns the area of the shape. Implement subclasses Triangle and Square with their specific area() methods.




public class Main {

    public static void main(String[] args){
        Square s1= new Square();
        s1.area(40);
        Triangle t1 = new Triangle();
        t1.area(70, 50);

    }

   
}

interface Shape{
    // Scanner sc = new Scanner(System.in);
    // double r = sc.nextDouble();
    void area();
}

class Square implements Shape {
    void area(int r){  
         System.out.println("Area of Square is : " + (r*r));
    }

    @Override
    public void area() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'area'");
    }
}

class Triangle implements Shape{
    void area(int b , int h) {
        int a = h*b;
        System.out.println("Area of Triangle is "+(a/2));
        
    }

    @Override
    public void area() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'area'");
    }
}

