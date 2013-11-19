import java.util.Scanner;
   public class NSidedDieTester{
      public static void main(String[] args){
         System.out.println("NSidedDie Tester, Ver.1. Lets hope this works!");
         //double f[] = new double[7];
         //f[0] = 1.0; f[1] = 1.5; f[2] = 0.5; f[3] = 2.0; f[4] = 0.25; f[5] = 0.75; f[6] = 2.0;
         NSidedDie dicey = new NSidedDie(20);
         System.out.println("Let's roll that die!");
         System.out.println("How many times should we roll it?");
         Scanner input = new Scanner(System.in);
         int r = input.nextInt();
         for(int s = 1; s<=r; s++){
            //dicey.toss();
            System.out.println("Toss # " + (s) + " is " + dicey.faceUp());
            System.out.println("This last toss was a " + dicey.faceUp());
            }
         System.out.println("This die has " + dicey.numSides() + " sides.");
         System.out.println("Die History: "); 
         System.out.println(dicey.toString());
         System.out.println("This die has been tossed " + dicey.tossCount() + " times.");
         System.out.println("What roll would you like to know the count of?");
         int b = input.nextInt();
         System.out.println(b + " was tossed " + dicey.tossCount(b) + " times");
      }
   }
