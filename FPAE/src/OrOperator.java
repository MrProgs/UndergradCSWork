//Sean Daly
//4/17/12
//CMPS 144
//Programming Assignment #4
public class OrOperator implements BinaryOperator{

	public int apply (Operand x, Operand y){
		if( x.getValue() == x.getValue() || y.getValue() == y.getValue()){return 1;}
		else{return 0;}
	}
}
