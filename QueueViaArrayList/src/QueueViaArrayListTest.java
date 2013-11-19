
public class QueueViaArrayListTest {
	
	public static void main(String [] args){
		QueueViaArrayList queue = new QueueViaArrayList();
		
		queue.insert("Tom");
		queue.insert(12);
		queue.insert(34);
		queue.insert("apples");
		
		System.out.println(queue.size());
		System.out.println(queue.front());
		queue.remove();
		System.out.println(queue.size());
		System.out.println(queue.front());
		System.out.println(queue.isEmpty());
	}

}
