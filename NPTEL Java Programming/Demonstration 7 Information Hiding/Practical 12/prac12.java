/*Simple example of access modifier. In a class hieracrchy, 
 * private members remain private to their class.
 * This program contains an error and will not complete.
 */

 // Create a superclass

class A {
    int i; // public by default
    protected /*private*/ int j; // private to A

    void setij (int x, int y) {
        i = x;
        j = y;
    }
}

//A's j is not accessible here as follows, since j is private
class B extends A {
    int total;
    void sum () {
        total = i +j; // J is not accessible here
    }
}

class prac12 {
    public static void main(String[] args) {
        B subOB = new B();
        subOB setij (10, 12);
    }
}