/* An interface method cannot be made final */

interface I1 {
    public static int i = 627;
    public /*final static*/ void printInterface(); //ERROR
}

//The following code is invalid!
class prac6 implements I1 {
    public static int j = 164;
    public void printInterface() {
        System.out.print("Geek!");
    }
}