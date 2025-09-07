class Abc
{
    int x;
    int y;
}
class AbcTest
{
  public static void main(string arg[])
  {
      Abc a1=new Abc();
      Abc a2=new Abc();
      a1.x=5;
      a1.y=7;
      a2.x=8;
      a2.y=9;
      System.out.println(a1.x+" ' "+a1.y);
      System.out.println(a2.x+" ' "+a2.y);
  }
}