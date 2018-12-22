import java.util.Scanner;

public class PyramidTriangle {

	public PyramidTriangle() {
	}

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
//		for(int i=0;i<=n;i++) {
//			for(int j=n;j>i;j--) {
//					System.out.print("*");
//			}
//			System.out.println();
//		}
		
//		for(int i=0;i<n;i++) {
//			for(int j=1;j<=n;j++) {
//				if(j<n-i) {
//					System.out.print(" ");
//				}
//				else {
//					System.out.print("*");
//				}
//			}
//			System.out.println();
//		}
		for(int i=n;i>0;i--) {
		for(int j=n;j>0;j--) {
			if(j>i) {
				System.out.print(" ");
			}
			else {
				System.out.print("*");
			}
	}
		System.out.println();
	}
	}
}
