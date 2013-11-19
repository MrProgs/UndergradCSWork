import java.util.Scanner;

/** Java application for testing the Coin2 class.
*/

public class Coin2Tester {

   public static void main(String[] args)
   {
      Coin2 coin = new Coin2();

      Scanner input = new Scanner(System.in);
      System.out.print("Enter # of times to toss coin: ");
      int n = input.nextInt();

      tossTest(coin, n);
   }

   /** Toss the specified coin the specified # of times, each time
   **  displaying the coin's state.
   */
   private static void tossTest(Coin2 coin, int n)
   {
      for (int i=0; i!=n; i++) {
         coin.toss();
         System.out.println(coin.toString());
      }
      System.out.println();
   }

}