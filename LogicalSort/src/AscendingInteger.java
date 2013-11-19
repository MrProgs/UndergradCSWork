   import java.util.Comparator;

    public class AscendingInteger implements Comparator<Integer> {
   
       public int compare(Integer left, Integer right){
		 	// makes direct use of the natural order relation - Comparable's compareTo
         return left.compareTo(right);

      }
   }