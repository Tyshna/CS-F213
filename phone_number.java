import java.util.*;
public class phone_number
{
public static void main(String args[])
{
String ph;
Scanner sc = new Scanner(System.in);
System.out.println("Enter phone number in the format 00971XXXXXXX");
ph = sc.nextLine();
String cc = ph.substring(5);
String ec = ph.substring(5,6);
//System.out.println(ec);
switch(ec)
{
case "4":
System.out.println("Dubai");
break;
case "2":
System.out.println("Abu Dabi");
break;
case "3":
System.out.println("Al Ain");
break;
case "6":
System.out.println("Sharjah");
break;
default:
System.out.println();
break;
}//switch
sc.close();
}//main
}//class

