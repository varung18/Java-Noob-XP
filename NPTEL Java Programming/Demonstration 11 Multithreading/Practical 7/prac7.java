/*Setting priority to threads*/

class ClassA extends Thread {
    public void run () {
        System.out.println("Start Thread A....");
        for (int i =1; i<=5; i++) {
            System.out.println("From thread A with i = " + i);
        }
        System.out.println("Exiting from Thread A...");
    }
}

class ClassB extends Thread {
    public void run () {
        System.out.println("Start Thread B ....");
        for (int j =1; j<=5; j++) {
            System.out.println("From thread B with j = " + j);
        }
        System.out.println("Exiting from Thread B...");
    }
}

class ClassC extends Thread {
    public void run () {
        System.out.println("Start Thread C .....");
        for (int k =1; k<=5; k++) {
            System.out.println("From thread C with i = " + k);
        }
        System.out.println("Exiting from Thread C...");
    }
}

public class prac7 {
    public static void main(String[] args) {
        ClassA a = new ClassA();
        ClassB b = new ClassB();
        ClassC c =  new ClassC();

        c.setPriority(Thread.MAX_PRIORITY);
        b.setPriority(b.getPriority() +1);
        a.setPriority(Thread.MIN_PRIORITY);
        
        a.start();
        b.start();
        c.start();
        System.out.println(".... Multithreading is over"); // we are not sure
        // in which order is to be executed, because scheduler will
        // take all the threads and depending
    }
}