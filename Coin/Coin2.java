import java.util.Random;

/** An instance of this class represents a coin that can be tossed, yielding
**  a result of either "heads" or "tails", with equal probability.  The
**  result of the most recent toss is observable.  
**  This version uses symbolic constants representing "heads" and "tails".
**
**  @author R. McCloskey
**  @version February 2012
*/

public class Coin2 {

   // public symbolic constants
   // -------------------------
 
   // Note: "final" means that the value of the variable cannot be changed;
   // "static" means that all instances of the class share one copy of it.

   public static final boolean HEADS = true;
   public static final boolean TAILS = false;


   // instance variables
   // ------------------

   private boolean face;   // either HEADS or TAILS, whichever side is "up"
   private Random rand;    // object that generates pseudo-random values
   

   // constructor
   // -----------

   /** Initializes the coin so that "heads" is face up.
   */
   public Coin2()
   { 
      face = HEADS;
      rand = new Random();
   }


   // observers
   // ---------

   /** Returns the face (either HEADS or TAILS) of the coin that is "up".
   */
   public boolean faceUp() { return face; }


   /** Returns a string depicting the coin's current state.
   */
   public String toString()
   {
      final String HEADS_STR = "Heads";
      final String TAILS_STR = "Tails";

      if (faceUp() == HEADS) { 
         return HEADS_STR;
      }
      else { 
         return TAILS_STR;
      }
      // alternative code:
      //   return faceUp() == HEADS ? HEADS_STR: TAILS_STR;
   }


   // mutator
   // --------

   /** Tosses the coin, leaving it in either a "heads up" or "tails up"
   **  state with equal probability.
   */
   public void toss() { face = rand.nextBoolean(); }

}
