package edu.htc;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int count;
        int balance;
        for (count=99; count>=1; count--)
        {
            balance = count-1;
            if(count != 1) {
                System.out.println(count + " bottles of beer on the wall");
                System.out.println(count + " bottles of beer!");
                System.out.println("Take one down, Pass it around");
                if (balance != 1) {
                    System.out.println(balance + " bottles of beer on the wall");
                } else {
                    System.out.println(balance + " bottle of beer on the wall");
                }
                System.out.println();
            }

            else
            {
                System.out.println(count + " bottle of beer on the wall");
                System.out.println(count + " bottle of beer!");
                System.out.println("Take one down. Pass it around");
                System.out.println("No more bottles of beer on the wall");
            }
        }
    }
}
