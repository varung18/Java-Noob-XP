/* Example 6 for private access modifier */

class A {
    private int data = 22;
    public void msg() {
        System.out.println ("Class A: Hello Java!");
    } }


public class prac7 {
    public static void main (String args[]) {
        // private int data2 = 94; throws an error: Illegal start of expression
        // public int data2 = 59; throws an error: Illegal start of expression
        int data2 = 26;
        // lesson from above'
        // if we declare a member and wanted to access private from other class
        // declare it in default
        // no any other access modifiers are allowed to access the same

        A obj = new A(); // OK: Class A is public
        System.out.println("Class B: " + data2); // OK: private data in the same class
        obj.msg(); // Note: Private data is accessible through public method
    }
}