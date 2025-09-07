import java.applet.*;
import java.awt.*;
/*<applet code="HelloWorldApplet" width=500 height=200>
</applet>*/
public class HelloWorldApplet extends Applet {
   public void paint (Graphics g)
 {
      g.drawString ("Hello World", 25, 50);
   }
}