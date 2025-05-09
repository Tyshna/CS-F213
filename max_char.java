import java.util.Scanner;

public class max_char
{
  public static void main (String[]args)
  {
    Scanner scanner = new Scanner (System.in);
    System.out.println("enter string");
    String inputString = scanner.nextLine ();

    char maxChar = findMaxOccurringChar (inputString);

    if (maxChar != '\0')
      {
	System.out.println (maxChar);
      }//if
    else
      {
	System.out.println ("No characters found in the string.");
      }//else
    scanner.close();
  }//main

  public static char findMaxOccurringChar (String str)
  {
    if (str == null || str.isEmpty ())
      {
	return '\0';
      }//if

    int[] charCount = new int[256];

    for (int i = 0; i < str.length (); i++)
      {
	charCount[str.charAt (i)]++;
      }//for

    int maxCount = 0;
    char maxChar = '\0';

    for (int i = 0; i < 256; i++)
      {
	if (charCount[i] > maxCount)
	  {
	    maxCount = charCount[i];
	    maxChar = (char) i;
	  }//if
      }//for

    return maxChar;
  }//findmaxOccuringChar
}//class
