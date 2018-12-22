import java.util.Scanner;

public class AscendingProgram {

	public static void main(String[] args) {
		int a[]= {29,3,41,22,8,9};
		sortAsc(a);
	}

	private static void sortAsc(int[] a) {
		int temp;
		for(int i=0;i<a.length-1;i++) {
			for(int j=1;j<a.length-i;j++) {
				if(a[j-1]<a[j]) {
					temp=a[j];
					a[j]=a[j-1];
					a[j-1]=temp;
				}
			}
		}
		for(int i=0;i<a.length-1;i++) {
			System.out.print(a[i]+" ");
		}
		
	}


}
