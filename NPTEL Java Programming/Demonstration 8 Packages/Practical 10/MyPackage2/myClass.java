/* Can the same class name but in two different packages and 
 * the classes are then referenced.
 */


 package MyPackage2; //Creating a package named MyPackage1

 public class myClass {
         public void msg2 () {
             System.out.println("Class from Package 2: Hello!");
         }
     }