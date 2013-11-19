   import java.util.Comparator;

    public class DescendingInteger implements Comparator<Integer> {
   
       public int compare(Integer left, Integer right){
         return right.compareTo(left);
      }
   }