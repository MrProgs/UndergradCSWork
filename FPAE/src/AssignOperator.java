//Sean Daly
//4/17/12
//CMPS 144
//Programming Assignment #4
public class AssignOperator implements BinaryOperator{
	
	public int apply(Operand x, Operand y){
		((Identifier) x).assignValue(y.getValue());
		return x.getValue();
	}

}
