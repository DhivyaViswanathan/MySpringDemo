import java.util.Scanner;

public class DiamondSpace {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int value=n/2;
		int space=1;
		for(int i=value;i>=0;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<space;k++) {
				System.out.print("* ");
			}
			space++;
			System.out.println();
		}
		for(int i=value;i>=0;i--) {
//			for(int j=1;j<=i)
			System.out.print("* ");
		}
		for(int k=value;k>=space;k--) {
			System.out.print(" ");
		}
		space--;
		System.out.println();
	}

}
