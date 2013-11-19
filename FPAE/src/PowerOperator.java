//Sean Daly
//4/17/12
//CMPS 144
//Programming Assignment #4
public class PowerOperator implements BinaryOperator{

	public int apply(Operand x, Operand y){
		int power = 1;
		int product = x.getValue();
		if (y.getValue() == 0){return 1;}
		else while(power < y.getValue()){
			product = product * x.getValue();
			power = power +1;
		}
		return product;
	}
}
