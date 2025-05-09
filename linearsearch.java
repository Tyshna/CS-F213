package week10.search;

public class linearsearch implements searching
{
int key;
int arr[];
public linearsearch(int k, int[] a)
{
this.key = k;
this.arr = a.clone();
}//constructors

public void findkey()
{
int c = 0;
for(int i=0;i<arr.length; i++)
{
if(this.arr[i] == this.key)
{ 
c++;
break;
}//if
}//for
if(c==0)
System.out.println("not found");
else
System.out.println("Found");
}//findkey
}//linearsearch