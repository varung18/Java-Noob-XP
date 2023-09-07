//We have learnt that a class MUST implements an interface
/*and then that class will be used a normal class. However,
 * the reverse is not true. That
 */

 /* OR
  * The following code that an interface implements
  a class is also invalid!
  */
  // The following code is invalid!

abstract class C {
    public static int j = 102;
    void print () {
        System.out.print("Geek!");
    }
}

interface I2 implements C {
    public static int j = 2012;
    void print () [
        System.out.println("Geek2!");
    ]
}