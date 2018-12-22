package ArrayPrograms;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int sum=1;
		while(n!=0) {
			sum=sum*n;
			n=n-1;
		}
		System.out.println(sum);

	}

}
