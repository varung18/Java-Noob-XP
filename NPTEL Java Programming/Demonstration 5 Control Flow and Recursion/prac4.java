// Loop example with continue

public class prac4 {
    public static void main (String args[]) {
        for (int i = 0; i<10; i++ ){
            System.out.println(i + "  ");
            if (i%2 == 0) continue;
            System.out.println ("  ");
        }
    }
}
