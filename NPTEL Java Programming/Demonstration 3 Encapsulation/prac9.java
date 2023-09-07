class Abstract {
    void m () {
        System.out.println ("Hello World!");
    }
    void n () {
        System.out.println ("Hello World");
        this.m();
    }
}

public class prac9 {
    public static void main  (String args[]) {
        Abstract hello = new Abstract();
        hello.n();
    }    
}
