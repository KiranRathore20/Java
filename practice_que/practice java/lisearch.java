import java.util.Scanner;
class LinSearch
{
 public static void main(String arg[])
{
Scanner sc= new Scanner(System.in);
 System.out.println("Enter Array Size");
 int n=sc.nextInt();
 int a[]= new int[n];
 
 //input
for(int i=0;i<n;i++)
{
 System.out.println("Enter Araay element"+(i+1));
 a[i]=sc.nextInt();
 
}
System.out.println("Enter item");
int item=sc.nextInt();
boolean flag=false;
//searching logic
for(int i=0;i<a.length;i++)
{
if
(a[i]==item")
{
flag=true;
break;
}
}
if(flag)
System.out.println("Found");
 else 
   System.out.println("Not Found");
 }
}