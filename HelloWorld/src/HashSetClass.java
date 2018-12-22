import java.util.HashSet;

public class HashSetClass {

	public HashSetClass() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String>  h1=new HashSet<>();
		h1.add("1");
		h1.add("2");
		h1.add("3");
		h1.add("1");
		h1.add(null);
		System.out.println(h1);
		System.out.println(h1.size());
		h1.remove("1");
		System.out.println(h1);

	}

}
