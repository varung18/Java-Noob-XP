//Save this as A.java in MyPackage1 directory

package myPackage1;
import myPackage1.*;

public class A {   //class with default protection
    public A() {   // default constructor with default access
        X x = new X();    // create an object of class X
        System.out.println("Same package constructor......");
        System.out.println("n from A" + x.n);

        //Default variable is accessible in the same package
        // System.out.println("p from A" + x.q);

        System.out.println("q from A " + x.q);
        System.out.println("r from A " + x.r);
    }
}
