/*Run the following program without 
 * exception handling mechanism
 */

public class prac3 {
    static int anyFunction (int x, int  y) {
        int a = x/y;
        return a;
    }

    public static void main(String[] args) {
        int a, b, result;
        a = 0;
        b = 0;
        System.out.println("Enter any two integers: ");

        a = Integer.parseInt (args[0]);
        b = Integer.parseInt(args[1]);

        result  = anyFunction(a, b);
        System.out.println("Result : " + result);
    }
}
/* Run this program with the following steps
 * java prac3 200 10
 * java prac3 10 0
 */
