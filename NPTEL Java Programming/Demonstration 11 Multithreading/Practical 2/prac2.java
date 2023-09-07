/*Creating three threads using the Runnable interface
 * and then running them concurrently
 */

class ThreadX implements Runnable {
    public void run () { // overriding the run method
        for (int i = 1; i<=5; i++) {
            System.out.println("Thread X with i = " + -1*i);
        }
        System.out.println("Exiting Thread X");
    }
}

class ThreadY implements Runnable {
    public void run () {
        for (int j = 1; j<=5; j++) {
            System.out.println("Thread Y with i = " + -1*j);
        }
        System.out.println("Exiting Thread Y");
    }
}

class ThreadZ implements Runnable {
    public void run () {
        for (int k = 1; k<=5; k++) {
            System.out.println("Thread Z with i = " + -1*k);
        }
        System.out.println("Exiting Thread Z");
    }
}

class prac2 {
    public static void main(String[] args) {
        ThreadX x = new ThreadX();
        Thread t1 = new Thread(x);

        ThreadY y = new ThreadY();
        Thread t2 = new Thread(y);

        // ThreadZ z = new ThreadZ();
        // Thread t3 = new Thread(z);
        Thread t3 = new Thread(new ThreadZ());

        t1.start();
        t2.start();
        t3.start();

        System.out.println(".... Multithreading is over.");
        // Only the difference for this and previous prac1 is that 
        // This practical is based on Runnable implementation.
    }
}