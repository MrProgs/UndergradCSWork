//Sean Daly with assistance from Tom Esposito
//10/3/12
//CMPS 240
import scranton.visual.*;
   import java.awt.*;
   import javax.swing.*;
   import java.awt.event.*;


   public class SignalFlag {
   
      VJFrame f;
   	
      public SignalFlag(VJFrame f){
         this.f = f;
      }
   	
      public void A(int x, int y, int size){
      
         f.add(new JRectangle(x, y, size, size, Color.white, Color.white), 50);
      
         JPolygon BluePart = new JPolygon(Color.blue, Color.blue);
			BluePart.addPoint(x+size*50/100, y);
			BluePart.addPoint(x+size*100/100, y);
			BluePart.addPoint(x+size*75/100, y+size*50/100);
			BluePart.addPoint(x+size*100/100, y+size*100/100);
			BluePart.addPoint(x+size*50/100, y+size*100/100);
         f.add(BluePart, 50);
      }
   	
      public void B(int x, int y, int size){
      	
      }
   	
      public void C(int x, int y, int size){
      	
      }
   	
      public void D(int x, int y, int size){
    	  f.add(new JRectangle(x, y, size, size, Color.yellow, Color.yellow), 100);
      	
    	  JPolygon BlueRectangle = new JPolygon(Color.blue, Color.blue);
    	  	BlueRectangle.addPoint(x, y+size*20/100);
    	  	BlueRectangle.addPoint(x, y+size*80/100);
    	  	BlueRectangle.addPoint(x+size*100/100, y+size*80/100);
    	  	BlueRectangle.addPoint(x+size*100/100, y+size*20/100);
    	  f.add(BlueRectangle, 50);	
      }
   	
      public void E(int x, int y, int size){
      	
      }
   	
      public void F(int x, int y, int size){
      	
      }
   	
      public void G(int x, int y, int size){
      	
      }
   	
      public void H(int x, int y, int size){
      	
      }
   	
      public void I(int x, int y, int size){
      	
      }
   	
      public void J(int x, int y, int size){
      	
      }
   	
      public void K(int x, int y, int size){
      	
      }
   	
      public void L(int x, int y, int size){
      	
      }
   	
      public void M(int x, int y, int size){
    	  f.add(new JRectangle(x, y, size, size, Color.white, Color.white), 100);
        	
        	JPolygon BluePartOne = new JPolygon(Color.blue, Color.blue);
        		BluePartOne.addPoint(x+size*10/100,y);
        		BluePartOne.addPoint(x+size*50/100, y+size*40/100);
        		BluePartOne.addPoint(x+size*90/100, y);
        	f.add(BluePartOne, 50);
        	
        	JPolygon BluePartTwo = new JPolygon(Color.blue, Color.blue);
        		BluePartTwo.addPoint(x+size*100/100, y+size*10/100);
        		BluePartTwo.addPoint(x+size*60/100, y+size*50/100);
        		BluePartTwo.addPoint(x+size*100/100, y+size*90/100);
        	f.add(BluePartTwo, 50);	
        	
        	JPolygon BluePartThree = new JPolygon(Color.blue, Color.blue);
        		BluePartThree.addPoint(x+size*10/100, y+size*100/100);
        		BluePartThree.addPoint(x+size*50/100, y+size*60/100);
        		BluePartThree.addPoint(x+size*90/100, y+size*100/100);
        	f.add(BluePartThree, 50);
        	
        	JPolygon BluePartFour = new JPolygon(Color.blue, Color.blue);
        		BluePartFour.addPoint(x, y+size*90/100);
        		BluePartFour.addPoint(x+size*40/100, y+size*50/100);
        		BluePartFour.addPoint(x, y+size*10/100);
        	f.add(BluePartFour, 50);	
        	
      }
   	
      public void N(int x, int y, int size){
      	
      }
   	
      public void O(int x, int y, int size){
      	
      }
   	
      public void P(int x, int y, int size){
      	
      }
   	
      public void Q(int x, int y, int size){
      	
      }
   	
      public void R(int x, int y, int size){
      	
      }
   	
      public void S(int x, int y, int size){
      	
      }
   	
      public void T(int x, int y, int size){
      	
      }
   	
      public void U(int x, int y, int size){
    	  f.add(new JRectangle(x, y, size, size, Color.white, Color.white), 100);
    	  
    	  JPolygon RedSquare1 = new JPolygon(Color.red, Color.red);
    	  	RedSquare1.addPoint(x, y);
    	  	RedSquare1.addPoint(x+size*50/100, y);
    	  	RedSquare1.addPoint(x+size*50/100, y+size*50/100);
    	  	RedSquare1.addPoint(x, y+size*50/100);
    	  f.add(RedSquare1, 50);
    	  
    	  JPolygon RedSquare2 = new JPolygon(Color.red, Color.red);
    	  	RedSquare2.addPoint(x+size*50/100, y+size*50/100);
    	  	RedSquare2.addPoint(x+size*100/100, y+size*50/100);
    	  	RedSquare2.addPoint(x+size*100/100, y+size*100/100);
    	  	RedSquare2.addPoint(x+size*50/100, y+size*100/100);
    	  f.add(RedSquare2, 50);
      	
      }
   	
      public void V(int x, int y, int size){
      	
      }
   	
      public void W(int x, int y, int size){
      	
      }
   	
      public void X(int x, int y, int size){
      	
      }
   	
      public void Y(int x, int y, int size){
      	
      }
   	
      public void Z(int x, int y, int size){
      	
      }
   
      public void FirstSub(int x, int y, int size){
      
         JPolygon BigT = new JPolygon(Color.blue, Color.blue);
         BigT.addPoint(x+size*0/100,   y+size*0/100);
         BigT.addPoint(x+size*100/100, y+size*30/100);
         BigT.addPoint(x+size*0/100,   y+size*60/100);
         f.add(BigT, 50);
      
         JPolygon LittleT = new JPolygon(Color.yellow, Color.yellow);
         LittleT.addPoint(x+size*0/100,  y+size*15/100);
         LittleT.addPoint(x+size*60/100, y+size*30/100);
         LittleT.addPoint(x+size*0/100,  y+size*45/100);
         f.add(LittleT, 50);
      }
   
      public void SecondSub(int x, int y, int size){
      
         JPolygon BigT = new JPolygon(Color.white, Color.white);
         BigT.addPoint(x+size*0/100,   y+size*0/100);
         BigT.addPoint(x+size*100/100, y+size*30/100);
         BigT.addPoint(x+size*0/100,   y+size*60/100);
         f.add(BigT, 50);
      
         JPolygon Trapeziod = new JPolygon(Color.blue, Color.blue);
         Trapeziod.addPoint(x+size*0/100,  y+size*0/100);
         Trapeziod.addPoint(x+size*50/100, y+size*15/100);
         Trapeziod.addPoint(x+size*50/100, y+size*45/100);
         Trapeziod.addPoint(x+size*0/100,  y+size*60/100);
         f.add(Trapeziod, 50);
      }
   
      public void ThirdSub(int x, int y, int size){
      
         JPolygon BigT = new JPolygon(Color.white, Color.white);
         BigT.addPoint(x+size*0/100,   y+size*0/100);
         BigT.addPoint(x+size*100/100, y+size*30/100);
         BigT.addPoint(x+size*0/100,   y+size*60/100);
         f.add(BigT, 50);
      
         JPolygon Arrow = new JPolygon(Color.black, Color.black);
         Arrow.addPoint(x+size*0/100,  y+size*20/100);
         Arrow.addPoint(x+size*66/100, y+size*20/100);
         Arrow.addPoint(x+size*100/100,  y+size*30/100);
         Arrow.addPoint(x+size*66/100, y+size*40/100);
         Arrow.addPoint(x+size*0/100,  y+size*40/100);
         f.add(Arrow, 50);
      }
   
      public void FourthSub(int x, int y, int size){
      
         JPolygon BigT = new JPolygon(Color.red, Color.red);
         BigT.addPoint(x+size*0/100,   y+size*0/100);
         BigT.addPoint(x+size*100/100, y+size*30/100);
         BigT.addPoint(x+size*0/100,   y+size*60/100);
         f.add(BigT, 50);
      
         JPolygon YBlock = new JPolygon(Color.yellow, Color.yellow);
         YBlock.addPoint(x+size*0/100,  y+size*20/100);
         YBlock.addPoint(x+size*25/100,  y+size*20/100);
         YBlock.addPoint(x+size*25/100, y+size*40/100);
         YBlock.addPoint(x+size*0/100,  y+size*40/100);
         f.add(YBlock, 50);
      }
   
   }