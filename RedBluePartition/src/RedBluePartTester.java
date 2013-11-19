import java.util.Scanner;

/** Java application whose purpose is to test the abstract class 
**  RedBluePartitionerOfInt as well as a few of its concrete subclasses.
*/
public class RedBluePartTester {


   public static void main(String[] args) {

      RedBluePartitionerOfInt p; 

      System.out.println("Classify by RED:even/BLUE:odd (1)");
      System.out.println("Classify by RED:negative/BLUE:nonnegative (2)");
      System.out.println("Classify by RED:prime/BLUE:composite (3)");
      System.out.print(">");
      Scanner s = new Scanner(System.in);
      int response = s.nextInt();
      if (response == 1) 
         { p = new EvenOddPartitioner(); }
      else if (response == 2) 
         { p = new SmallBigPartitioner(0); }
      else if (response == 3) 
         { p = new PrimeCompositePartitioner(); }
      else {
         System.out.println("Invalid response; will classify by even/odd");
         p = new EvenOddPartitioner(); 
      }

      int[] x = { 3, -4, 7, 13, -2, -5, 64, 13, 0, 41, -22, 23, 44 };

      System.out.print("Array elements: ");
      displayArraySegment(x, 0, x.length);
      System.out.println();

      // partition x[] into red/blue segments
      //int r = p.partition1(x);     // student should comment out this line!!
      int r = p.partition2(x);   // student should use this line!!

      System.out.print("Red elements: ");
      displayArraySegment(x, 0, r);
      System.out.println();

      System.out.print("Blue elements: ");
      displayArraySegment(x, r, x.length);
      System.out.println();
   }


   private static void displayArraySegment(int[] z, int u, int v)
   {
      for (int i=u; i != v; i++) 
         { System.out.print(z[i] + " "); }
   }

}