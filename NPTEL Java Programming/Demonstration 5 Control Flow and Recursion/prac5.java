/*Loop exaample with break */

public class prac5 {
    public static void main (String args[]) {
        for (int i = 1; ; i++ ){
            if (i%10 == 0) break;
            System.out.println ("i : " + i);
        }
        System.out.println("Loop Complete");
    }
}
