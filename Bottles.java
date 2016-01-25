/**
	This program prints out the 99 bottles of beer song
*/



class bottles
{
   public static void main(String args[])
    {
    String s = "s";
    for (int beers=99; beers>-1;)
      {
      System.out.print(beers + " bottle" + s + " of beer on the wall, \n");
      System.out.print(beers + " bottle" + s + " of beer, \n");
      if (beers==0)
        {
        System.out.print("No more bottles of beer on the wall");
        System.exit(0);
        }
      else
        System.out.print("Take one down, pass it around, \n");
        s = (--beers == 1)?"":"s"; 
        // I got stuck at the plural part. This line made it work but I want to understand why.  
        // What I think is -- reduces the beer by one if it == 1 then ? says if 1 print "" (nothing) is not 1 print"s"?? Just want to make sure I an getting it. 
        System.out.println(beers + " bottle" + s + " of beer on the wall.\n");
      }
    }
}