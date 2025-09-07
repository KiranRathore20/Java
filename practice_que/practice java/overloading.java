class A
{
public void disp (char c)
{
System.out.println (c);
}
public void disp (char c,int num)
{
System.out.println (c+" "+num);
}
}
 class overloading
{
public static void main(String arg[])
{
A obj=new A();
obj.disp ('p');
obj.disp ('q',100);
}
}
 