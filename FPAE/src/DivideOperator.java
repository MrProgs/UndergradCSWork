/** An instance of this class represents the binary division operator.
**
**  @author R. McCloskey
**  @version April 2012
*/
public class DivideOperator implements BinaryOperator {

   public int apply(Operand x, Operand y)
   {
      return x.getValue() / y.getValue();
   }
}