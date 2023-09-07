/* Practical 9: for protected access modifier */

class A {
    protected int busno = 20;
    protected void msg() {
        System.out.println ("Class A: Hello Java!" + busno);
    } }


public class prac9 {
    public static void main (String args[]) {
        A obj = new A(); 
        obj.msg();
        // obj.busno; // throws an error, cannot find symbol A
        System.out.println ("Class A: Hello Java!" + obj.busno);
    }
}