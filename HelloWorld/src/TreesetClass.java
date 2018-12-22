import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;

public class TreesetClass  {

	public TreesetClass() {
	}

	public static void main(String[] args) {
		TreeSet<Integer> t1=new TreeSet<Integer>();
		t1.add(1);
		t1.add(5);
		t1.add(6);
		t1.add(3);
		t1.add(2);
		t1.add(4);
		t1.add(7);
		t1.add(9);
		System.out.println(t1);
		System.out.println("sie"+t1.size());
		System.out.println("ceiling"+t1.ceiling(3));
		System.out.println("floor"+t1.floor(3));
		System.out.println("higher"+t1.higher(5));
		System.out.println("lower"+t1.lower(7));
	}

////	@Override
//	public int compare(Integer o1, Integer o2) {
//		return o2.compareTo(o1);
//	}

}
