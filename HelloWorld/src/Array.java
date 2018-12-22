import java.util.ArrayList;


/**
 * 
 */

/**
 * @author DhivyaViswanathan
 *
 */
public class Array {

	/**
	 * 
	 */
	public Array() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a1[];
ArrayList<String> s=new ArrayList<String>();
ArrayList<String> s1=new ArrayList<String>(s);
s.add("hello");
s.add("world");
s.add("java");
System.out.println(s.size());
System.out.println(s);
s.remove("hello");
System.out.println(s);
System.out.println(s.size());
if(s.contains("java")) {
	System.out.println("...");
}
Object a[] = s.toArray();
for(int i=0;i<a.length;i++) {
	System.out.println(a[i]);
}
for(Object a2 : a) {
	System.out.println(a2);
}



	}
	

}
