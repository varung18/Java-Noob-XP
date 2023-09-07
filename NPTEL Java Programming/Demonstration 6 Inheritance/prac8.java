// An abstract class with constructor

abstract class Base {
    Base () { System.out.println("Base Constructor is called");}
    abstract void fun ();
}

class Derived extends Base {
    Derived() {
        super();
        System.out.println("Derived constructor is called");
    }

    void fun () {
        System.out.println("Derived fun () is called");
    }
}

public class prac8 {
    public static void main (String args[]) {
        Derived d = new Derived();
        d.fun();
    }
}
