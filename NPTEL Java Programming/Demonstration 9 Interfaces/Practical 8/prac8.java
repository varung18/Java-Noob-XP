/* An interface us a significant feature in Java in the sense that
 * Case 1: Example of class which "implements" two interfaces
 */

 interface I1 {
    int i = 123;
    void printI1();
 }

 interface I2 {
    public static int j = 573;
    void printI2 ();
 }

class A implements I1, I2 {
    public int aValue = 917;
    public void printI1 () {
        System.out.println("I am from I1 " + i);
    }

    public void printI2 () {
        System.out.println("I am from I2 " + i);
    }

    public void printA () {
        System.out.println("I am from A " + (aValue  = i+j));
    }
}

class prac8 {
    public static void main(String[] args) {
        A a = new A();
        a.printA();
        a.printI2();
        a.printI1();
    }
}