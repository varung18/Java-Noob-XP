public class prac2a {
    public static void main (String args[]) {
        int x = 100;
        System.out.printf("Printing the simple integer x = %d\n", x);
        // Its almost as similar as the C Language syntax, so no need to explain.

        System.out.printf("Formatted with precision: PI = %.2f\n", Math.PI);
        // If we want to specify the precision, so we have to enter the value like this. Math.PI
        // is a constant value imported from java.lang which is nothing but the pi value of circle.
        // .2f means the value will be printed upto precision of 2 values before the decimal point.

        float n = 5.2f;
        System.out.printf("Formatted to specific width n: %2.1f\n", n);
        // automatically appends zero to the rightmost part of decimal

        n = 2324435.3f;
        // here number is formatatted from right margin and occupies a width of 20 characters
        System.out.printf("Formatted to right margin  n: %6.2f\n", n);

        /*Look at the last statement, after the decimal point, there are 7 digit numbers, and we had allowed
        6 digits only, and if we run this program, the decimal digits are not truncated. But it is also noticing
        that the value before the decimal point 0.3 is casted t0 0.25.

        Whenever we use printf, formatting matters alot. So we have to be cautious while using the printf function
        Sometimes, it may get correct, sometimes its not. And if we use print or println, then formatting is not
        possible. It makes more simpler than printf().

        Hence, the println or print function is used in common practices or conventionally.
         */

    }
}
