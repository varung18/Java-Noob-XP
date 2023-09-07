// An abstract class with a final method 

abstract class Base {
    final void fun() { System.out.println("Final fun() is called");}
}

class Derived extends Base {}

public class prac10 {
    public static void main (String args[]) {
        Base b = new Derived();
        b.fun();
    }
}
