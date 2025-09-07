import java.io.*;
class useradd
{
public static void main(String[] args)throws IOException
{
int a,b,c;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter First Number:");
a=Integer.parseInt(br.readLine());
System.out.println("Enter Second Number:");
b=Integer.parseInt(br.readLine());
c=a+b;
System.out.println("Addtion="+c);
}
}
