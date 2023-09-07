public class prac2 {
    public static void main (String args[]) {
        int x = 100;
        System.out.printf("Printing the simple integer x = %d\n", x);
        // Its almost as similar as the C Language syntax, so no need to explain.

        System.out.printf("Formatted with precision: PI = %.2f\n", Math.PI);
        // If we want to specify the precision, so we have to enter the value like this. Math.PI
        // is a constant value imported from java.lang which is nothing but the pi value of circle.
        // .2f means the value will be printed upto precision of 2 values before the decimal point.

        float n = 5.2f;
        System.out.printf("Formatted to specific width n: %.4f\n", n);
        // automatically appends zero to the rightmost part of decimal

        n = 2324435.3f;
        // here number is formatatted from right margin and occupies a width of 20 characters
        System.out.printf("Formatted to right margin  n: %20.4f\n", n);
    }
}
