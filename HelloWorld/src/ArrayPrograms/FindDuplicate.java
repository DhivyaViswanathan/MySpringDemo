package ArrayPrograms;

import java.util.LinkedHashSet;
import java.util.Set;

public class FindDuplicate {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,9,8,2,5,4,4,1,1};
		Set<Integer> valueSet=new LinkedHashSet<>();
		for(int i=0;i<a.length;i++) {
			int count=0;
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					if(!valueSet.contains(a[i])) {
						valueSet.add(a[i]);
						System.out.println(a[i]);
					}
				}
			}
			if(count==1) {
				System.out.println(a[i]);
			}
		}
	}
}
