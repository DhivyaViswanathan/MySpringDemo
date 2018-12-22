package ExceptionHandling;

import java.util.Scanner;

public class ToCheckPrime {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int check=input.nextInt();
		primeCheck(check);

	}

	private static void primeCheck(int check) {
		int count=0;
		for(int i=1;i<=check;i++) {
			if(check%i==0) {
				count++;
			}
		}
		if(check==2) {
			System.out.println(check +"is even prime");
		}
		if(count==2) {
			System.out.println(check+"is prime number");
		}
		else {
			System.out.println("not a prime");
		}
		
	}

}
