/** An instance of this class represents the binary multiplication operator.
**
**  @author R. McCloskey
**  @version April 2012
*/
public class MultiplyOperator implements BinaryOperator {

   public int apply(Operand x, Operand y)
   {
      return x.getValue() * y.getValue();
   }
}