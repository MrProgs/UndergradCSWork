import java.util.Iterator;

/** An instance of this class tokenizes a string (that is purported to be
**  an FPAE) into its atoms, which include parentheses, integer constants,
**  operators (e.g., +, -, etc.)
**
**  @author R. McCloskey
**  @version April 2012
*/

public class FPAETokenizer implements Iterator<Token> {

   /*  instance variables  */

   private String exprStr;  // string being tokenized
   private int k;           // acts as the "cursor", i.e., the position
                            // within exprStr at which the "next" token begins

   public FPAETokenizer(String str) 
   { 
      exprStr = str;
      k = 0;
      advanceToNextToken();
   }


   public boolean hasNext() { return k != exprStr.length(); }

   public Token next() 
   { 
      Token result = nextToken();
      advanceToNextToken();
      return result;
   }

   public void remove()
   {
      throw new UnsupportedOperationException("remove() not supported");
   }


   /* Advances the cursor (k) until it arrives either at the end of 
   ** exprStr or at a non-white-space character therein.
   */
   private void advanceToNextToken()
   {
      while (k != exprStr.length() && Character.isWhitespace(exprStr.charAt(k)))
         { k++; }
   }


   /* Identifies the token that begins at the cursor's (k's) position,
   ** advances the cursor to the position immediately following that token,
   ** and returns a Token object representing that token.  If the token
   ** cannot be identified, null is returned.
   ** pre: 0 <= k < exprStr.length()
   **
   ** NOTE: The kinds of tokens recognized here include only parentheses
   ** (left and right), the four basic arithmetic operators (+, -, *, and /),
   ** and integer literals.  For the assignment, the student is to add code
   ** for recognizing the exponentiation operator (^), relational operators
   ** (==, !=, <, >, <=, >=), boolean/logical operators (&&, ||), the
   ** assignment operator (=), and identifiers of the form xN, where N is a
   ** one- or two-digit decimal numeral (e.g., x35).
   */
   private Token nextToken()
   {
      Token result;
      char ch = exprStr.charAt(k);

      if (ch == '(') {
         result = new LeftParen();
         k++;
      }
      else if (ch == ')') {
         result = new RightParen();
         k++;
      }
      else if (ch == '+') {
         result = new AddOperator();
         k++;
      }
      else if (ch == '-') {
         result = new SubtractOperator();
         k++;
      }
      else if (ch == '*') {
         result = new MultiplyOperator();
         k++;
      }
      else if (ch == '/') {
         result = new DivideOperator();
         k++;
      }
      else if(ch == '^'){
    	  	result = new PowerOperator();
    	  	k++;
      }
      else if(ch == '=' && exprStr.charAt(k+1) == '='){
    	  	result = new EqualOperator();
    	  	k = k+2;
      }
      else if(ch == '!'){
    	  	result = new NotEqualOperator();
    	  	k = k+2; 
      }
      else if(ch == '<' && exprStr.charAt(k+1) != '='){
    	  	result = new LessThanOperator();
    	  	k++;
      }
      else if(ch == '<' && exprStr.charAt(k+1) == '='){
    	  	result = new LessThanOrEqualOperator();
    	  	k = k+2;
      }
      else if(ch== '>' && exprStr.charAt(k+1) != '='){
    	  	result = new GreaterThanOperator();
    	  	k++;
      }
      else if(ch=='>' && exprStr.charAt(k+1) == '='){
    	  result = new GreaterThanOrEqualOperator();
    	  k = k+2;
      }
      else if(ch =='&'){
    	  	result = new AndOperator();
    	  	k = k+2;
      }
      else if(ch == '|'){
    	  	result = new OrOperator();
    	  	k = k+2;
      }else if(ch == 'x'){
      
    	 k++;
    	  int p = k;
    	  while( p != exprStr.length() && Character.isDigit(exprStr.charAt(p))){
    		  p++;
    	  }
    	  int identifierNum = Integer.parseInt(exprStr.substring(k, p));
    	  result = new Identifier(identifierNum);
    	  k= p;
      }
      else if(ch == '='){
    	  result = new AssignOperator();
    	  k++;
      }
      else if (Character.isDigit(ch)) {   // must be an integer literal
         int m = k+1;
         // find the end of the integer literal
         while (m != exprStr.length() && Character.isDigit(exprStr.charAt(m)))
         { 
            m++;
         }
         // int literal is exprStr[k..m-1]; compute its numeric value
         int value = Integer.parseInt(exprStr.substring(k,m));
         result = new IntConstant(value);
         k = m;
      }
      else {  // can't recognize this token
         result = null;
      }

      return result;
   }

}