package week10.society;

import java.util.*;
public class society
{
ArrayList <member> all = new ArrayList <member>();

public void addMember(String name,  String address)
{
member m = new standardMember(name, address);
all.add(m);
}//addmember

public void addSeniorMember(String n, String addr, int f)
{
member sm = new seniorMember(n,addr,f);
all.add(sm);
}//addSeniorMember

public int getFeeTotal()
{
int total_fee = 0;
for(member mem : all)
{
int mem_fee = mem.getFee();
total_fee += mem_fee;
}//foreach

return total_fee;
}//getFeeTotal

}//society


