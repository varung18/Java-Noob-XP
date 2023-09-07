/* USe of suspend() and resume () methods */

class Thread1 extends Thread {
    public void run () {
        try {
            System.out.println(" First thread starts running ");
            sleep(10000);
            System.out.println("First thread finishes running");
        }
        catch (Exception e) {   }
    }
}

class Thread2 extends Thread {
    public void run () {
        try {
            System.out.println(" Second thread starts running ");
            System.out.println("Second thread is suspended itself ");
            suspend();
            // This method will not make the process to stop completely, but
            // witheld and can be revoke if we call the resume method.
            System.out.println("Second thread finishes running");
        }
        catch (Exception e) {   }
    }
}

class prac6 {
    public static void main(String[] args) {
        try {
            Thread1 first = new Thread1(); //It is a newbaord thread, ie, in Newborn state
            Thread2 second = new Thread2(); // another new born thread

            first.start();      //first is scheduled for running
            second.start();     // second is scheduled for running

            System.out.println("Revive the second thread "); // If it is suspended
            second.resume();

            System.out.println("Second thread went for 10 seconds sleep ");
            second.sleep(10000);

            System.out.println("Wake up second thread and finishes running");
            System.out.println("Demonstration is finished ");

        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
