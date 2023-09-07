/* Practical 10: for protected access modifier */

class A {
    protected int busno = 20;
    public void msg() {
        System.out.println ("Class A: Hello Java!" + busno);
    } }


class prac10 extends A {
    public static void main (String args[]) {
        A obj = new A(); 
        obj.msg();
        obj.busno(); // throws an error, cannot find symbol A
    }
}