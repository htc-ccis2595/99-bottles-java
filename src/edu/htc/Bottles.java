package edu.htc;

public class Bottles {

    public static void main(String[] args) {
        String word = "bottles";
        for (int bottles = 99; bottles > 0; ) {
            System.out.println(bottles + " " + word + " of beer on the wall, " + bottles + " " + word + " of beer.");
            bottles = bottles - 1;
            if (bottles == 1) word = "bottle";
            if (bottles == 0)
                System.out.println("Take one down and pass it around, No more bottles of beer on the wall.\n");
            else
                System.out.println("Take one down and pass it around, " + bottles + " " + word + " of beer on the wall.\n");
        }

    }
}






































