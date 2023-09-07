/*Run the following program without exception
 * handling mechanism for the same input
 */
// Case: try with multiple catch block

public class prac7 {
    public static void main(String[] args) {
        try {
            int i = args.length; //No of arguments in the command line
            String myString[] = new String[i];
            // if i = 0 then myString null pointer error
            if (args[0].equals(("Java")) ) { // #1
                System.out.println("First word is Java");
            }
            System.out.println("Number of arguments = " + i);
            int x = 12 / i; //#2
            int y[] = { 555 , 947}; // y is an array of size 2 with index 0, 1
            y[i] = x; // #3 // Index is out-of-range may occur if i >1
        } catch (ArithmeticException e) { // To catch the error at #2
            System.out.println(" Div by 0 : " + e);
        }
        catch (NullPointerException e) { // To catch the error at #1
            System.out.println("A null pointer exception : " + e);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            //To catch the error at #3
            System.out.println("Array Index OOB : " + e);
        }
        
        
    }
}
/*Note:
Run this program with the following steps
 * java prac6
 * java prac6 Java
 * java prac6 I Love Java
 * java prac6 10 20 30 40
 */
