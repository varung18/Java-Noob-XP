/*Example of super to overcome name hiding */

class A {
    int i;
}

// Create a subclass by extending the class A.
class B extends A {
    int i; // this i hides the i in A  

    B (int a, int b) {
        super.i = a; // i in A
        i = b; // i in B
    }

    void show () {
        System.out.println("i in superclass: "+ super.i);
        System.out.println ("i in subclass: " + i);
    }
}

class prac4 {
    public static void main (String args[]) {   
        B subOB = new B(1, 2);
        subOB.show();
    }
}