import java.util.ArrayList;
import java.util.Iterator;

/**
 * 
 */

/**
 * @author DhivyaViswanathan
 *
 */
public class IteratorClass {

	/**
	 * 
	 */
	public IteratorClass() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Object> a1=new ArrayList<>();
		a1.add("demo");
		a1.add("hiii");
		a1.add("java");
		a1.add("program");
		a1.add("print");
		a1.add(null);
		Iterator<Object> a = a1.iterator();
		while(a.hasNext()) {
			Object value = a.next();
			if(value !=null) {
				if(value.equals("hiii")) {
					a.remove();
				}
			}
		}
		System.out.println(a1);
	}

}
