interface I1 {

    public static final double PI = 3.1413423567; // OK
    static final double lambda = 0.04; // OK: public is implicit

    // int x; //Declaration of any instance vairable is NOT allowed.
    int x = 100; // INitialization of vairable is neccessary.

    // private static final int p = 497;
     // ERROR: private/ protected is not allowed.

     //abstract public static void method11(); //Static method is not allowed

     void methodI2(); //public abstract by default
}

class A1 implements I1 {
    public int a1 = 734;
    public void method11() {
        System.out.println("From I1" + PI);
    }
    public void methodI2 () {
        System.out.println("Again from I1 " + lambda);
    }
}

// Here, is the main class

public class prac3 {
    public static void main(String[] args) {
        A1 a = new A1();
        a.method11();
        a.methodI2();
    }
}