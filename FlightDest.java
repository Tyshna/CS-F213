package week8;

class FlightDest
{
  private String flightNo;
  private String destination;

  public FlightDest (String flightNo, String destination)
  {
    this.flightNo = flightNo;
    this.destination = destination;
  }//constructor

  public String getFlightNo ()
  {
    return flightNo;
  }//getFlightNo

  public String getDestination ()
  {
    return destination;
  }//getDestination
}//class
