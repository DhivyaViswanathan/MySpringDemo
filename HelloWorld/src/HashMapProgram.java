import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapProgram {

	public HashMapProgram() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		HashMap<Integer, String> h1=new HashMap<>();
		h1.put(1, "raj");
		h1.put(2,"chikku");
		h1.put(3, "priya");
		h1.put(4, "reka");
		h1.put(5, "divs");
		System.out.println(h1.get(1));
		Set<Entry<Integer, String>> value = h1.entrySet();
//		for (Entry<Integer, String> a:value) {
//			System.out.print(a.getKey()+" ");
//			System.out.print(a.getValue()+" ");
//			System.out.println(a.hashCode());
//			System.out.println("\n");
//		}
//		System.out.println(h1);
	}

}
