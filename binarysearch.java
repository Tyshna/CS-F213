package week10.search;

public class binarysearch implements searching
{
  int key;
  int[] arr;
  public binarysearch (int k, int[]a)
  {
    this.key = k;
    this.arr = a.clone ();
  }				//constructor

  public void findkey ()
  {
    int low = 0;
    int high = arr.length - 1;

    while (low <= high)
      {
	int mid = low + (high - low) / 2;
	if (arr[mid] == key)
	  {
	    System.out.println ("Key found");
	    return;
	  }			//if
	else if (arr[mid] < key)
	  low = mid + 1;	// Search the right half
	else
	  high = mid - 1;	// Search the left half
      }				//while

    System.out.println ("Key not found");
  }				//findkey
}				//binarysearch