import java.applet.*;
import java.awt.*;
public class MyApplet1 extends Applet
{
public void init()
{
 setBackground(Color.cyan);
 setForeground(Color.red);
}
public void start() {}
public void paint(Graphics g)
{ 
g.drawString("hello world",50,25);
}
public void stop(){}
public void destroy() {}
}
