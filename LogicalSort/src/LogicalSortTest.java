   import java.io.*;
import java.util.*;

    class LogicalSortTest{
   
       public static void main(String argv[]) throws IOException {
      	Random r = new Random();
      	ArrayList<Integer> data = new ArrayList<Integer>(500);
			Integer endIndex = 20 + r.nextInt(100);
			Integer startIndex = 0;
			for(Integer i = 0; i<endIndex; i++){
				data.add(i, r.nextInt(10000)-5000);
				//System.out.println(data[i]);
			}
			Comparator<Integer> c = new AscendingInteger();
			LogicalSort<Integer> L = new LogicalSort<Integer>(c);
			ArrayList<Integer> idx = L.order(data, startIndex, endIndex);
			for (Integer i=0; i<endIndex; i++){
				System.out.print(data.get(idx.get(i))+"\t");
				if((i+1)%10 == 0) System.out.println();
			}
			System.out.println();
      }
   }