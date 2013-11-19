/** An instance of this class represents the binary subtract operator on two
**  operands representing int values.
**
**  @author R. McCloskey
**  @version October 2008
*/
public class SubtractOperator implements BinaryOperator {

   public int apply(Operand x, Operand y) {
      return x.getValue() - y.getValue();
   }
}