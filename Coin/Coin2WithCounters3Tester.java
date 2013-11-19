   import java.util.Scanner;

/** Java application for testing both the Coin2 and Coin2WithCounters3 classes.
**  It also illustrates polymorphism in the tossTest() method, which is
**  called twice, once with a Coin2 object being passed to it and the other
**  time a Coin2WithCounters3 object.
*/

   public class Coin2WithCounters3Tester {
   
      public static void main(String[] args)
      {
         Scanner input = new Scanner(System.in);
         System.out.print("Enter # of times to toss coin: ");
         int n = input.nextInt();
      
         Coin2 coinA = new Coin2();
         System.out.println("Tossing the Coin2 object:");
         tossTest(coinA, n);
      
         System.out.println("\n");
      
         Coin2WithCounters3 coinB = new Coin2WithCounters3();
         System.out.println("Tossing the Coin2WithCounters3 object:");
         tossTest(coinB, n);
      
      // report number of tosses and percentage of heads/tails for coinB
         int m = coinB.tossCount();
         System.out.println("Number of tosses: " + m);
         System.out.println("Percentage of Heads: " + 
                          coinB.headsCount() / (double) m);
         System.out.println("Percentage of Tails: " + 
                          coinB.tailsCount() / (double) m);
      
      // Sean Daly's Additions: tests Coin2WithCounters3AndHistory
         Coin2WithCounters3AndHistory coinC = new Coin2WithCounters3AndHistory(34);
         System.out.println("Tossing the Coin2WithCounters3AndHistory object:");
         tossTest(coinC, n);
      
      // reports details of history
         int a = coinC.historyCapacity(); 
         System.out.println("History Capacity:" + a);
			System.out.println("Number of past tosses:" + coinC.historyLength());
         System.out.println("Enter which past toss you would like to know:");
         int hotsytotsy = input.nextInt();
         System.out.println(coinC.pastToss(hotsytotsy));
      }
   
   /** Tosses the specified coin the specified # of times, each time
   **  displaying the coin's image (as provided by toString()).
   */
      private static void tossTest(Coin2 coin, int n) 
      {
         for (int i=0; i!=n; i++) {
            coin.toss();
            System.out.println(coin.toString());
         }
      }
   
   }