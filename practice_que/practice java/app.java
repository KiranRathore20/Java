import java.awt.*;
class MyFrame extends Frame
{
public static void main(String args[])
{
MyFrame f=new MyFrame();
Button b1=new Button("Ok");
f.add(b1);
f.setTitle("first Frame");
f.setsize(200,300);
f.setLocation(0,0);
f.setVisible(true);
}
}
