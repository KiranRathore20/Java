import java.net.*;
import java.io.*;
class Net
{
public static void main(String arg[])throws UnknownHostException
{
InetAddress inet=InetAddress.getByName("www.amazon.com");
System.out.println(" "+inet.getAddress());
byte b[]=inet.getAddress();
for(int i=0;i<4;i++)
{
System.out.println(b[i]&255)
}
InetAddress inet2=InetAddress.getByAddress(b);
System.out.println(" "+inet.getHostName());
}
}