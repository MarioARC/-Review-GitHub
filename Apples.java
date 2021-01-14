class Apples
{
  //Instance variables
  private String type;
  private double size; //inches diameter
  private boolean isTart;

  //constructors
  public void Apple()
  {
    type = null;
    size = 0;
    isTart = false;
  }

  //toString
  public String toString()
  {
    String output = "Type " + type + 
    "\nSize (inches diameter) " + size + 
    "\nIs it tart?" + isTart;

    return output;
  }
}