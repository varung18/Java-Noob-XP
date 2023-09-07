// Exmaple of recursion, Practice 1, Looping Construct

public class prac16 {
    static void myMethod (int counter) {
        if (counter == 0) {
            return;
        } else {
            System.out.println("Hello" + counter);
            myMethod(--counter);
            System.out.println(counter);
            return;
        }
    }

    public static void main (String args[]) {
        myMethod(10);
    }
}
