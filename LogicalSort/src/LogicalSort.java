//Sean Daly
//9/10/12
//CMPS 240

import java.util.*;

	/**
	* A class that constructs a logical sort of an array of objects.
	* Given an array of objects E[] and a comparator c
	* returns an array Integer[], idx, such that if i <= j, E[idx[i]] <= E[idx[j]]
	*/
   public class LogicalSort<E>{
   
      private Comparator<E> c;
   	
   	/**
   	* Class constructor
   	* @param c Comparator for the objects E
   	*/
      public LogicalSort(Comparator<E> c){
         this.c = c;
      }
   
   	/**
   	* Method returns the result of the logical sort
   	* @param elements The array of objects to be logically ordered
   	* @return The array, ans, such that if i <= j, E[ans[i]] <= E[ans[j]]
   	*/
      public ArrayList<Integer>order(ArrayList<E> elements, Integer startIndex, Integer endIndex){
         ArrayList<Integer> ans = new ArrayList<Integer>(elements.size());
         // Complete the method
         for(int i = 0; i<endIndex.intValue(); i++)
         {
            ans.add(i,i);
         }
            
            // Do the logical sort
         int k;
         for(int i = 0; i<elements.size(); i++){
            k = i;
            for(int j=i; j<elements.size(); j++){
               if(c.compare(elements.get(ans.get(j)), elements.get(ans.get(k))) < 0){
                  k = j;
               }
            }
        
            //swap the i and k objects
            Integer temp = ans.get(i); //E tem = elements[i];
            ans.set(i,ans.get(k)); //elements[i] = elements [kea];
            ans.set(k,temp); //elements[kea] = tem;
            //System.out.println(ans.toString());
         }
            
         return ans;
      }
   
   	/**
   	* A private class that contains the logical comprator that will be 
   	* constructed and used by the order method.
   	*/	
      private class LComparator implements Comparator<Integer> {
      	
         private ArrayList<E> elements;
         private Comparator<E> c;
      	
      	/**
      	* Constructor for the logical comparator
      	*/
         private LComparator(ArrayList<E> elements, Comparator<E> c){
            this.elements = elements;
            this.c = c;
         }
      	
         public int compare(Integer left, Integer right){
          	// Complete the return statement
            return  1;
         }
      }
   }