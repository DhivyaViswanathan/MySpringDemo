package ArrayPrograms;

import java.util.Scanner;

public class SquareDemo {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
//		double n=input.nextDouble();
//		System.out.println(Math.sqrt(n));
		
		int x=0,count=0;
		for(int i=1;x<n;i=i+2) {
			x=x+i;
			count++;
		}
		System.out.println(count);

	}

}
