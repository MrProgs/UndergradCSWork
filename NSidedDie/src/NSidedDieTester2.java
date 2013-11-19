import java.util.Scanner;

/** Java application for testing the NSidedDie class.  
*/

public class NSidedDieTester2 {

   private static Scanner input;
   private static NSidedDie die;

   public static void main(String[] args)
   {
      input = new Scanner(System.in);
      die = makeDie();
      print("Enter # of times to toss the die: ");
      int n = input.nextInt();
      for (int i=0; i != n; i++) {
         die.toss();
      }
      reportSideCounts();
   }


   /** Prompts user for what kind of die is wanted (6-sided fair, fair, or
   **  unfair), creates it, and passes result back to caller.
   */
   private static NSidedDie makeDie() 
   {
      NSidedDie result;
      int sides;

      println("(1) Six-sided fair die");
      println("(2) Fair die");
      println("(3) Unfair die");
      print(">");

      int response = input.nextInt();
      
      if (response == 1) {
         result = new NSidedDie();
      }
      else {
         print("Enter number of sides: ");
         sides = input.nextInt();
         if (response == 2) {
            result = new NSidedDie(sides);  
         }
         else {
            result = new NSidedDie(getRelProbs(sides));
         }
      }
      return result;
   }

   /** Prompts user to enter relative probability of each side of a
   **  die having the specified number of sides.
   */
   private static double[] getRelProbs(int numSides)
   {
      double[] result = new double[numSides];
      println("Please enter relative probabilities...");
      for (int i=0; i != numSides; i++) {
         print("For side " + (i+1) + ": ");
         result[i] = input.nextDouble();
      }
      return result;
   }


   /** Reports # times that 'die' was tossed and shows how many times
   **  each outcome was tossed, together with its percentage.
   */
   private static void reportSideCounts()
   {
      int tossCntr = die.tossCount();
      println("Die was tossed " + tossCntr + " times.");
      println("Outcome   Count   Percentage");
      for (int i=0; i != die.numSides(); i++) {
         int k = die.tossCount(i+1);
         double pct = ((double)k) / tossCntr;
         System.out.printf("%4d %9d  %9.3f\n", (i+1), k, pct);
      }
   }


   /** Surrogates for System.out.print() and println()
   */
   private static void print(String s) { System.out.print(s); }
   private static void println(String s) { System.out.println(s); }

}