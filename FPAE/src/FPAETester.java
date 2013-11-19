import java.util.Scanner;
import java.io.IOException;

/** Java application that interprets a sequence of FPAE's entered by the
**  user.  For each FPAE entered, it displays the result.
**
**  @author R. McCloskey
**  @version April 2012
*/

public class FPAETester {

   public static void main(String[] args) throws IOException {

      Scanner s = new Scanner(System.in);
      String str;
      FPAE expr;

      while (true) {
         System.out.print("Enter FPAE:");
         str = s.nextLine();
         expr = new FPAE(str);
         System.out.println("= " + expr.evaluate());
      }
   }
}
