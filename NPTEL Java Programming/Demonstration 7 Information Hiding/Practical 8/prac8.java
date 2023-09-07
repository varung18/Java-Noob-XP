/* Example 8 for private access modifier with private constructor */

class A {
    /*private*/ public A() {
        // private constructor
        //If it is a private constructor, no object from this can be accessed from any
        //other class
    }
    void msg() {
        System.out.println ("Class A: Hello Java!");
    } }


public class prac8 {
    public static void main (String args[]) {
        A obj = new A(); // Compile time error
    }
}