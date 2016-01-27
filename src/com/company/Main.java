package com.company;

public class Main {
    public static void main(String[] args) {

    for (int i=99; i>0;i--) {

        if (i > 1) {
            System.out.println();
            System.out.println(i + " bottles of beer on the wall.");
            System.out.println(i + " bottles of beer!");
            System.out.println("Take one down. Pass it around.");
            System.out.println((i - 1) + " bottles of beer on the wall.");
        } else
        {
            System.out.println();
            System.out.println(i + " bottle of beer on the wall.");
            System.out.println(i + " bottle of beer.");
            System.out.println("Take one down. Pass it around.");
            System.out.println("No more bottles of beer on the wall.");
        }


        }
    }
}
