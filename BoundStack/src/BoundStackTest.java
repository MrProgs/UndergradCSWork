
public class BoundStackTest {

	public static void main(String []args){
		BoundStack<Integer> junk = new BoundStack<Integer>(7);
		//System.out.println(junk.topOf());
		for(int i =0; i<4; i++){
			junk.push(i);
		}
		System.out.println(junk.topOf());
		System.out.println(junk.isEmpty());
		System.out.println(junk.isFull());
		System.out.println(junk.pop());
	}
}
