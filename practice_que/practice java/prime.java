class prime
{
public static void main (String arg[])
{
int n=4;
boolean flag=false;
for (int i=2;i<=n/2;i++)
{
if(n%i==0)
{ 
flag=true;
break;
}
 }
if(!flag)
System.out.println (n+"number is prime");
else
System.out.println (n+"number is not prime");
}
}
