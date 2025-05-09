package week9;

import java.util.*;
public class chat
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter message");
String msg = sc.nextLine();

StringTokenizer st = new StringTokenizer(msg);
while(st.hasMoreTokens())
{
String wrd = st.nextToken();
char s = wrd.charAt(0);
if(s=='a'||s=='A'||s=='h'||s=='H')
System.out.println(wrd);
}//while
sc.close();
}//main
}//class

