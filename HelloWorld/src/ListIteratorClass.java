import java.util.ArrayList;
import java.util.ListIterator;

/**
 * 
 */

/**
 * @author DhivyaViswanathan
 *
 */
public class ListIteratorClass {

	/**
	 * 
	 */
	public ListIteratorClass() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a1=new ArrayList<>();
//		int i=0;
		a1.add("raja");
		a1.add("rose");
		a1.add("riddle");
		a1.add("love");
		a1.add("action");
		a1.add("comedy");
		a1.add("devil");
		a1.add("hhh");
		ListIterator<String> value = a1.listIterator();
//		while(value.hasNext()) {
//			if(value.next().equals("devil")) {
//				value.remove();
//				value.set("jaaa");
//			}
			value.next();
////			System.out.println(value.next());
//			if(value.next().equals("rose")) {
//				
//				value.set("lee");
				value.set("dsfgufhewiufhewi");
//				value.add("jj");
//			}
//			value.add(Integer.toString(i++));
//			int index=value.nextIndex();
//			if(index ==1) {
//			}
//		}
//		
		System.out.println(a1);
	}

}
