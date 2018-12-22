import java.util.Vector;

public class VectorClass {

	public VectorClass() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Vector<Integer> v1=new Vector<>();
		v1.addElement(1);
		v1.addElement(4);
		v1.addElement(6);
		v1.addElement(2);
		System.out.println(v1);
		System.out.println(v1.firstElement());
		System.out.println(v1.lastElement());
		System.out.println(v1.elementAt(2));
	}
}
