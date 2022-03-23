public class Josephue_proplem {
    static int josephus(int n, int k)
    {
        if (n == 1)
            return 1;
        //"n" is the number of player/s(solder/s)
        // "k" is how many player/s(solder/s) to skip them to begin killing.
        else
            return (josephus(n - 1, k) + k-1) % n + 1;
    }
    public static void main(String[] args)
    {
        // This is a Program to test above function
        int n = 42;
        int k =2 ;
        System.out.println("The chosen place is " + josephus(n, k));
    }
}
