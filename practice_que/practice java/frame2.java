import java.awt.*;
class Myframe_2 extends Frame
{
Myframe_2()
{
Button b=new Button("click me");
b.setBounds(30,100,80,30);
add(b);
setSize(300,300);
setLayout(null);
setVisible(true);
}
public static void main(String args[])
{
Myframe_2 f=new Myframe_2();
}
}