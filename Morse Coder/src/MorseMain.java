
   import java.io.*;
   import java.util.*;

    class MorseMain {
   
       public static void main(String args[]) throws IOException {
         MorseTree MT = new MorseTree();
         BufferedReader inBuf = new BufferedReader(new FileReader("Morse.txt"));
         while (inBuf.ready()){
            String Line = inBuf.readLine();
            //System.out.println(Line);
            MT.insert(Line.substring(0,1), Line.substring(1));
         }
         System.out.println("Code found in the tree\n"+MT.verify());
         BufferedReader Message = new BufferedReader(new FileReader("MorseMessage.txt"));
         while (Message.ready()){
            StringTokenizer Token = new StringTokenizer(Message.readLine(), "/");
            while(Token.hasMoreTokens()){
            //System.out.println(Token.nextToken());
               System.out.print(MT.translate(Token.nextToken()));
            }
            System.out.println();
         }
      }
   }