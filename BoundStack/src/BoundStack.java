/*
*	Name: Sean Daly
*  Date: 10/3/12
*  CMPS 240
*  
* Who did you work with: Tom Esposito
*
*
*
* Who helped you?
* How: Tom Esposito helped write the Test program and BoundStack class.
*
*
*
* Who did you help?
* How: I helped Tom Esposito. 
*
*
*
*/

   public class BoundStack<E> {
   
      private Integer topID;
   
      private Object[] Stack;
   
      public BoundStack(Integer MaxSize){
      // Java can't handle generic arrays
      //  so you have to do type casting when moving items out of the array
         this.Stack = new Object[MaxSize];
      
      // Bottom of the array represents the bottom of the stack.
         this.topID = MaxSize-1;
      }
   
      public Boolean isEmpty(){
         return topID == null;
      }
   
      public Boolean isFull(){
         return topID == 0;
      }
   
      public void push(E element){
    	  	topID = topID-1;
    	  	Stack[topID] = element;
    	  	
      }
   
      public E pop(){
      // Perform an assert if the stack is empty
         assert topID != null;
         E temp = (E) Stack[topID];
         Stack[topID] = null;
         topID = topID+1;
         return temp;
      }
   
      public E topOf(){
      // Perform an assert if the stack is empty
         assert topID != null;
         return (E) Stack[topID];
      }
   
   }