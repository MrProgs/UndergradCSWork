/** An instance of this class represents a binary addition operator.
**
**  @author R. McCloskey
**  @version April 2012
*/
public class AddOperator implements BinaryOperator {

   public int apply(Operand x, Operand y)
   {
      return x.getValue() + y.getValue();
   }
}