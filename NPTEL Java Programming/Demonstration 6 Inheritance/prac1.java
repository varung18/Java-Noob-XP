/*A simple example of inheritance */

// Create a super class
class A {
    int i, j;

    void showij () {
        System.out.println("i and j: " + i + "  " + j);
    }
}

// Create a subclass by extending the class A.
class B extends A {
    int k;

    void showk () {
        System.out.println("k:   " + k);
    }

    void sum () {
        System.out.println ("i+ j+ k: " + ( i+ j+ k));
    }
}

class prac1 {
    public static void main (String args[]) {
        A superOb = new A();
        B subOb = new B();

        // The super class may be used by itself.
        superOb.i = 10;
        superOb.j = 20;
        System.out.println("Contents of superOb: ");
        superOb.showij();
        System.out.println();

        /*The subclass has access to all public members from its super class */
        subOb.i = 12;
        subOb.j = 97;
        subOb.k = 38;
        System.out.println("Contents of subOb: ");
        subOb.showij();
        subOb.showk();
        System.out.println();
        System.out.println("Sum of i, j, and k in subOb: ");
        subOb.sum();

    }
}