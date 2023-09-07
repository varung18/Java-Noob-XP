/* Demonstration of thread class method  by genID()
 * Java code for thread creation by extending the thread class
 */

class ThreadID implements Runnable {
    public void run () {
        try {
            //Displaying the thread that is running
            System.out.println("Thread "+Thread.currentThread().getId()+" is running");
            //Whichever the thread is in execution, will show their ID
        } catch (Exception e) {
            // Throwing an exception
            System.out.println("Exception is caught ");
        }
    }
}

//Main class
public class prac4 {
    public static void main(String[] args) {
        int n  = 8;
        for (int i = 0; i <8; i++) {
            Thread object = new Thread(new ThreadID());
            object.start();
            //Whenever these threads  will be in execution, they all will run parallely
        }
        // One thread will be created in each loop
    }
}
// By this practical we can get the information about the thread by means of their ID
// Output can be different since its been implemented using the Runnable interface