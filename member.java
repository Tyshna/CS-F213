package week10.society;

abstract class member
{
private String name; 
private String address; 
int fee;
public member(String n, String add)
{
this.name = n;
this.address = add;
}//constructor

public String getName()
{return this.name;}//getName

public String getAddress()
{return this.address;}//gerAddress

public abstract int getFee();
}//member
