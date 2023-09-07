/* A simple abstract class example */

abstract class Base {
    abstract void fun ();
}

class Derived extends Base {
    void fun () {
        System.out.println("Derived fun() is called");
    }
}

public class prac7 {
    public static void main (String args[]) {
        /*Uncommenting the following will cause compiler error as the
         * line tries to create an instance of abstract class.*/
        // base b = new base();

        // We can have references of Base type.
        Base b = new Derived();
        b.fun();
    }
}
