package week10.society;

public class society_main
{
public static void main(String args[])
{
society s = new society();
s.addMember("jay", "diac");
s.addMember("jake", "downtown");
s.addSeniorMember("bob", "dso", 200);
s.addSeniorMember("cam", "dip", 210);
System.out.println("Total Fee collection: "+s.getFeeTotal());
}//main
}//society_main
