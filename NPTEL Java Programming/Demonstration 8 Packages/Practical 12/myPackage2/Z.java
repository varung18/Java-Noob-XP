package myPackage2;
import myPackage1.*;

public class Z extends myPackage1.X {
    public Z () {
        System.out.println("I am the constructor from Class z: ");
        // System.out.println("n from z= "  + n);
        //Default is not accessible outside its package
        // System.out.println("p from z= "  + p); //Error: private of X
        System.out.println("r from z= "  + r);

    }
}
