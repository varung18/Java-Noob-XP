// Example of default access modifier

class A {
    void msg () { System.out.println ("Hi! I am in Class A");}
}

class prac1 {
    public static void main (String args[]){
        A obj = new A();
        obj.msg();
    }
}