package week8;

import java.util.Scanner;

public class FlightDestinationTester
{
  public static void main (String[]args)
  {
    FlightInfo flightInfo = new FlightInfo ();
    Scanner scanner = new Scanner (System.in);
      System.out.println ("Enter the number of flights you want to add: ");
    int numberOfFlights = scanner.nextInt ();
      scanner.nextLine ();
    for (int i = 0; i < numberOfFlights; i++)
      {
    	System.out.print ("Enter flight number (e.g., AA101): ");
    	String flightNumber = scanner.nextLine ();
    	System.out.print ("Enter destination (e.g., New York): ");
    	String destination = scanner.nextLine ();
    	flightInfo.addFlightDestPair (flightNumber, destination);
      }//for

    System.out.print ("Enter a destination to get flight numbers: ");
    String searchDestination = scanner.nextLine ();
    System.out.println ("Flights to " + searchDestination + ": " +flightInfo.getFlightsDest (searchDestination));
    scanner.close ();
  }//main
}//class

