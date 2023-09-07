import java.awt.Graphics;
import java.applet.Applet;

public class prac5 extends Applet {
    public void paint (Graphics g) { 

        int x = 0;
        int y = 0;

        String msg = "";

        x = Integer.parseInt(getParameter ("xPosition"));
        y = Integer.parseInt(getParameter ("yPosition"));
        msg = getParameter("msg");

        g.drawString(msg, x, y);
    }
}
