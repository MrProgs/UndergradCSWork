//Sean Daly
//02/23/12
//CMPS 144
//Prog. Assg. #1
//Errors: pastToss is flawed. So is historyLength. This needs fixing! 
   public class Coin2WithCounters3AndHistory extends Coin2WithCounters3 {
   
      private boolean[] history; 
      private int historyIndex = 0; //used in toss() to fill indices.
   											
   											
   // Creates Coin2WithCounters3AndHistory object.  
   
      public Coin2WithCounters3AndHistory(int histCap) {
         super();
         history = new boolean[histCap]; 
      }
   
   //Returns the length of the history array.
   
      public int historyCapacity() {
         return history.length;
      }
   
   //Returns the number of tosses recorded.
   
      public int historyLength() {
         return historyCapacity();
      }
   
   //Returns the indicated past toss.    
      public boolean pastToss (int k){
         int past = k%historyCapacity();      
         return history[past];            
      }
   	
   //Tosses the coin.
   	
      public void toss(){
         super.toss();     
         if(historyIndex<historyCapacity()){
            history[historyIndex] = faceUp();  	
         }
         else {
            historyIndex = historyIndex%historyCapacity();
            history[historyIndex] = faceUp();
         }
         historyIndex = historyIndex+1;
      }
   }