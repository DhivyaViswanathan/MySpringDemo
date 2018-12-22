package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class PassingObjectIntoArrayLIst {

	public PassingObjectIntoArrayLIst() {
	}

	public static void main(String[] args) {
		DemoList s1=new DemoList(1, "name1", 11);
		DemoList s2=new DemoList(2, "name2", 22);
		DemoList s3=new DemoList(3, "name3", 33);
		ArrayList<DemoList> arrayList=new ArrayList<DemoList>();
		arrayList.add(s1);
		arrayList.add(s2);
		arrayList.add(s3);
		
		Iterator i=arrayList.iterator();
		while(i.hasNext()) {
			DemoList a = (DemoList) i.next();
			System.out.println(a.id+a.name+a.age);
		}

	}

}
class DemoList{
	int id;
	String name;
	int age;
	DemoList(int id,String name,int age){
		this.id=id;
		this.name=name;
		this.age=age;
	}
}
