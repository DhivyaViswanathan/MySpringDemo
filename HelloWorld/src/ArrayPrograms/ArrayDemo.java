package ArrayPrograms;

import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
//		Scanner input=new Scanner(System.in);
//int n=input.nextInt();
		int sum=0;
		int a[]= {1,2,3,4,5,6,7,8,9,10,11,12,13,14};
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}
		int amount=a.length+1;
		System.out.println(amount);
		int exactAmount=amount*(amount+1)/2;
		int missingNo=exactAmount-sum;
		System.out.println(missingNo);
	}
}
