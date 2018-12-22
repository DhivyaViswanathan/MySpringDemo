package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class ArrayListSampleProgram {

	public ArrayListSampleProgram() {
	}

	public static void main(String[] args) {
		LinkedHashSet linkedHashSet =new LinkedHashSet();
		linkedHashSet.add("helloworld");
	    LinkedList linkedList=new LinkedList();
		linkedList.add(1);
		linkedList.add(2);
		linkedList.add(3);
		linkedList.add("string");
		System.out.println(linkedList.get(1));
		
		ArrayList arrayList=new ArrayList<>();
		arrayList.add(1);
		arrayList.add("hello");
		System.out.println(arrayList.get(1));
		
//arrayList.add("java");
//arrayList.add(linkedList1);
//Iterator i=arrayList.iterator();
//while(i.hasNext()) {
//	System.out.println(i.next());
//}
for(Object s:linkedList) {
	System.out.println(s);
}
	}

}
