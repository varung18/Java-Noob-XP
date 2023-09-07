/* There are many methods those are possible in any applet programs, such as init()
 * , start(), paint(), stop(), destroy() methods etc. These methods are abstract 
 * methods and are defined in Applet class(java.applet.package). These methods are 
 * optional and preferrably to be overwritten as per the need of your applet.
 * The following, shows a default version of the method.
 */
import java.applet.*;
import java.awt.*;

public class AppletSkeleton {
    public void init () {  }
    public void start ( ) {  }
    public void stop () {  }
    public void destroy () { }
    public void paint (Graphics g) {  }
    // Not defining any methods, and declaring it as void, yet it still be considered as overwritten.
}
