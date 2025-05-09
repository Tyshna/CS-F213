package week10.society;

public class seniorMember extends member
{
public seniorMember(String n, String add, int f)
{
super(n,add);
this.fee = f;
}//constructor

public int getFee()
{
return this.fee;
}//getFee
}//seniorMember