//Sean Daly
//3/5/12
//CMPS 144
//Prog.Assgn. #2
import java.util.*;
   public class NSidedDie {
   
   /****  instance variables  ****/
      private int sidesOfDie;
      private int tossCount = 0;
      private double dieSides[];
      private int tossCounter[];
      private double upperBounds[];
      private int spot = 1;
      private int index = 0;
      private int faceUp;
   
   
   
   /****  constructors  ****/
   
   /** Initializes the die so that it behaves as a fair, six-sided die.
   */
      public NSidedDie() {
    	  this(6);
      } 
   
   
   /** Initializes the die so that it behaves as a fair die having
   **  the specified number of sides.  (If the specified number is
   **  not positive, an IllegalArgumentException is thrown.)
   */
      public NSidedDie(int numSides) { 
         sidesOfDie = numSides;
         dieSides = new double[sidesOfDie];
         tossCounter=new int[sidesOfDie];
        
         while(dieSides.length != index){  
            dieSides[index] = index + 1;
            index++;
         }
         upperBounds = new double[sidesOfDie];
         upperBounds[0] = dieSides[0]/sidesOfDie;
         while(dieSides.length != spot){
        	 upperBounds[spot] = dieSides[spot]/sidesOfDie;
        	 spot++;
         }
      }
   
   
   /** Initializes the die so that it behaves as one having N sides,
   **  where N is the length of the specified array, and where the
   **  relative likelihoods of its toss outcomes are specified by the
   **  values in the array elements.
   **  For example, if the array contains (2.0, 1.0, 5.0), the
   **  constructed die will have three sides (corresponding to toss
   **  outcomes 1, 2, and 3) with probabilities of, respectively,
   **  2/8, 1/8, and 5/8 (note that 8 is the sum of 2.0, 1.0, and 5.0).
   ** 
   **  (If the array length is zero or any of its elements has a
   **  negative value, an IllegalArgumentException is thrown.)
   */
      public NSidedDie(double[] relProb) {
    	  if(relProb.length == 0){
    		throw new IllegalArgumentException("array length = 0.");  
    	  }
    	  int e = 0;
    	  while(e<= relProb.length-1){
    		  if(relProb[e] < 0){
    			  throw new IllegalArgumentException("Negative value at index " + e + " in array.");
    		  }
    		  e++;
    	  }
         sidesOfDie = relProb.length;
         tossCounter=new int[sidesOfDie];
         double sum =0;
         for(int w =0; w<=sidesOfDie-1; w++){
        	 sum = sum + relProb[w];
         }
         upperBounds = new double[sidesOfDie];
         upperBounds = relProb;
         upperBounds[0] = upperBounds[0]/sum;
         while(upperBounds.length != spot){
        	 upperBounds[spot] = upperBounds[spot]/sum;
        	 upperBounds[spot] = upperBounds[spot] + upperBounds[spot-1];
        	 spot++;
         }
      } 
   
   
   
   /****  observers  ****/
   
   
   /** Returns the number of sides that the die has.
   */
      public int numSides() { 
         return sidesOfDie; 	
      }   
   
   
   /** Returns the result of the most recent toss of the die.
   */
      public int faceUp() { 
         return faceUp; 
      }    
   
   
   /** Returns the # of past tosses that produced k as the outcome.
   **  If 0<k<=numSides() is false, IllegalArgumentException is thrown.
   */
      public int tossCount(int k) {
    	  return tossCounter[k-1];
      }  
   
   
   /** Returns the total # of past tosses of the die.
   */
      public int tossCount() { 
         return tossCount; 
      } 
   
   
   /** Returns a string that describes the die's state.
   */
      public String toString() { 
    	  int conciseHistory[] = new int[sidesOfDie];
    	  for(int q = 0; q <= sidesOfDie-1; q++){
    		  conciseHistory[q] = tossCounter[q];
    	  }
         return Arrays.toString(conciseHistory); 
      }  
   
   
   /****  mutator  ****/
   
   /** Tosses the die.
   */
      public void toss() {
    	  double x = Math.random();
         int s = 0;
         while( x >= upperBounds[s]){
            s = s + 1;
         }      
         tossCounter[s] = tossCounter[s]+1;
         tossCount = tossCount + 1;
         faceUp = s+1;
      }
   
   }

