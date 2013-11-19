//Sean Daly with assistance from Tom Esposito
//10/312
//CMPS 240
import scranton.visual.*;
   import java.awt.*;
   import javax.swing.*;
   import java.awt.event.*;

   public class SignalFlagTest {
   
      public static void main(String[] argv){
         VJFrame fr = new VJFrame("Signal Flag Test");
         SignalFlag flag = new SignalFlag(fr);
         flag.FirstSub(320, 50, 120);
         flag.FirstSub(20, 50, 50);
         flag.FirstSub(120, 50, 75);
         flag.FirstSub(220, 50, 100);
      
         flag.SecondSub(20, 200, 100);
         flag.SecondSub(120, 200, 75);
         flag.SecondSub(220, 200, 50);
         flag.SecondSub(320, 200, 25);
      
         flag.ThirdSub(20, 450, 25);
         flag.ThirdSub(120, 450, 50);
         flag.ThirdSub(220, 450, 75);
         flag.ThirdSub(320, 450, 100);
      
         flag.FourthSub(20, 300, 100);
         flag.FourthSub(120, 300, 75);
         flag.FourthSub(220, 300, 50);
         flag.FourthSub(320, 300, 25);
      	
         flag.D(450, 20, 100);
         flag.D(450, 140, 75);
         flag.D(450, 220, 50);
         flag.D(450, 280, 25);
         
         flag.U(600, 20, 100);
         flag.U(600, 140, 75);
         flag.U(600, 220, 50);
         flag.U(600, 280, 25);
         
         flag.M(750, 20, 100);
         flag.M(750, 140, 75);
         flag.M(750, 220, 50);
         flag.M(750, 280, 25);
         
      }
   
   }