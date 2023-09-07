/* Example 6 for private access modifier */

class A {
    private int data = 13;
    public void msg() {
        System.out.println ("Class A: Hello Java!");
    } }


public class prac6 {
    public static void main (String args[]) {
        A obj = new A(); // OK: Class A is public
        // System.out.println(obj.data); // Compile time error, data is private
        obj.msg(); // OK: msg is public
    }
}