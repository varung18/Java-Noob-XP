/* From Practical 3
IF we close the html page, it will be closed completely.
 * And if we run the same applet, then the same applet will
 * be displayed. It means stop doesn't closes the program completely.
 * It still remains on the memory. In order to remove this 
 * program completely, we have to call the destroy method.
*/

/*The following program demonstrates the usage of
 * destryo () in an applet program.
 */

import java.applet.Applet;
import java.awt.Graphics;

public class AppletLifeCycle extends Applet {
    StringBuffer strBuffer;
    public void init() {
        strBuffer = new StringBuffer();
        addItem("Initializing the applet: ");
    }
    public void start() {
        addItem("Starting the applet: ");
    }
    public void stop() {
        addItem ("Stopping the applet: ");
    }
    public void destroy() {
        addItem ("Unloading the applet"); // When this will come up as output while runtime
        // it means that the applet is no more
    }

    void addItem (String word) { //It prints on the console area as well as print on the applet string
        //using the repaint method
        System.out.println(word);
        strBuffer.append(word);
        repaint();
    }

    public void paint(Graphics g) {
        //Draw a rectangle around the applet's display area
        g.drawRect(0, 0, getWidth() -1, getHeight() -1);
        //Display the string inside the rectangle.
        g.drawString(strBuffer.toString(), 10, 20); // It will draw the string within the rectangle.
    }
}
// Once it is stopped, then it will completely destroyed.