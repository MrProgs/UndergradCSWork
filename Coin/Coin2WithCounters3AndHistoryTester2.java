import java.util.Scanner;

/** Java application for testing the Coin2WithCounters3AndHistory class.
**  It creates an object of that class and tosses it a number of times
**  specified by the user (in response to a program prompt), each time
**  displaying the coin's entire recorded history.  (The user also chooses
**  the history capacity in response to a prompt.)
*/

public class Coin2WithCounters3AndHistoryTester2 {

   private static Coin2WithCounters3AndHistory coin;

   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter # of times to toss coin: ");
      int n = input.nextInt();

      System.out.print("Enter history capacity of the coin: ");
      int histCap = input.nextInt();

      coin = new Coin2WithCounters3AndHistory(histCap);
      tossTest(n);

      System.out.println("\n");
   }


   /** Tosses coin the specified # of times, each time displaying its 
   **  recorded history as a string of H's and T's.
   */
   private static void tossTest(int n) 
   {
      for (int i=0; i!=n; i++) {
         System.out.println("After " + i + " tosses: " + historyString());
         coin.toss();
      }
      System.out.println("After " + n + " tosses: " + historyString());
   }

   /* Returns a string of H's and T's corresponding to coin's recorded
   *  history (from newest to oldest).
   */
   private static String historyString()
   {
      int len = coin.historyLength();
      char[] histImage = new char[len];
      for (int i = 0; i != len; i++) {
         if (coin.pastToss(i) == coin.HEADS)
            { histImage[i] = 'H'; }
         else
            { histImage[i] = 'T'; }
      }
      return new String(histImage);
   }

}