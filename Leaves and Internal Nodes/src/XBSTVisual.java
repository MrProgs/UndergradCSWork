import java.io.*;
	import scranton.visual.*;
	import java.awt.*;
	
public class XBSTVisual {
	private static final int row = 575;
	private static final int col = 1;
	private static final int x= 50;
	private static final int y = 50;
	private static final Color border = Color.black;
	private static final Color fill = Color.green;
	
	public static void main (String args[]){
		VJFrame V = new VJFrame("Tree!");
		//V.add(NodeViz root = new NodeViz(row, col, x, y, border, fill));
		//perhaps make all of this a subprogram called root.
		//Somehow find a way to make other nodes based on the ends of the branches. 
		//Maybe make node, branch, and branch2 fields and update them accordingly.
		//Make one for right subtrees and another for left subtrees. 
		//No, these should have their own class so I can make more instances of them and they can hold
		// their own data! I could add get methods to retrieve coordinate data!!
		JOval node = new JOval(row, col, x, y, border, fill);
		JLine branch = new JLine(row+5, col+19, row-95, col+59, border);
		JLine branch2 = new JLine(row+45, col+19, row+145, col+59, border);
		V.add(node, 50);
		V.add(branch, 50);
		V.add(branch2, 50);
		
	}
	 
	
}
