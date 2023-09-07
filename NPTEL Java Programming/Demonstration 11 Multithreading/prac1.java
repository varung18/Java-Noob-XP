/*Creating threee threads using the class thread and then
 * running them concurrently
 */

class ThreadA extends Thread {
    public void run () {
        for (int i =1; i<=5; i++) {
            System.out.println("From thread A with i = " + -1*i);
        }
        System.out.println("Exiting from Thread A...");
    }
}

class ThreadB extends Thread {
    public void run () {
        for (int j =1; j<=5; j++) {
            System.out.println("From thread B with i = " + 2*j);
        }
        System.out.println("Exiting from Thread B...");
    }
}

class ThreadC extends Thread {
    public void run () {
        for (int k =1; k<=5; k++) {
            System.out.println("From thread C with i = " + (2*k-1));
        }
        System.out.println("Exiting from Thread C...");
    }
}

public class prac1 {
    public static void main(String[] args) {
        ThreadA a = new ThreadA();
        ThreadB b = new ThreadB();
        ThreadC c =  new ThreadC();
        a.start();
        b.start();
        c.start();
        System.out.println(".... Multithreading is over"); // we are not sure
        // in which order is to be executed, because scheduler will
        // take all the threads and depending
    }
}