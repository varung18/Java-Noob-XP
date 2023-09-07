// Defining package MyPackage1

package myPackage1;

public class Y extends X {
    // A constructor of the class protection
    public Y () {
        System.out.println("I am the constructor from Class X: ");
        System.out.println("n = "  + n);
        // System.out.println("p = "  + p); //P is private
        //member of X, not accessible outside X
        System.out.println("q = "  + q);
        System.out.println("r = "  + r);

    }
}