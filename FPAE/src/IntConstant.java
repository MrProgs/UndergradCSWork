/** An instance of this class represents an operand that is an integer
**  constant. 
**
**  @author R. McCloskey
**  @version April 2012
*/

public class IntConstant implements Operand {

   private final int value;

   /** Attaches to the object the numeric value that it represents.
   **  @param val the numeric value represented by the object
   */
   public IntConstant(int val)  { value = val; }

   /** Reports the numeric value attached to the token.
   **  @return the numeric value attached to the token
   */
   public int getValue() { return value; }

}