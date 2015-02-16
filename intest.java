public class Main {
public static void main(String args[])throws java.io.IOException {
java.io.BufferedReader in = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
String [] X = in.readLine().split(" ");
int a = Integer.parseInt(X[0]),
b = Integer.parseInt(X[1]),
count=0,i,c;
for (i = 0; i < a; i++) {
c = Integer.parseInt(in.readLine());
if(c%b==0)
count++;
}System.out.print(count+" ");
}}  