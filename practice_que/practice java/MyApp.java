import java.applet.*;
import java.awt.*;
/*<applet code="MyApp" width=500 height=200>
</applet>*/
public class MyApp extends Applet
{
public void init()
{
 setBackground(Color.cyan);
 setForeground(Color.red);
}
public void paint(Graphics g)
{ 
g.drawString("hello world",50,25);
}
}
