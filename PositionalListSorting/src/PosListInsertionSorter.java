import java.util.Comparator;

/** An instance of this class can apply the Insertion Sort algorithm to a given
**  instance of PositionalListWithCursors.
*/
public class PosListInsertionSorter<T> implements PositionalListSorter<T> {

   private Comparator<T> comp;
   
   public PosListInsertionSorter(Comparator<T> comparator)
   {
      comp = comparator;
   }

   public void sort(PositionalListWithCursors<T> list)
   {
      if (list.lengthOf() > 1)
      {
         PositionalListCursor<T> left, right;
         left = list.getCursor().toFront();
         right = list.getCursor().toRear();
         sort(left, right);
         left.dispose();
         right.dispose();
      }
   }

   /** Rearranges into ascending order (with respect to comp) the items
   **  in the section of the list beginning with the left cursor
   **  and going up to, but not including, the right cursor (using the
   **  Insertion Sort algorithm).  The 'left' cursor will end up at
   **  the node holding the minimum item (from the specified portion
   **  of the list).
   **  pre: left.getList() == right.getList() && 
   **       for some i>=0, right.equals(left.toNext()^i).
   */
   public void sort(PositionalListCursor<T> left,
                    PositionalListCursor<T> right)
   {
      PositionalListCursor<T> current = left.clone();

      PositionalListCursor<T> correctPlace;
      
      while (!current.equals(right))
      {
         T currentItem = current.getItem();
         correctPlace = locOfGreater(left, current, currentItem);
         if (!current.equals(correctPlace)) {
            correctPlace.insert(currentItem);
            if (left.equals(correctPlace)) { 
               left.toPrev();
            }
            current.remove();       // current moves to its successor here
         }
         else {
            current.toNext();
         }
         correctPlace.dispose();
      }
      current.dispose();
   }


   /** Returns a cursor indicating the "leftmost" node, among those
   **  from left's position up to, but not including, right's,
   **  that contains an item that is greater than the item specified.
   **  If there are no such nodes, right is returned.
   **  pre: for some i>=0, right.equals(left.toNext()^i)
   */
   private PositionalListCursor<T> locOfGreater(PositionalListCursor<T> left,
                                                PositionalListCursor<T> right,
                                                T item)
   {
       PositionalListCursor<T> scanner = left.clone();
       
       /* loop invariant:
       **   all items from left up to but not including scanner are <= item
       */
       while (!scanner.equals(right)  &&  !lessThan(item, scanner.getItem()))
       {
          scanner.toNext();
       }
       return scanner;
   }


   /** Reports whether or not x < y, according to this object's Comparator.
   */
   private boolean lessThan(T x, T y) { return comp.compare(x,y) < 0; }

}