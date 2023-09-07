/* Showing compile time errors in a program */

Class error {
    Public static void main (string args []) {
        system.out.println ("Can you find errors in me?");
    }
}

class AnotherError {
    public void insert () {
        System.out.println("To insert a text");
    }

    abstract void delete () {
        System.out.println("To delete a text");
    }
}
/* Note
 * A class file can be compile successfully,
 * if it is syntactically correct
 * evern there is no main class, that is,
 * with main method.
 */