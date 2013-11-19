
public interface PositionalListSorter<T> {

   /** Rearranges the items in the given list so that they are "in order"
   **  (with respect to some criteria).
   */
   void sort(PositionalListWithCursors<T> list);

   /** Rearranges the items in the section of the list beginning with the
   **  position indicated by 'left' and going up to, but not including,
   **  the position indicated by 'right', so that they are "in order"
   **  (with respect to some criteria).
   **  pre: for some i>=0, right.equals(left.toNext()^i)
   */
   void sort(PositionalListCursor<T> left, PositionalListCursor<T> right);
}