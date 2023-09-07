/*Run the following program without exception
 * handling mechanism
 */
// Case: try with multiple catch block

class prac6 {
    public static void main(String[] args) {
        int i = args.length; //No of arguments in the 
        String myString[] = new String[i];
        myString[0] = args [0];
        if (args[0].equals(("Java")) ) {
            System.out.println("First word is Java");
        }
        System.out.println("Number of arguments = " + i);
        int x = 12 / i;
        int y[] = { 555 , 947};
        y[i] = x;
    }
}
/*Note:
Run this program with the following steps
 * java prac6
 * java prac6 Java
 * java prac6 I Love Java
 * java prac6 10 20 30 40
 */
