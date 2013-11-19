/** An instance of a concrete subclass represents a binary operator that,
**  given two Operand objects, yields an int.
**
**  @author R. McCloskey
**  @version April 2012
*/
public interface BinaryOperator extends Token {

   /** Applies the operator to the two operands and returns the result.
   **  @param x the first operand
   **  @param y the second operand
   **  @return the result of applying the operator to the specified operands
   */
   int apply(Operand x, Operand y);

}