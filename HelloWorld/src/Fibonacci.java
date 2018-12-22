import java.util.Scanner;

class Fibonacci{
	public static void main(String args[]) {
		System.out.println("enter the no upto fibonacci series to print:");
		int n=new Scanner(System.in).nextInt();
		int f1=0,f2=1,fibo;
		System.out.println(f1);
		System.out.println(f2);
		for(int i=2;i<=n;i++) {
			fibo=f1+f2;
			f1=f2;
			f2=fibo;
			System.out.println(fibo);
		}
	}

}