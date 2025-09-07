import java.applet.*;
import java.awt.*;
/*<applet code="MyApp3" width=200 height=200>
</applet>*/
public class Myapplet extends Applet
{
public void init()
{
 setBackground(Color.cyan);
 setForeground(Color.red);
}
public void paint(Graphics g)
{
g.drawString("hello",50,25);
}
}