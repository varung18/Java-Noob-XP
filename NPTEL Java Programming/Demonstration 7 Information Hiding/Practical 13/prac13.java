/*Another example of access modifier with public, private and protected */

class BaseClass {
    public int x = 10;
    private int y = 10;
    protected int z = 10;
    int a = 10; // implicit default access modifier


    public int getX() {
        return x;
    }

    public void setX (int x) {
        this.x = x;
    }

    private int getY () {
        return y;
    }

    private void setY (int y) {
        this.y = y;
    }

    protected int getZ () {
        return z;
    }

    protected void setZ (int z) {
        this.z = z;
    }

    int getA () {
        return a;
    }

    void setA (int a) {
        this.a = a;
    }
}

public class prac13 extends BaseClass {
    public static void main(String[] args) {
        BaseClass rr = new BaseClass();
        rr.z = 0;
        prac13 subClassObj = new prac13();

        // Access Modifiers : Public
        System.out.println("Value of x is : " + subClassObj.x);
        subClassObj.setX(16);
        System.out.println("Value of x is : " + subClassObj.x);

        // Access Modifiers: Private
        /*If we remove the comments it would result in a compilation
         * error as the fields and methids being access are private.
         */

        // System.out.println("Value of Y is: " + subClassObj.y);
        // subClassObj.setY (18);
        // System.out.println("Value of Y is: " + subClassObj.y);

        // Access Modifiers: Protected
        System.out.println("Value of z is : " + subClassObj.z);
        subClassObj.setZ(19);
        System.out.println("Value of z is : " + subClassObj.z);

        // Access Modifiers: Default
        System.out.println("Value of a is : " + subClassObj.a);
        subClassObj.setA(11);
        System.out.println("Value of a is : " + subClassObj.a);

    }
}