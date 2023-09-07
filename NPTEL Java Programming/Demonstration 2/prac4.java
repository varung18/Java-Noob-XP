import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class prac4 extends Applet {
    public void init () {
        /*Here we change the default background of grey to anything
         * here we are taking into yellow*/
        setBackground(Color.CYAN);
    }
    public void paint (Graphics g) {
        g.drawString ("The Background color is changed from Default white to Cyan", 90, 90);
    }
    
}
