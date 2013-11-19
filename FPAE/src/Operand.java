/** An instance of a concrete subclass represents an operand that
**  represents an integer value.
**
**  @author R. McCloskey
**  @version April 2012
*/
public interface Operand extends Token {

   /** Reports the value of the operand.
   **  @return the value of the operand
   */
   int getValue();

}