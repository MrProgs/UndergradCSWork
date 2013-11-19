//Sean Daly
//4/3/12
//CMPS 144
//Programming Assignment #3
/** An instance of a concrete subclass of this abstract Java class can, via
**  either of its partitionX() (X=1,2) methods, partition an array of int's
**  into RED and BLUE (i.e., non-RED) segments.  The concrete subclass is
**  responsible for providing the method isRed() that reports whether or not
**  a given int value is RED.
**
**  To illustrate the idea, one can imagine the following classification
**  schemes, any of which could be implemented by a class extending this one.
**  RED: odd, BLUE: even
**  RED: prime, BLUE: composite
**  RED: negative, BLUE: non-negative
**  RED: less than some x; BLUE: greater than or equal to x
*/
public abstract class RedBluePartitionerOfInt {
	/** Reports whether or not the given value is classified as being RED.
	   */
	   protected abstract boolean isRed(int z);

	   /** Reports whether or not the given value is classified as being BLUE
	   **  (i.e., non-RED).
	   */
	   private boolean isBlue(int z) { return !isRed(z); }


	   /** Rearranges the elements of b[] so that all RED values come before
	   **  any BLUE values, and returns the location at which the BLUE segment
	   **  begins.  That is, letting k be the number of RED values in b, the
	   **  method ends with the RED values in b[0..k-1] and the BLUE values in
	   **  b[k..b.length-1], and k is the value returned.
	   */
	   public int partition1(int[] b)
	   {
	      int k = 0, m = 0;

	      /* loop invariant:
	      ** 0<=k<=m<=b.length  &&  segmentIsRed(b,0,k) &&  segmentIsBlue(b,k,m)
	      */
	      while (m != b.length)
	      {
	         assert loopInvariant1Verbose(b,k,m);

	         if (isRed(b[m])) {
	            swap(b,k,m);
	            k = k+1;
	         }
	         m = m+1;
	      }
	      assert loopInvariant1Verbose(b,k,m);
	      return k;
	   }


	   /** Returns true if and only if 0<=k<=m<=b.length &&
	   **  segmentIsRed(b,0,k)  &&  segmentIsBlue(b,k,m),
	   **  corresponding to the loop invariant in partition1().
	   */
	   private boolean loopInvariant1(int[] b, int k, int m)
	   {
	      return 0 <= k  &&  k <= m  &&  m <= b.length  &&
	             segmentIsRed(b,0,k)  &&  segmentIsBlue(b,k,m);
	   }

	   /** Verbose version of the method above, it serves a similar purpose but
	   **  displays a warning message for each conjunct of the loop invariant
	   **  that fails to hold.
	   */
	   private boolean loopInvariant1Verbose(int[] b, int k, int m)
	   {
	      String message = "WARNING: Loop invariant violation!";
	      boolean result = true;

	      if (k < 0) {
	         result = false;
	         println(message + "\n  k = " + k + " is less than zero!");
	      }
	      if (k > m) {
	         result = false;
	         println(message + "\n  k = " + k + " is greater than m = " + m);
	      }
	      if (m > b.length) {
	         result = false;
	         println(message + "\n  m = " + m +
	                 " is greater than b.length = " + b.length);
	      }
	      if (!segmentIsRed(b,0,k)) {
	         result = false;
	         println(message + "\n  Red segment is not all red: " +
	                 arraySegToString(b,0,k));
	      }
	      if (!segmentIsBlue(b,k,m)) {
	         result = false;
	         println(message + "\n  Blue segment is not all blue: " +
	                 arraySegToString(b,k,m));
	      }
	      return result;
	   }


	   /** Rearranges the elements of b[] so that all RED values come before
	   **  any BLUE values, and returns the location at which the BLUE segment
	   **  begins.  That is, letting k be the number of RED values in b, the
	   **  method ends with the RED values in b[0..k-1] and the BLUE values in
	   **  b[k..b.length-1], and k is the value returned.
	   */
	   public int partition2(int[] b)
	   {
		   int k = 0; int m = b.length;
		   while(k!=m){
			   assert loopInvariant2Verbose(b,k,m);
			   if(isBlue(b[m-1])){
				   m= m-1;
			   }else{swap(b,k,m-1); k = k+1;}
			   }
		   assert loopInvariant2Verbose(b,k,m);
		   return k;
		   }
	      
	   

	   /** Returns true if and only if 0<=k<=m<=b.length &&
	   **  segmentIsRed(b,0,k)  &&  segmentIsBlue(b,m,b.length),
	   **  corresponding to the loop invariant in partition2().
	   */
	   private boolean loopInvariant2(int[] b, int k, int m)
	   {
	      return 0<=k && k<=m && m<=b.length && 
	    		  segmentIsRed(b,0,k) && segmentIsBlue(b,m,b.length-1);
	   }

	   /** Verbose version of the method above, it serves a similar purpose but
	   **  displays a warning message for each conjunct of the loop invariant
	   **  that fails to hold.
	   */
	   private boolean loopInvariant2Verbose(int[] b, int k, int m)
	   { 
		  String message = "WARNING: Loop invariant violation!";
	      boolean result = true;

	      if (k < 0) {
	         result = false;
	         println(message + "\n  k = " + k + " is less than zero!");
	      }
	      if (k > m) {
	         result = false;
	         println(message + "\n  k = " + k + " is greater than m = " + m);
	      }
	      if (m > b.length) {
	         result = false;
	         println(message + "\n  m = " + m +
	                 " is greater than b.length = " + b.length);
	      }
	      if (!segmentIsRed(b,0,k)) {
	         result = false;
	         println(message + "\n  Red segment is not all red: " +
	                 arraySegToString(b,0,k));
	      }
	      if (!segmentIsBlue(b,m,b.length)) {
	         result = false;
	         println(message + "\n  Blue segment is not all blue: " +
	                 arraySegToString(b,m,b.length));
	      }
	      return result;
	   }


	   /*** u t i l i t y   m e t h o d s ***/

	   /** Swaps the values at the specified locations (i and j) in the
	   **  specified array (a).
	   */
	   private void swap(int[] a, int i, int j)
	   { 
	      int temp = a[i]; a[i] = a[j]; a[j] = temp;
	   }


	   /** Returns true iff every element in the specified array segment
	   **  (namely, a[u..v-1]) is RED.
	   **  pre: 0<=u<=v<=a.length
	   */
	   private boolean segmentIsRed(int[] a, int u, int v) {

	      int i = u;
	      // loop invariant: u<=i<=v  &&  a[u..i-1] is RED
	      while (i != v  &&  isRed(a[i])) {
	         i = i+1;
	      }
	      return i == v;
	   }

	   /** Returns true iff every element in the specified array segment
	   **  (namely, a[u..v-1]) is BLUE.
	   **  pre: 0<=u<=v<=a.length
	   */
	   private boolean segmentIsBlue(int[] a, int u, int v) {

	      int i = u;
	      // loop invariant: u<=i<=v  &&  a[u..i-1] is BLUE
	      while (i != v  &&  isBlue(a[i])) {
	         i = i+1;
	      }
	      return i == v;
	   }


	   /** Returns a string enumerating the values in a[left..right-1].
	   **  pre: 0<=left<=right<=a.length
	   */
	   private String arraySegToString(int[] a, int left, int right)
	   {
	      String result = "";
	      for (int i = right; i != left; i--) {
	         result = a[i-1] + " " + result;
	      }
	      return result;
	   }


	   /** Surrogate for System.out.print() */
	   private void print(String str) { System.out.print(str); }

	   /** Surrogate for System.out.println() */
	   private void println(String str) { System.out.println(str); }

}
