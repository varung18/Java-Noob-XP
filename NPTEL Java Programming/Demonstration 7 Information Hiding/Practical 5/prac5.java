/* Example 5 of public access modifier */

/*public */class A {
    public int data = 13;
    public void msg() {
        System.out.println ("Class A: Hello Java!");
    } //This class is not accessible to any file which belongs to other directories
}

/*If we applied public before to class A, then it throws an error: A is public, should be declared in file named A.java*/

public class prac5 {
    public static void main (String args[]) {
        A obj = new A(); // OK: Class A is public
        System.out.println(obj.data); // OK: data is public
        obj.msg(); // OK: msg is public
    }
}