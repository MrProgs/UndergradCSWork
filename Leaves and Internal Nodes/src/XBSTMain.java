   import scranton.tree.*;
   import java.util.*;
   import java.io.*;
	//import scranton.*;

    public class XBSTMain {

       public static void main(String[] argv) throws IOException{
         Comparator<Integer> c = new AscendingInteger();
         Random r = new Random();
         XBST T = new XBST(c);
         for(int i=0; i<30; i++){
				Integer root = new Integer(1000+r.nextInt(1000));
				//System.out.print(root+"\t");				
            T.insert(root);
         	//System.out.println(order(T));
				//System.out.println(T.toString());
         }
			System.out.println(T.sideways("", '-', 0));
			System.out.println("Leaves = "+T.leafCount());
			System.out.println("Internals = "+T.internalCount());
		}
	}