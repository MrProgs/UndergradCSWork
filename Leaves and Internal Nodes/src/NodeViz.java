import java.io.*;
	import scranton.visual.*;
import java.awt.*;

public class NodeViz {
	private static final int row = 575;
	private static final int line1row = 530;
	private static final int line2row = 670;
	private static final int linecol = 80; 
	private static final int col = 1;
	private static final int x= 50;
	private static final int y = 50;
	private static final Color border = Color.black;
	private static final Color fill = Color.green; 
	
	public NodeViz () {
	JOval node = new JOval(row, col, x, y, border, fill);
	JLine branch = new JLine(row+5, col+39, line1row, linecol, border);
	JLine branch2 = new JLine(row+45, col+39, line2row, linecol, border);
	//V.add(node, 50);
	//V.add(branch, 50);
	//V.add(branch2, 50);
	}
	public int getLineRow(){ //returns the value of row from NodeViz.
		return this.row;
	} //need to decide what to return when they want the end point of the branch.
	
	public int getLineCol(){ //returns the value of row from NodeViz.
		return this.col;
	}//need to decide what to return when they want the end point of the branch.
}
