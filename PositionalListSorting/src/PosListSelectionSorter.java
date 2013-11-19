//Sean Daly
//5/6/12
//CMPS 144
//Prog. Assgn. #5
import java.util.Comparator;

public class PosListSelectionSorter<T> implements PositionalListSorter<T> {
	
	private Comparator<T> comp;
	
	public PosListSelectionSorter(Comparator<T> comparator)
	{
		
		comp= comparator;
	}
	
	   public void sort(PositionalListWithCursors<T> list){
		 
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

	   /** Rearranges the items in the section of the list beginning with the
	   **  position indicated by 'left' and going up to, but not including,
	   **  the position indicated by 'right', so that they are "in order"
	   **  (with respect to some criteria).
	   **  pre: for some i>=0, right.equals(left.toNext()^i)
	   */
	   public void sort(PositionalListCursor<T> left, PositionalListCursor<T> right){
		   
		   PositionalListCursor<T> current = left.clone();
		   PositionalListCursor<T> correctPlace;
		   while(!current.equals(right)){
			   T currentItem = current.getItem();
			   correctPlace = locOfMin(current, right, currentItem);
			   if(!current.equals(correctPlace)){
				   correctPlace.swapItems(current);
				   current.toNext();
			   }   
			   else{
				   current.toNext();
			   }
			   correctPlace.dispose();
		   }
		   current.dispose();
	   }
	   private PositionalListCursor<T> locOfMin(PositionalListCursor<T> left,
               PositionalListCursor<T> right,
               T item)
{
PositionalListCursor<T> scanner = left.clone();
PositionalListCursor<T> min = scanner.clone();

/* loop invariant:
**   all items from left up to but not including scanner are <= item
*/
while (!scanner.equals(right))
{
	if(lessThan(scanner.getItem(), item)){
		min = scanner.clone();
		item = min.getItem();
	}

scanner.toNext();
}
return min;
}


/** Reports whether or not x < y, according to this object's Comparator.
*/
private boolean lessThan(T x, T y) { return comp.compare(x,y) < 0; }

}
