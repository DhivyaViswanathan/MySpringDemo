import java.util.Scanner;

public class FactProgram {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter the limit upto to check prime numbers");
		int n=input.nextInt();
		int factValue=fact(n);
		System.out.println(factValue);
	}

	private static int fact(int number) {
		if(number==0) {
			return 1;
		}
		return number*fact(number-1);
		
	}

//	private static void fact(int number) {
//		int sum=1;
//		while(number!=1) {
//			sum=sum*number;
//			number--;
//		}
//		System.out.println(sum);
//	}
	
	

}
