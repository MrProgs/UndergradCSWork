/*
*	Name: Sean Daly
*	Date: 10/4/12
*	CMPS 240
*
* Who did you work with: Tom Esposito
*
*
*
* Who helped you? Tom Esposito
* How: He helped figure out how to implement several methods.
*
*
*
* Who did you help? Tom Esposito
* How: I helped figure out several of the method implementations.
*
*
*
*/

   import java.util.*;

   public class QueueViaArrayList<E> extends ArrayList<E>{
	   
	  
      public QueueViaArrayList(){
         super();
      }
   
   /**
   * Timing: constant
   */	
      public boolean isEmpty(){
         return super.size() == 0;
      }
   	
   /**
   * Timing: constant
   */	
      public void insert(E element){
    	  	if (this.isEmpty()){
    	  		super.add(element);
    	  	}
    	  	else{
    	  		super.add(element);
    	  	}
      }
   	
   /**
   * Timing: constant 
   */	
      public E remove(){
    	  	assert this.isEmpty();
    	  	E temp = super.get(0);
      	super.remove(0);
        return temp ;
      }
   	
   /**
   * Timing: constant
   */	
      public E front(){
    	  	assert this.isEmpty();
    	  	return super.get(0);
      
      }
   
   }