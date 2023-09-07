import java.applet.Applet;
import java.awt.Graphics;

public class prac3 extends Applet {

    public void init () {
        /*
         * To resize an applet window use,
         * void resize (int x, int y) method of an applet class.
         */

        resize(500, 500);
    }

    public void paint (Graphics g) {
        g.drawString("Window has been restrcited to 500x500", 50, 50);
    }
}