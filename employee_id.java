package week9;

import java.util.*;
public class employee_id
{
String id;
public void input()
{
Scanner sc = new Scanner (System.in);
System.out.println("Enter year of joining in the format 20XX");
String y = sc.nextLine();
System.out.println("Enter discipline: A1 for CHEM, A3 for EEE, A4 for MECH, A7 for CS");
String d = sc.nextLine();
System.out.println("Enter S for staff or F for Faculty");
String p = sc.next();
System.out.println("Enter P for Pilani, G for Goa, H for Hyderabad, D for dubai");
String c = sc.next();
c = c.toUpperCase();
p = p.toUpperCase();

gen_id(y, d, p ,c);
sc.close();
}//input

public void gen_id(String yr, String disp, String pos, String campus)
{
Random rn = new Random();
this.id = yr+disp+pos;
int rand = rn.nextInt(1000);
String end = Integer.toString(rand);
while(end.length()!=3)
{end = 0+end;}//while
this.id = this.id+end+campus;
}//gen_id

public static void main(String args[])
{
employee_id obj = new employee_id();
obj.input();
obj.display();
}//main

public void display()
{
System.out.println("Employee id: "+id);
}//display
}//class
