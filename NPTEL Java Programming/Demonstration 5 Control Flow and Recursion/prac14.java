// Fibonacci Sequences

public class prac14 {
    int n;
    int fibbonacci (int n) {
        if (n == 0) {
            return 0;
        }
        else if (n == 1)
                    return 1;
        else
            return (fibbonacci(n-1) + fibbonacci(n-2));
    }
    public static void main (String args[]) {
        prac14 x = new prac14();
        x.n = Integer.parseInt(args[0]);
        for (int i = 0; i <= x.n; i++) {
            System.out.println(x.fibbonacci(i));
        }
    }
}
