/* We have learnt that a class MUST implements an
 * interface and then that class will be used as a normal
 * class. However, the revserse is not true.
 * That, is an interface cannot implement another interface.
 */

 interface I1{
    public static int i = 619;
    void printInterface() ;
 }

 // The following code is invalid!
class I2 implements I1 {
    public static int j;
    public void printInterface () {
        System.out.print("Geek!");
    }
} k