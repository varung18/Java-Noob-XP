/*Neccessarily of nested try-catch example */

class prac11 {
    public static void main(String[] args) {
        int a = args.length;
        int b = 42/a; //divide-by-zero exception
        System.out.println("a = " +a);
        if (a==1) {
            a = a/(a-1); //Another divide-by-zero exception
        }
        if (a==2) {
            int c[] = {1 };
            c[2] = 99; //out-of-bound exception, if two arguments
        }
    }
}

//Note: Run the program with the following output
/*java prac11 1 2 3
 * java prac11 1 2
 * java prac11 1
 */
 