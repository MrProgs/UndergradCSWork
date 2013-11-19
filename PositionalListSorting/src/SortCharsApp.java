//Sean Daly
//5/6/12
//CMPS 144
//Prog. Assgn. #5
import java.util.Comparator;
import java.util.Scanner;

public class SortCharsApp {
	 public static void main(String[] args)
	   {

	      char[] junk = { 'a', 'g', ';', '+', 'w', ',', 'y', 's','m', 'e', '?', '4', '#', 'q', 'z' };
	      PositionalListWithCursors<Character> list = arrayToList(junk);
	      
	      Comparator<Character> comp = new CharComparator();

	      PositionalListSorter sorter;

	      displayMenu();
	      Scanner input = new Scanner(System.in);
	      int userResponse = input.nextInt();

	      if (userResponse == 1) 
	         { sorter = new PosListInsertionSorter<Character>(comp); }
	      else if (userResponse == 2) 
	         { sorter = new PosListSelectionSorter<Character>(comp); }
	      // else if (userResponse == 3) 
	      //   { sorter = new PosListQuickSorter<Integer>(comp); }
	      else  // if user goofs, make it an InsetionSorter
	         { sorter = new PosListInsertionSorter<Character>(comp); }
	      
	      System.out.println("Before sorting:");
	      System.out.println(list.toString());
	      System.out.println();

	      sorter.sort(list);

	      System.out.println("After sorting:");
	      System.out.println(list.toString());
	   }


	   /* Returns a list containing Character objects corresponding to the
	   *  values in the given array.
	   */
	   private static PosListWithCursorsViaArray<Character> arrayToList(char[] a)
	   {
	      PosListWithCursorsViaArray<Character> result = 
	         new PosListWithCursorsViaArray<Character>(); 

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
