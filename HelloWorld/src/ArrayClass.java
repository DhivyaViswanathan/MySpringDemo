import java.util.ArrayList;
import java.util.List;

public class ArrayClass {

	public ArrayClass() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		int index=0;
		List<Integer> addItemList=new ArrayList<>();
		System.out.println(addItemList.size());
		while(true) {
			if(addItemList.size()<5) {
				addItemList.add(index);
				index++;
				System.out.println(addItemList);
				System.out.println(addItemList.size());
			}
			else {
				addItemList.remove(0);
			}
//			System.out.print(addItemList);
		}
		
//		int sum=0;
//		int a[]= {5,8,10,5,6,8};
//		for(int num:a) {
//			sum=sum+num;
//		}
//		System.out.println(sum);
//		double average=(double)sum/(double)a.length;
//		System.out.println(average);

	}

}
