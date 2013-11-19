// Sean Daly
// 3/31/12
// CMPS 144
// Lab #1
import java.util.Scanner;

/** CMPS 144  Lab Assignment: Multiplication via Recursion
*/

public class RecMultLab {

   private static int callCntr;

   public static void main(String[] args) 
   {
      Scanner stdin = new Scanner(System.in);

      while (true) {

         print("Enter two natural numbers: ");
         int a = stdin.nextInt();  // read first input
         int b = stdin.nextInt();  // read second input
         callCntr = 0;             // holds # calls made to productOf()
         int c = productOf(a, b);  // call recursive method to compute a*b

         if (c == a*b)
            { print("Your productOf method correctly calculated "); }
         else  {
            println("The correct calculation is " +
                    a + " * " + b + " = " + a*b);
            print("Unfortunately, your productOf() method says ");
         }
         println(a + " * " + b + " = " + c);
         println("   Number of calls to productOf() = " + callCntr);
         println("");
      }
   }

   /* pre:  m >=0  &&  n >= 0
      post: value returned is product of m and n
   */
   static int productOf(int m, int n)
   {
      callCntr = callCntr + 1;  // keep this line
      if( m == 0){ return 0;}
      else { return n+ productOf(m-1, n);}
   }
static int productOfFaster(int m, int n){
	callCntr = callCntr +1;
	if(m == 0){return 0;}
	else if(m%2 == 0){ return productOfFaster(m/2, n+n);}
	else {return n + productOfFaster((m-1)/2, n+n);}
}

   /** Surrogate for System.out.print()
   */
   private static void print(String s) { System.out.print(s); }

   /** Surrogate for System.out.println()
   */
   private static void println(String s) { System.out.println(s); }
}
