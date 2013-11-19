import java.util.Random;

/** An instance of this class represents a coin that can be tossed, yielding
**  a result of either "heads" or "tails".  The result of the most recent
**  toss is observable, as are the counts corresponding to the number of
**  past tosses resulting in "heads" and "tails", respectively.
**
**  @author R. McCloskey
*/

public class Coin2WithCounters3 extends Coin2 {

   // instance variables
   // ------------------

   private int headsCounter; // # of past tosses yielding "heads"
   private int tailsCounter; // # of past tosses yielding "tails"
   

   // constructor
   // -----------

   /** Initializes the coin's state.
   */
   public Coin2WithCounters3()
   { 
      super();  // call the super class's constructor
      headsCounter = 0;  tailsCounter = 0;
   }

   // observers
   // ---------

   /** Returns # of past tosses that yielded "heads".
   */
   public int headsCount() { return headsCounter; }


   /** Returns # of past tosses that yielded "tails".
   */
   public int tailsCount() { return tailsCounter; }

   /** Returns # of past tosses.
   */
   public int tossCount() { return headsCount() + tailsCount(); }

   /** Returns a string depicting the coin's current state.
   */
   public String toString()
   { 
      return super.toString() + 
             " (H:" + headsCount() + " T:" + tailsCount() + ")";
   }

   // mutator
   // -------

   /** Tosses the coin.
   */
   public void toss() 
   { 
      super.toss();   // invoke the toss() method in the superclass

      // increment the appropriate counter
      if (faceUp() == HEADS) {   // note that field 'face' cannot be
         headsCounter++;         // referred to here because it is private
      }                          // in the superclass
      else { 
         tailsCounter++;
      }
   }

}

