package edu.htc;

public class Main
{

    public static void main(String[] args) {

	    int counter;

            for (counter = 99; counter >= 0; counter--) {
                if ((counter != 2) & (counter > 1)){
                    System.out.println(counter + " bottles of beer on the wall");
                    System.out.println(counter + " bottles of beer!");
                    System.out.println("Take one down, pass it around.");
                    System.out.println((counter - 1) + " bottles of beer on the wall.");
                    System.out.println("");
                }
                else if (counter==2) {
                    System.out.println(counter + " bottles of beer on the wall");
                    System.out.println(counter + " bottles of beer!");
                    System.out.println("Take one down, pass it around.");
                    System.out.println(counter - 1 + " bottle of beer on the wall.");
                    System.out.println("");
                }
                else if (counter==1) {
                    System.out.println(counter + " bottle of beer on the wall");
                    System.out.println(counter + " bottle of beer!");
                    System.out.println("Take one down, pass it around.");
                    System.out.println("No more bottles of beer on the wall.");
                    System.out.println("");
                }

            }

    }
}
