class Abstract {
    Abstract () {
        this(5);
        System.out.println ("Hello A");
    }
    Abstract (int a) {
        System.out.println (a);
    }
}

public class prac9a {
    public static void main  (String args[]) {
        Abstract hello = new Abstract();
    }    
}
