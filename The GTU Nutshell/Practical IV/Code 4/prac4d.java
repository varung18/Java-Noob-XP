/*
 * Write the bin2Dec (string binary String) method to convert a
binary string into a decimal number.
Implement the bin2Dec method to throw a
NumberFormatException if the string is not a binary string. 
 */

import java.util.Scanner;;

public class prac4d {
    public static void main(String[] args) {
        System.out.println("Varun Gaur, 210410107077, 21BECEG102, SY CE2B, 2022-23");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int value = bin2Dec(input);
        System.out.println(value);
        sc.close();
    }

    public static int bin2Dec(String input) throws NumberFormatException {
        int pow = 0;
        int value = 0;
        for (int i = input.length() - 1; i > -1; i--) {
            if (input.charAt(i) == '1') {
                value = value + ((int) Math.pow(2, pow));
            } else if (input.charAt(i) == '0') {

            } else {
                throw new NumberFormatException("Not a binary String");
            }
            pow++;
        }
        return value;
    }
}