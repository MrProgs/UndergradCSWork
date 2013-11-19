import java.util.ArrayList;
import java.util.Iterator;

/** An instance of this class represents a fully-parenthesized arithmetic
**  expression (FPAE).
**
**  @author R. McCloskey
**  @version April 2012
*/

public class FPAE {

   private ArrayList<Token> tokenList;  // holds the sequence of tokens
                                        // (parentheses, operators, operands)
                                        // that form the FPAE

   /** Forms the FPAE object described by the given string, which is
   **  tokenized into its syntactic elements by an instance of the
   **  FPAETokenize class.  (Hence, the syntactic validity of each
   **  token is determined by FPAETokenize.)
   **  If the string is not syntactically valid, an IllegalArgumentException 
   **  is thrown.
   */
   public FPAE(String s) 
   { 
      Iterator<Token> iter = new FPAETokenizer(s);
      tokenList = new ArrayList<Token>();
      while (iter.hasNext())
      {
         tokenList.add(iter.next());
      }

      if (!hasValidSyntax()) {
         throw new IllegalArgumentException("FPAE syntax is invalid.");
      }
   }


   /** Reports whether or not the FPAE's syntactic structure is valid.
   **  To be valid, the sequence of Token objects forming the FPAE must be
   **  either
   **  (1) a single Operand, or
   **  (2) of the form 
   **
   **        <LeftParen> E <BinaryOperator> F <RightParen>
   **
   **      where each of E and F is a token sequence forming an FPAE.
   **
   **  Restrictions on the application of certain binary operators
   **  may also come into play.  For example, the left operand of an
   **  assignment operator is restricted to be an identifier.
   */
   private boolean hasValidSyntax()
   {
      return true;    // STUB!!
   }


   /** Evaluates the FPAE and returns the result.
   **  pre: hasValidSyntax()
   */
   public int evaluate() {

      Stack<Operand> operandStk = new StackViaArray<Operand>();
      Stack<BinaryOperator> operatorStk = new StackViaArray<BinaryOperator>();

      for (int i=0; i != tokenList.size(); i++)
      {
         Token t = tokenList.get(i);

         if (t instanceof LeftParen) 
         {
            // do nothing
         }
         else if (t instanceof Operand)
         { 
            operandStk.push((Operand)t);
         }
         else if (t instanceof BinaryOperator)
         { 
            operatorStk.push((BinaryOperator)t);
         }
         else if (t instanceof RightParen)
         {
            Operand y = operandStk.topOf();
            operandStk.pop();
            Operand x = operandStk.topOf();
            operandStk.pop();
            BinaryOperator op = operatorStk.topOf();
            operatorStk.pop();
            int z = op.apply(x, y);
            operandStk.push(new IntConstant(z));
         }
         else {
            System.out.println("WARNING: Unknown type of token!!");
         }
      }   
      return operandStk.topOf().getValue();
   }

}