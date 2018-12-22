import java.util.ArrayList;
import java.util.ListIterator;

public class AddListIterator {

	public AddListIterator() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
	int[] a= {1,2,3,4,5,6};
	ArrayList<Integer> a1=new ArrayList<>();
	ListIterator<Integer> value = a1.listIterator();
	for(int i=0;i<a.length;i++) {
		value.add(a[i]);
	}
for(int text:a) {
	System.out.println(text);
}
	}

}
