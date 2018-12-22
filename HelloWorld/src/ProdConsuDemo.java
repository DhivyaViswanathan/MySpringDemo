import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ProdConsuDemo {
	
	static List<Integer> itemsList=new ArrayList();

	public ProdConsuDemo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
new producer().start();
new consumer().start();
	}


static class producer extends Thread{
	int index=0;
	int i=0;
	public void run() {
		while(i<5) {
			 synchronized(itemsList) {
				 
				 if(itemsList.size()<5) {
					 itemsList.add(index);
					 System.out.print(itemsList);
					 index++;
					 i++;
				 }
				 else {
					 itemsList.remove(0);
				 }
				 System.out.println();
			 }
		}
		
	}
}
static class consumer extends Thread{
	int i=0;
public void run() {
	while(i<5) {
		synchronized(itemsList) {
			
			Iterator<Integer> printElements = itemsList.iterator();
			while(printElements.hasNext()) {
				System.out.print(printElements.next()+" ");
			}
			i++;
			System.out.println();
		}
		
	}
	}
}
}