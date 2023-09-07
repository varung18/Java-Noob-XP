/*Example on the multiple inheritance with interface
 * Case 2: Example of "extends" with "implements"
 */

class A {
    protected int j = 1973;
    void print () {
        System.out.println("I am from A " + j);
    }
}

interface I {
    public static int i = 123;
    void printInterface();
 }

class B extends A implements I {
    public int aValue = 917;
    public void printInterface () {
        System.out.println("I am from I " + i);
    }

    public void printB () {
        super.print();
        printInterface();
    }
}

class prac9 {
    public static void main(String[] args) {
        B a = new B();
        a.printB();
    }
}