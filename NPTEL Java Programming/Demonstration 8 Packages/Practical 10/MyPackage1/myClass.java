/* Can the same class name but in two different packages and 
 * the classes are then referenced.
 */


package MyPackage1; //Creating a package named MyPackage1

public class myClass {
        public void msg1 () {
            System.out.println("Class from Package 1: Hello!");
        }
    }