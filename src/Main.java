/**
 * Created by KenN on 1/15/16.
 */
/*
## Assignment
        Your job is to write a command line program in Java that prints the song lyrics, nicely formatted as follows:

        99 bottles of beer on the wall.
        99 bottles of beer!
        Take one down.  Pass it around.
        98 bottles of beer on the wall.
*/
public class Main {

    public static void main(String[] args) {
        String liquid = "beer";
        String container = "bottles";
        int x;

        for (x = 99; x >= 1; x--) {
            if (x == 1) container = "bottle";

            System.out.println(x + " " + container + " of " + liquid + " on the wall.");
            System.out.println(x + " " + container + " of " + liquid + ".");
            System.out.println("Take one down.  Pass it around.");
            switch(x){
                case 2: System.out.println("1 bottle of " + liquid + " on the wall.\n");
                        break;
                case 1: System.out.println("No more bottles of " + liquid + " on the wall.\n");
                        break;
                default:System.out.println(x - 1 + " " + container + " of " + liquid + " on the wall.\n");
            }
        }
    }
}
