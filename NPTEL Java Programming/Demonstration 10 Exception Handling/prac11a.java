/*Neccessarily of nested try-catch example */

class prac11a {
    public static void main(String[] args) {
        try {
            // To catch divide by zero
            // TODO: handle exception
            int a = args.length;
            int b = 42/a; //divide-by-zero exception
            System.out.println("a = " +a);
            if (a==1) {
                a = a/(a-1);  //another divide-by-zero expression
        }
            try {
                // nested try block
                if (a==2) { 
                    //if two command line arga re used, then an out-of-bounds exception appear
                    int c[] = {1 };
                    c[2] = 99; //out-of-bound exception, if two arguments
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Array Index out-of-bounds: " +e);
            }
        } catch (ArithmeticException e) {
        System.out.println("Divide by 0: "+ e);
    }
}
}

//Note: Run the program with the following output
/*java prac11 1 2 3
 * java prac11 1 2
 * java prac11 1
 */
 