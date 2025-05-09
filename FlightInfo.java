package week8;

import java.util.ArrayList;

class FlightInfo
{
  private ArrayList < FlightDest > flightDestList;

  public FlightInfo ()
  {
    flightDestList = new ArrayList <> ();
  }//constructor

  public void addFlightDestPair (String fNo, String dest)
  {
    FlightDest flightDest = new FlightDest (fNo, dest);
    flightDestList.add (flightDest);
  }//addFlightDestPar

  public ArrayList < String > getFlightsDest (String dest)
  {
    ArrayList < String > flightNos = new ArrayList <> ();
  for (FlightDest flightDest:flightDestList)
      {
	  if (flightDest.getDestination ().equalsIgnoreCase (dest))
		  flightNos.add (flightDest.getFlightNo ());
      }//for
    return flightNos;
  }//getFlightDest
}//class
