/*Run the following program without 
 * exception handling mechanism
 */

 public class prac4 {
    static int anyFunction (int x, int  y) {
        try  {int a = x/y;
        return a; }
        catch (ArithmeticException e) {
            System.out.println("Division by zero ");
        }
        return 0;
    }

    public static void main(String[] args) {
        int a, b, result;
        a = 0;
        b = 0;
        System.out.println("Enter any two integers: ");

        try {
        a = Integer.parseInt (args[0]);
        b = Integer.parseInt(args[1]);
        System.out.println("Value of a and b = " +a + "    " + b); }

        catch (Exception e) {}
        result  = anyFunction(a, b);
        System.out.println("\nResult : " + result); }
    }
/* Run this program with the following steps
 * java prac3 200 10
 * java prac3 10 0
 */
