//Sean Daly
//4/10/12
//CMPS 144
//Programming Assignment #3
/** Extends RedBluePartitionerOfInt by defining the isRed() method to classify
**  a value as RED iff its absolute value is prime.
*/
public class PrimeCompositePartitioner extends RedBluePartitionerOfInt {

   /** Returns true iff the specified value is prime.
   */
	/*I fixed the problem with my isRed method using what we went over in class. I realize that
	 *  I overlooked the case where a number could have multiples that are prime, i.e. 13*13 = 169, 
	 *  and thus wouldn't be checked if only values 2...7 were checked.*/
   protected boolean isRed(int k)
   { 
	   k= Math.abs(k);
	   int sqrtOfK =(int)Math.sqrt(k);
	   int cand = 2;
	   while(cand<=sqrtOfK && k%cand!=0)
	   {cand = cand +1;}
	   return cand > sqrtOfK;
}
}
