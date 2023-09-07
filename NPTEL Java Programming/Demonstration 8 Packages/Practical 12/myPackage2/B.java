package myPackage2;
import myPackage1.*;

public class B {
    public B () {
        myPackage1.X x = new myPackage1.X();
        // create an object of class X
        System.out.println("I am the constructor from Class B: ");
        // System.out.println("n from z= "  + n);
        //Default is not accessible outside its package
        // System.out.println("p from z= "  + p); //Error: private of X
        System.out.println("r from z= "  + r);

    }
}
