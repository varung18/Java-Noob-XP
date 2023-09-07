/* The following program demonstrate the effect of 
 * stop() in an application program.
 */ // This method stopsthe execution of an applet and will

//Create a child frame window within an applet. 

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

// <applet code = "AppletFrame" width = 300 height = 50></applet>

//Create a subclass of Frame
class SampleFrame extends Frame {
    SampleFrame (String title) {
        super (title);
        //Create an object to handle window events
        MyWindowAdapter adapter = new MyWindowAdapter(this);
        //register it to receive those events
        addWindowListener(adapter);
    }
    public void paint(Graphics g) {
        g.drawString("This s in Frame Window", 10, 40);
    }
}

class MyWindowAdapter extends WindowAdapter {
    SampleFrame sampleFrame;
    public MyWindowAdapter (SampleFrame sampleFrame) {
        this.sampleFrame = sampleFrame;
    }
    public void windowClosing (WindowEvent we) {
        sampleFrame.setVisible(false);
    }
}

//Create frame window
public class AppletFrame extends Applet {
    Frame f;
    public void init() { // invoked implicitly
        f = new SampleFrame("A Frame Window");
        f.setSize(250, 250);
        f.setVisible(true);
    }
    public void start() { // invoked implicitly
        f.setVisible(true);
    }
    public void stop() { // invoked explicitly
        f.setVisible(false); // Whenever we say stop, we invoke the stop method in there..
    }
    public void paint(Graphics g) {
        g.drawString("This is in applet Window", 10, 20);
    }
}