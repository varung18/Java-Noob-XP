/*A simple abnner applet
 * This applet creates a thread that scrolls the message contained
 * in the msg right to left across the applet's window
 */

import java.awt.*;
import java.applet.*;

public class SimpleBanner extends Applet implements Runnable{
    String msg = "A Simple Moving banner";
    Thread t = null; // Recall that whenever we had to run a thread, we have to run a method.
    int state;
    boolean stopFlag;
    //Set colors and initialize thread.
    public void init() {
    setBackground(Color.CYAN);
    setForeground(Color.red);
    }

    // Start thread
    public void start() { // Here the thread is created.
        t = new Thread(this);
        stopFlag = false;
        t.start();
    }
        // Entry point for the thread that runs the banner.
    public void run () {
        char ch;
        //Display banner
        for ( ; ; ) {
            try {
                repaint();
                Thread.sleep(250); //goes on sleep state for a quarter second
                ch = msg.charAt(0);
                msg = msg.substring(1, msg.length());
                msg += ch;
                if (stopFlag) {
                    break;
                }

            } catch (InterruptedException e) {
            }
        }
    }
        //Pause the banner
        public void stop () {
            stopFlag = true;
            t = null;
        } // Here it will act like destroy

        // Display the banner.
        public void paint (Graphics g) {
            g.drawString(msg, 50, 30);
        }
    
   
}
