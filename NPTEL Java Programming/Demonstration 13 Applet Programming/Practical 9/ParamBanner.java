import java.awt.*;
import java.applet.*;

public class ParamBanner extends Applet implements Runnable{
    String msg;
    Thread t = null;
    int state;
    boolean stopFlag;
    public void init() {
        setBackground(Color.cyan);
        setForeground(Color.red);
    }
    public void start() {
        msg = getParameter("Message");
        if (msg == null)
            msg = "Message not found";
        msg = "  " + msg;
        t = new Thread(this);
        stopFlag = false;
        t.start();
    }
    public void run () {
        char ch;
        for ( ;  ; ) {
            try {
                repaint();
                Thread.sleep(250);
            } catch (InterruptedException e) {
            }
        }
    }
    public void stop() {
        stopFlag = true;
        t = null;
    }

    public void paint(Graphics g) {
        g.drawString(msg, 50, 30);
    }
}
