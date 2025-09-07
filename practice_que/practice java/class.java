class Ab
{
  void sum(int a,int b)
{
   System.out.println(a+b);
   void sum(int a,int b,int c)
{
System.out.println(a+b+c);
}
void sum(int a,float b)
{
System.out.println(a+b);
}
void sum(float b,int c)
{
System.out.println(b+c);
}
/* int sum(int a,int b)
{
System.out.println(a+b);
}*/
public static void main(String args[])
{
A obj=new A();
obj.sum(10,10,10);
obj.sum(20,20);
obj.sum(5,4f,10);
obj.sum(20,5,4f);
}
}





