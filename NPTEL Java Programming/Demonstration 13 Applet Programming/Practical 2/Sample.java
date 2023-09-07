import java.awt.*;
import java.applet.*;


public class Sample extends Applet{ // Applet is an abstract class.
    String msg;
    // Set the forground and background colors.
    public void init() {  // Abstract method with no required arguments
        setBackground(Color.cyan);
        setForeground(Color.red);
        msg = "inside init(0 --)";
    }
    // Initialize the string to be displayed.
    public void start() {  // Abstract method with no required arguments
        msg += "Inside start () --"; 
    }
    //Display msg is applet window
    public void paint(Graphics g) { // but here, here's an argument which is required, and ie, Graphics
        msg += "Inside paint ().";
        g.drawString(msg, 10, 30);
        //Graphics is a class defined in java.awt, g is an object for that

        //doesnt matter where your methods are. Java will always look for the order, in this case:
        // init -> start -> paint
    }
}
