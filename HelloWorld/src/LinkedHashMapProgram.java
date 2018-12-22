import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedHashMapProgram {

	public LinkedHashMapProgram() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		LinkedHashMap<Integer, Integer> l1=new LinkedHashMap<>();
		l1.put(1, 1000);
		l1.put(2, 2000);
		l1.put(3, 3000);
		l1.put(4, 10000);
		Set<Entry<Integer, Integer>> value = l1.entrySet();
		for(Entry<Integer, Integer> a1:value) {
			System.out.println(a1);
		}
		System.out.println(l1.get(1));
		System.out.println(l1);
	
	}

}
