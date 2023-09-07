/*
Write a generic method that returns the minimum elements
in a two dimensional array.
*/
import java.lang.IllegalArgumentException;

public class prac6c {
    public static <T extends Comparable<T>> T findminimum(T[][] arr) throws IllegalArgumentException {
        if (arr == null || arr.length == 0 || arr[0].length == 0) {
            throw new IllegalArgumentException("Invalid array");
        }
        T minimum = arr[0][0];
        for (T[] ts : arr) {
            for (T ts2 : ts) {
                if (ts2.compareTo(minimum) < 0) {
                    minimum = ts2;
                }
            }
        }

        return minimum;
    }

    public static void main(String[] args) {
        System.out.println("Varun Gaur, 210410107077, 21BECEG102, SY CE2B/ 2022-23");
        Integer[][] arr = { { 1, 5, -7 }, { 3, 4, 6 }, { 1, 3, 5 } };

        String[][] arr2 = { { "rahul", "keval" }, { "zhuh" } };

        System.out.println(findminimum(arr));
        System.out.println(findminimum(arr2));
    }
}