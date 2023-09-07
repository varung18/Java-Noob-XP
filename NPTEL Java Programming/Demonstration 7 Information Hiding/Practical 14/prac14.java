/*Example of method overriding */

class A {
    public void msg1 () {
        System.out.println("Class A: Public");
    }

    private void msg2 () {
        System.out.println("Class A: Private");
    }

    protected void msg3 () {
        System.out.println("Class A: Protected");
    }
}

public class prac14 extends A {
    void msg () {
        System.out.println("Class Main: Welcome");
    }
    public void msg1 () { //  If modifier is set to default, it cannot override
        System.out.println("Overriding Public Method");
    }

    void msg2 () {
        System.out.println("Overriding Private Method");
    }
    // If modifier is set to private then ot can be overidden.

    public void msg3 () {
        System.out.println("Overriding protected method");
    }
    public static void main(String[] args) {
        prac14 obj = new prac14();
        obj.msg();
        // obj.msg1();
        // obj.msg2();
        // obj.msg3();
    }
}