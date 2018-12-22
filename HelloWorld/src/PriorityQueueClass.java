import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueClass {

	public PriorityQueueClass() {
	}

	public static void main(String[] args) {
		
		PriorityQueue<String> priorityQueue=new PriorityQueue<>();
		priorityQueue.offer("abc");
		priorityQueue.offer("ABS");
		priorityQueue.offer("cs");
		priorityQueue.offer("YR");
		priorityQueue.offer("ZC");
//		priorityQueue.offer(" ");
//		priorityQueue.offer(9);
//		priorityQueue.offer(3);
//		priorityQueue.offer(1);
//		priorityQueue.add(6);
//		priorityQueue.add(2);
		System.out.println(priorityQueue);
//		int a=priorityQueue.poll();
//		while(priorityQueue.poll() !=null) {
//			System.out.println(priorityQueue.poll());
//		}
		for(String i =priorityQueue.poll();i!=null;i=priorityQueue.poll()) {
			System.out.print(i+" ");
		}

	}

}
