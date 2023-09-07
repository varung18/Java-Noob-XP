/*Data race example */

public class prac8 extends Thread{
        public static int x;
        public void run () {
            for (int i = 0; i<100;i++) {
                x = x+1;
                x = x-1;
            } // it is an intermittent wat, this
            //statement will be executed by the scheduler in a different way
            // hence, it is not atomic
        }
    public static void main(String[] args) {
        x= 0;
    for (int i = 0; i< 1000; i++) {
        new prac8().start();
        System.out.println(x); // x not always 0
    }    }
}
// The threads which are produced are not synchronized, means
// when one thread is in the execution, the other threads should not
// be executed simultaneously, having accessing the same variable