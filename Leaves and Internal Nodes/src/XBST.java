//Sean Daly
//CMPS 240
//11/20/12
//Worked with Tom Esposito.

   import scranton.tree.*;
   import java.util.*;
   import java.io.*;

 
   public class XBST extends BinarySearchTree<Integer>{
	   int Lcount =0; //field used in counting leaf nodes.
	   int Icount =0; // field used in counting internal nodes.
	   
      public XBST(Comparator<Integer> c){
         super(c);
      }
   
      public XBST(Integer r, Comparator<Integer> c){
         super(r, c);
      }
   
      public XBST emptyTree(){
         return new XBST(this.c);
      }
   
      public XBST nonEmptyTree(Integer r){
         return new XBST(r, this.c);}
   
      public Integer leafCount(){
    	  if(this.leftSubtree().isEmpty() && this.rightSubtree().isEmpty()){ //if the tree has empty subtrees, then this is a leaf node and Lcount is incremented by 1.
    		  Lcount = Lcount +1;
    	  }
    	  else if(!this.leftSubtree().isEmpty()){
    	  		Lcount = Lcount+ ((XBST) this.leftSubtree()).leafCount(); //recursively calls leafCount until a node with an empty left subtree is found.
    	  		}
    	  		if (!this.rightSubtree().isEmpty()){
    	  			Lcount = Lcount+ ((XBST) this.rightSubtree()).leafCount();//recursively calls leafCount until a node with an empty right subtree is found.
    	  		}
    	  		
    	  	return Lcount; //recursively return the value of Lcount so as to sum up the total number of leaf nodes.
    }
   
      public Integer internalCount(){
    	  	if(!this.leftSubtree().isEmpty() || !this.rightSubtree().isEmpty()){ //first we must check whether or not this tree is empty. If it isn't then we add one to the count since it isn't a leaf node.
    	  		Icount = Icount +1;
    	  		if(!this.leftSubtree().isEmpty()){
    	  			Icount = Icount + ((XBST)this.leftSubtree()).internalCount();//since the tree isn't empty, we must check to see which branch is non empty, so we check the left subtree.
    	  		}																							  // and we recursively add to Icount as we find more internal nodes.
    	  		if(!this.rightSubtree().isEmpty()){
    	  			Icount =Icount + ((XBST)this.rightSubtree()).internalCount();//then we check the right subtree and recursively add to Icount as we find more internal nodes.
    	  		}
    	  	}
    	  	
    	  return Icount; //if both the left and right sub tree are empty, then this is a leaf node and so we add 0 to Icount and recursively return the value of Icount to sum up the total 
      }						// number of internal nodes.
   }
   