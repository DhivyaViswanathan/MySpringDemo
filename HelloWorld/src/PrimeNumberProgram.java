import java.util.Scanner;

public class PrimeNumberProgram{
	public static void main(String args[]) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter the limit upto to check prime numbers");
		int n=input.nextInt();
		for(int i=3;i<=n;i++) {
			isPrime(i);
		}
		
		
	}

	private static void isPrime(int number) {
		int i,m,flag=0;
		m=number/2;
		for(i=2;i<=m;i++) {
			
			if(number%i==0) {
				System.out.println(number+" is not a prime");
				flag=1;
				break;
			}
		}
		if(flag==0) {
			System.out.println(number+" is a prime");
		}
			
		
	}

}