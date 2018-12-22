import java.util.LinkedList;

/**
 * 
 */

/**
 * @author DhivyaViswanathan
 *
 */
public class LinkedListClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> L1=new LinkedList<>();
		L1.add("java");
		L1.add("program");
		L1.add("hello");
		L1.add("hello");
		L1.addFirst("hiii");
		L1.addLast("demo");
		L1.add(null);
		L1.add(null);
		System.out.println(L1);
		System.out.println(L1.size());
		L1.removeLast();
		L1.remove("java");
		System.out.println(L1);
		System.out.println(L1.size());
		
		Object a[]=L1.toArray();
		for(int i=0;i<L1.size();i++) {
			System.out.println(a[i]);
		}
		 for (Object object1 : a) {
			System.out.print(object1+" ");
			
		}
		 

	}

}
