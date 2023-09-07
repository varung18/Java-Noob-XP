//Example 3: Java Program to illustrate protected manner

class A {
    protected void display (){
        System.out.println("NPTEL");
    }
}

// Class Prac11 is subclass of A
class prac11 extends A {
    public static void main(String[] args) {
        A obj = new A();
        obj.display();
    }
}