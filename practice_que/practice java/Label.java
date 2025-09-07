class Label
{
public static void main(string[]s)
{
for(int i=0;i<6;i++)
{
for(int j=0;j<6;j++)
{
if (j>i)
break;
System.out.print(""+j);
}
}
}