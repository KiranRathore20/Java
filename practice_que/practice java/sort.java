import java.util.Scanner;
public class sort
{
public static void main(String args[])
{
 Scanner sc = new Scanner(System.in);
 System.out.println("enter array size");
 int n=sc.nextInt();
 int m[]=new int[n];
 System.out.println("enter array elements:");
for(int i=0;i<n;i++)
{ 
System.out.println("array element is:"+(i+1));
m[i]=sc.nextInt();
}
for(int i=0;i<n;i++)
System.out.print(m[i]+"\t");
System.out.println();
for(int i=0;i<n-1;i++)
for(int j=i+1;j<n;j++)
if(m[i]>m[j])
{
int t=m[i];
m[i]=m[j];
m[j]=t;
}

for(int i=0;i<n;i++)
{
System.out.print(m[i]+"\t");
System.out.println();
}
}
}