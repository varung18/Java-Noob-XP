//Test for primes

public class prac6 {
    public static void main (String args[]) {
        int num;
        boolean isPrime = true;
        num = Integer.parseInt (args[0]);
        for (int i = 2; i<=num/2; i++) {
            if (num%i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println("Congrats! Your number is a prime!");
        }
        else {
            System.out.println("Given number is not prime, better luck next time!");
        }
    }
}
