package week10.search;

public class search_main
{
public static void main(String args[])
{
int a[] = {1,2,3,4,5};
linearsearch ls = new linearsearch (3, a);
binarysearch bs = new binarysearch (5, a);
System.out.print("Linear Search: ");
ls.findkey();
System.out.print("Binary Search: ");
bs.findkey();
}//main
}//class