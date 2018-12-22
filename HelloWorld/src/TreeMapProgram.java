import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapProgram {

	public TreeMapProgram() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
TreeMap<Integer, String> t1=new TreeMap<>();
t1.put(3,"anu");
t1.put(2,"balu");
t1.put(6,"cat");
t1.put(4,"dog");
t1.put(1,"eagle");
//Set<Entry<Integer, String>> value = t1.entrySet();
//for(Entry<Integer, String> a1:value) {
//	
//}
System.out.println(t1.get(6));
System.out.println(t1.higherKey(3));
System.out.println(t1.lowerKey(2));
	}

}
