/*A variable declared inside pair of brackets are in a method has scope withing the brackets only. */

public class prac8 {
    public static void main (String args[]) {
        {// The variable x has a scope within
        // brackets
        int x = 10;
        System.out.println (x); }
    }

    //Uncommenting below line would produce
    // error since variable x is out of scope.

    //System.out.println (x);
}
