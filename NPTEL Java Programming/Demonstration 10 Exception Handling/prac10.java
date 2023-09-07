/* Use of throws clause in exception handling */

import java.lang.*;

public class prac10 {
    public static void main(String[] args) {
        int [] array = new int[3];
        try {
            for (int i = 0; i < 4; ++i) {
                array [i ] = i;
            }
            System.out.println(array);
        } catch (Exception e) {
            System.out.println("fillin: " + e.fillInStackTrace());
            System.out.println("cause: " + e.getCause());
            System.out.println("local: " + e.getLocalizedMessage());
            System.out.println("messa: " + e.getMessage());
            System.out.println("trace: " + e.getStackTrace());
            System.out.println();
            System.out.println();
            System.out.println("trace: "); e.printStackTrace();
            System.out.println();
            System.out.println("string: "); e.toString();
            System.out.println();
            System.out.println();
            //printed just to inform that we have entered the catch block
            System.out.println("Oops, we went too far, better go back to 0!");
            throw (Exception) new Exception().initCause(e);
        }
        finally {
            System.out.println(array);
            //method call to continue program
        }
    }
}
