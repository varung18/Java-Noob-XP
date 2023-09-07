/* The following program demonstrate an applet program can be
 * executed without any explicitly maintained HTML file.
 */

// A Hello World program in applet

import java.applet.*;
import java.awt.*;

public class HelloWorld extends Applet {
    public void paint(Graphics g) {
        g.drawString("Hello World!", 150, 150);
    }
}

/* We can define the methods which can be inherited from other 
 * API class. HTML is a language specially for a browser that they
 * understand the code, through the tags.
 */


/*
 * <html>
    <body>
        <applet width  = "300" height ="300" 
        codebase = "." code = "HelloWorld.class">
        </applet>
    </body>
</html>
 */ 