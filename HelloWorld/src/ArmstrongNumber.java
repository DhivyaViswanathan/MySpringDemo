import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the no to check");
		int n=input.nextInt();
		int num,digit,sum=0;
		num=n;
		while(n!=0) {
			digit=n%10;
			sum=sum+digit*digit*digit;
			n=n/10;
		}
		if(num==sum) {
			System.out.println("The given number is armstrong number");
		}
		else {
			System.out.println("Not armstrong number");
		}
	}

}
