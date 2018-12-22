import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 
 */

/**
 * @author DhivyaViswanathan
 *
 */
public class ArraySorting {

	/**
	 * 
	 */
	public ArraySorting() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> l1=new ArrayList<>();
		l1.add("c");
		l1.add("d");
		l1.add("A");
		l1.add("a");
		l1.add("X");
		Collections.sort(l1);
		for(String b:l1) {
			System.out.println(b);
		}
		String arrayObject[]= {"java","hello","apple","APPLE","HELLO","JAVA"};
		Arrays.sort(arrayObject);
		for(String a:arrayObject) {
			System.out.println(a);
		}
	}

}
