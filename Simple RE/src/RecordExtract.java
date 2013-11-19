/*Sean Daly
 * 2/27/13
 * CMPS 260
 */
import java.lang.Object;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.*;
public class RecordExtract {
	
	public static void main (String args[]) throws IOException{
		readData(); 
	}
	//Reads the input file and extracts first name, last name, and email.
	public static void readData() throws IOException{ 
		/*I made a RE that captures the data that is needed, but I was unsure of how to use the Matcher and/or Pattern 
		 * class to pull it apart and reorder it. So I took apart that single RE and made three that would be easier to manipulate.
		 * The whole Pattern object, which I've commented out contains that original RE. 
		 */
		//Pattern whole = Pattern.compile("((\\s\\w*,)(\\s\\w*\\s)([A-Z].)?\\s?(\\w*@\\w*.(edu)))"); 
		Pattern firstName = Pattern.compile("((\\s\\w*\\s)([A-Z].)?)"); 		//This RE corresponds with a first name from the file.
		Pattern eMail = Pattern.compile("(\\s\\w*@\\w*.(edu))"); 			// Corresponds with the email address.
		Pattern lastName = Pattern.compile("(\\w*,)"); 			//Corresponds with the last name.
		//Matcher entire;
		Matcher a;
		Matcher b;
		Matcher c;
		BufferedReader file = new BufferedReader(new FileReader("StudentData.txt"));
		while(file.ready()){
			String Line = file.readLine(); 				//Creates the string to be tested against the patterns.
			//entire = whole.matcher(Line);
			a = firstName.matcher(Line);
			b = lastName.matcher(Line);
			c = eMail.matcher(Line);
			if(a.find() && b.find() && c.find()){
				String last = b.group();												//This statement and the following one remove the comma
				String lastN = last.substring(0, last.indexOf(",")-1);  // from the last name.
				System.out.println(a.group()+" "+lastN+" - "+c.group()); 
				System.out.println();
			}
			/*if(entire.find()){  //This loop produce the data, but as it is in the data file.
				System.out.println(entire.group());
				System.out.println();
				
			}*/
		}
	}
	
}
