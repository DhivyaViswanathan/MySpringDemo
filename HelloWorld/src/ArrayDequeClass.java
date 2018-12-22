import java.util.ArrayDeque;
import java.util.Iterator;

public class ArrayDequeClass {

	public ArrayDequeClass() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		ArrayDeque<String> d1=new ArrayDeque<>();
		d1.push("hello");
		d1.push("abc");
		d1.push("java");
		d1.add(null);
		System.out.println(d1);
		System.out.println(d1.getFirst());
		System.out.println(d1.getLast());
		System.out.println(d1.pop());
		System.out.println(d1.pop());
		System.out.println(d1);
	}


}
