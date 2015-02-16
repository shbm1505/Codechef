import java.io.*;
class number
{
public static void main (String args[]) throws IOException
{
BufferedReader br=new BufferedReader
(new InputStreamReader (System.in));
int a;
while((a=Integer.parseInt(br.readLine()))!=42)
{System.out.println(a);}
 
}
}