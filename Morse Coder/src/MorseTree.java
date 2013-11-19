//Sean Daly
//11/5/12
//CMPS 240
//Worked with Tom Esposito

 import scranton.tree.*;
 import java.util.Scanner;
   class MorseTree extends RecursiveBinaryTreeStandard<String> {
   
      MorseTree () {
         super();
      }
   
      MorseTree(String ch){
         super (ch);
      }
   
      public MorseTree emptyTree(){
         return new MorseTree();
      }
   	
      private String recVerify(String Code){
         String Answer = "";
         //System.out.println(Code);
         if (!this.isEmpty()){
            if (!this.getRoot().equals(" ")){
               //System.out.println(((Character)this.root)+":"+Code+"\n");
               Answer += this.getRoot() + ":" + Code+"\n";
            }
            return Answer
               		+ ((MorseTree)this.leftSubtree()).recVerify(Code+".")
               		+ ((MorseTree)this.rightSubtree()).recVerify(Code+"-");
         } 
         else
            return "";
      }
   
      public String verify (){
         return recVerify("");
      }
   
      public void insert(String sym, String Code){
         //System.out.println(sym+":"+Code);
         if (this.isEmpty()){
            this.swap(new MorseTree(" "));
         }
         if (Code.length() == 0){
            this.setRoot(sym);
         } 
         else if (Code.substring(0,1).equals(".")){
            ((MorseTree)this.leftSubtree()).insert(sym, Code.substring(1, Code.length()));
         } 
         else if (Code.substring(0,1).equals("-")){
            ((MorseTree)this.rightSubtree()).insert(sym, Code.substring(1, Code.length()));
         } 
         else {
            assert false: "Bad data "+sym+"\t"+Code;
         }
      
      }
   
      public char translate(String Code){
    	  char symbol = Code.charAt(0);
    	  	if (Code.length() == 1 && symbol =='.'){
    	  		return this.leftSubtree().getRoot().charAt(0);
    	  	} else if (Code.length() == 1 && symbol =='-'){
    	  		return this.rightSubtree().getRoot().charAt(0);
    	  	}
        	 if (symbol == '.'){
        		 return ((MorseTree) this.leftSubtree()).translate(Code.substring(1, Code.length()));
        	 } else if (symbol == '-'){
        		 return ((MorseTree) this.rightSubtree()).translate(Code.substring(1, Code.length()));
        	 } else{ 
        		 return ' ';
        	 }        	 
      }
   }