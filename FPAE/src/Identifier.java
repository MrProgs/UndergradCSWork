//Sean Daly
//4/17/12
//CMPS 144
//Programming Assignment #4
public class Identifier implements Operand{
	private static int IDStorage[] = new int[99];
	private String identifier;
	private int IDNumber;
	
	public Identifier(int q){
		identifier = "x"+q;
		IDNumber = q;
	}
	
	public void assignValue(int m){
		IDStorage[IDNumber]=m;
	}
	
	public int getValue(){
		return IDStorage[IDNumber];
	}
	

}
