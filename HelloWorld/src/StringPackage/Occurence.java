package StringPackage;

import java.util.Arrays;
import java.util.Scanner;

public class Occurence{
	public static void main(String args[]) {
		Scanner input=new Scanner(System.in);
//		int number1=input.nextInt();
		int a[]= {1,2,3,4,1,3,5,6,7,2,4};
		Arrays.sort(a);
		int length=a[a.length-1];
		int b[]=new int[length+1];
		for(int i=0;i<a.length;i++) {
			b[a[i]]++;
		}
		int c[]=new int[a.length];
		for(int i=0;i<a.length;i++) {
			c[i]=a[i];
			int find=0;
			for(int j=0;j<=i;j++) {
				if(a[j]==c[i]) {
					find++;
				}
			}
			if(find==1) {
				System.out.println("Occurrence of number"+c[i]+" is :"+b[a[i]]);
			}
		}
	}
}