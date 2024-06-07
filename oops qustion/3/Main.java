// Create a class BankAcc with private attributes balance. Implement methods of deposit and withdraw to update the balance.

import java.util.Scanner;

class BankAcc{
     

    void diposit(){
        System.out.println("add balance");
        Scanner sc = new Scanner(System.in);
        int bal = sc.nextInt();
        if(bal>=0)
        System.out.println(bal);
    }

    void withdraw(){

    }


}



public class Main {
    public static void main(String []args){



    }
}


