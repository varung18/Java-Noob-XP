import java.applet.*;
import java.awt.*;
// Add these two import parts to avoid compilation error

public class HelloWorld extends Applet {
    public void paint(Graphics g) {
        g.drawString("Hello World", 150, 150);
        // This method helps to display the string
        // First 150 for horizontal, and another 150 is vertical
    }
}
// This applet need to be hosted using an html page