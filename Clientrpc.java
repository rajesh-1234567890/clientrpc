import java.io.*;
import java.net.*;
import java.util.*;
class Clientrpc
{
public static void main(String args[])
{
try
{
BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
Socket clsct=new Socket("127.0.0.1",140);
DataInputStream din=new DataInputStream(clsct.getInputStream());
DataOutputStream dout=new DataOutputStream(clsct.getOutputStream()); System.out.println("Enter String");
String str=in.readLine();
dout.writeBytes(str+'\n');
clsct.close();
}
catch (Exception e)
{
System.out.println(e);
}
}
}