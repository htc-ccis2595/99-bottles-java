class beer {
    public static void main(String args[]) {
        int count;
        int less;
        for (count = 99; count > 0; count = count - 1)
        {
            if (count == 1)
            {
                System.out.println(count + " bottle of beer on the wall.");
                System.out.println(count + " bottle of beer!");
                System.out.println("Take one down. Pass it around.");
                System.out.println("No more bottles of beer on the wall");
                System.out.println(" ");
            }
            else
            {
                less = count - 1;
                System.out.println(count + " bottles of beer on the wall.");
                System.out.println(count + " bottles of beer!");
                System.out.println("Take one down. Pass it around.");
                System.out.println(less + " bottles of beer on the wall");
                System.out.println(" ");
            }
        }
    }
}