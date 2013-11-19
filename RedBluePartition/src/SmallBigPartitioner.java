//Sean Daly
//4/3/12
//CMPS 144
//Programming Assignment #3
/** Extends RedBluePartitionerOfInt by defining the isRed() method to classify
**  a value as RED iff it is less than the value provided to the constructor.
*/
public class SmallBigPartitioner extends RedBluePartitionerOfInt {

private int s;
   /** The value passed to the constructor acts as the lower bound of
   **  BLUE values.  That is, anything less than it is RED, anything
   **  greater or equal is BLUE.
   */
   public SmallBigPartitioner(int blueLowerBound) { s = blueLowerBound; }  
   
   protected boolean isRed(int z) { return z<s; }
}