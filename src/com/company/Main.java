package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int intLastNumber;
        String strVessel;
        String strLiquid;

        if (args.length == 0){
            intLastNumber = 99;
            strVessel = "bottle";
            strLiquid = "beer";}
        else{
            intLastNumber = Integer.parseInt(args[0]);
            strVessel = args[1];
            strLiquid = args[2];}


        for(int i=intLastNumber; i>0; i--) {

            if (i == 1) {
                System.out.println(Integer.toString(i) + " " +  strVessel + " of " + strLiquid + " on the wall.");
                System.out.println(Integer.toString(i) + " " +  strVessel + " of " + strLiquid + "!");
            } else {
                System.out.println(Integer.toString(i) + " " +  strVessel + "s of " + strLiquid + " on the wall.");
                System.out.println(Integer.toString(i) + " " +  strVessel + "s of " + strLiquid + "!");
            }

            System.out.println("Take one down.  Pass it around.");

            if (i == 1) {
                System.out.println("No more " +  strVessel + "s of " + strLiquid + " on the wall.");
                System.out.println();
                System.out.println("No more " +  strVessel + "s of " + strLiquid + " on the wall.");
                System.out.println("No more " +  strVessel + "s of " + strLiquid + "!");
                System.out.println("Go to the store and buy some more.");
                System.out.println(Integer.toString(intLastNumber) + " " +  strVessel + "s of " + strLiquid + " on the wall.");
            } else {
                System.out.println(Integer.toString(i-1) + " " +  strVessel + "s of " + strLiquid + " on the wall.");
            }
            System.out.println();
        }
    }
}
