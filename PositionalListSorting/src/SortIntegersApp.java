import java.util.Comparator;
import java.util.Scanner;

/** Java application for the purpose of testing classes that implement the
**  PositionalListSorter interface.
*/
public class SortIntegersApp {

   public static void main(String[] args)
   {

      int[] junk = { 45, 12, 15, -4, 0, 43, 10, 8, 55, -1, 9, 33, 7, -12, 12 };
      PositionalListWithCursors<Integer> list = arrayToList(junk);
      
      Comparator<Integer> comp = new IntegerComparator();

      PositionalListSorter sorter;

      displayMenu();
      Scanner input = new Scanner(System.in);
      int userResponse = input.nextInt();

      if (userResponse == 1) 
         { sorter = new PosListInsertionSorter<Integer>(comp); }
      else if (userResponse == 2) 
         { sorter = new PosListSelectionSorter<Integer>(comp); }
      // else if (userResponse == 3) 
      //   { sorter = new PosListQuickSorter<Integer>(comp); }
      else  // if user goofs, make it an InsetionSorter
         { sorter = new PosListInsertionSorter<Integer>(comp); }
      
      System.out.println("Before sorting:");
      System.out.println(list.toString());
      System.out.println();

      sorter.sort(list);

      System.out.println("After sorting:");
      System.out.println(list.toString());
   }


   /* Returns a list containing Integer objects corresponding to the
   *  values in the given array.
   */
   private static PosListWithCursorsViaArray<Integer> arrayToList(int[] a)
   {
      PosListWithCursorsViaArray<Integer> result = 
         new PosListWithCursorsViaArray<Integer>(); 

      PositionalListCursor c = result.getCursor();
      for (int i = 0; i != a.length; i++) {
         c.insert(a[i]);
      }
      return result;
   }

   private static void displayMenu()
   {
      System.out.println("(1) Insertion Sort");
      System.out.println("(2) Selection Sort");
      //System.out.println("(3) Quick Sort");
      System.out.println();
      System.out.print("Enter your choice: ");
   }

}