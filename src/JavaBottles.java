/**
 * Created by Owner on 1/25/2016.
 */
public class JavaBottles {
    public static void main(String args[]) {
    int i=99;
        String beverage = "beer";
        String str = "bottles";

            while (i>=1) {
                System.out.println(i + " " + str + " of " + beverage + " on the wall.");
                System.out.println(i + " " + str + " of " + beverage + "!");
                System.out.println("Take one down. Pass it around.");

                i--;
                if (i == 0)
                    System.out.println("No more bottles on the wall.");
                if (i == 1) {
                    str = "bottle";
                    System.out.println(i + " " + str + " of " + beverage + " on the wall.\n");
                }
                if (i != 0 && i !=1)
                    System.out.println(i + " " + str + " of " + beverage + " on the wall.\n");
            }
    }
}
