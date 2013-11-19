/** Extends RedBluePartitionerOfInt by defining the isRed() method to classify
**  a value as RED iff it is even.
*/
public class EvenOddPartitioner extends RedBluePartitionerOfInt {

   protected boolean isRed(int z) { return z % 2 == 0; }
}
