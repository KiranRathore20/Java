class abc
{
int x;
int y;
}
class abctest
{
public static void main(String args[])
{
 abc a1= new abc();
 abc a2 = new abc();
a1.x=5;
a1.y=7;
a2.x=10;
a2.y=33;
System.out.println(a1.x+","+a1.y);
System.out.println(a2.x+","+a2.y);
}
}