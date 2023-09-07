/*Use of yield(), stop(), and sleep() methods */

class ClassA extends Thread {
    public void run () {
        System.out.println("Start Thread A....");
        for (int i =1; i<=5; i++) {
            if (i == 1) yield();
            System.out.println("From thread A with i = " + i);
            //yield method tells that this method is in execution
        }
        System.out.println("Exiting from Thread A...");
    }
}

class ClassB extends Thread {
    public void run () {
        System.out.println("Start Thread B ....");
        for (int j =1; j<=5; j++) {
            System.out.println("From thread B with j = " + j);
            if (j==2) stop();
            // after 2nd execution, this method will be stopped
        }
        System.out.println("Exiting from Thread B...");
    }
}

class ClassC extends Thread {
    public void run () {
        System.out.println("Start Thread C .....");
        for (int k =1; k<=5; k++) {
            System.out.println("From thread C with i = " + k);
            if (k == 3 ) {
                try {
                    sleep (1000); //1 sec
                } catch (Exception e) {
                }
            }
        }
        System.out.println("Exiting from Thread C...");
    }
}

public class prac5 {
    public static void main(String[] args) {
        ClassA a = new ClassA();
        ClassB b = new ClassB();
        ClassC c =  new ClassC();
        a.start();
        b.start();
        c.start();
        System.out.println(".... Multithreading is over"); // we are not sure
        // in which order is to be executed, because scheduler will
        // take all the threads and depending
    }
}